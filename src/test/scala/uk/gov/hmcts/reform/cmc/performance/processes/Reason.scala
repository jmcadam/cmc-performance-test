package uk.gov.hmcts.reform.cmc.performance.processes

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import uk.gov.hmcts.reform.cmc.performance.utils._

object Reason {
  
  val thinktime = Environment.thinkTime
  
  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    exec(http("TX034_CMC_ClaimDetail_Reason_GET")
      .get("/claim/reason")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Why you’re owed the money")))
      .pause(thinktime)
      
      .exec(http("TX035_CMC_ClaimDetail_Reason_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("reason", "Performance test")
        .check(regex("Check and submit your claim"))
      )
      .pause(thinktime)
  }

}
