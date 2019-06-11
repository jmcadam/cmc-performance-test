package uk.gov.hmcts.reform.cmc.performance.processes

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import uk.gov.hmcts.reform.cmc.performance.utils._

object CompletingYourClaim {

  val thinktime = Environment.thinkTime
  
  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    exec(http("TX017_CMC_Completingclaim_CompletingClaim-GET")
      .get("/claim/completing-claim")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Get the details right")))
      .pause(thinktime)
      
      .exec(http("TX018_CMC_Completingclaim_CompletingClaim-POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .check(regex("Prepare your claim"))
      )
      .pause(thinktime)
  }

}
