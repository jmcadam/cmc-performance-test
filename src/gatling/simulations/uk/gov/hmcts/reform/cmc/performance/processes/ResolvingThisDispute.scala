package uk.gov.hmcts.reform.cmc.performance.processes

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import uk.gov.hmcts.reform.cmc.performance.utils._

object ResolvingThisDispute {

  val thinktime = Environment.thinkTime
  
  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {



    /*exec(http("TX015_CMC_ResolvingThisDispute_Tasklist")
      .get("/claim/task-list")
      .check(regex("Before you start")))
      .pause(thinktime)*/
      
      exec(http("TX015_CMC_ResolvingThisDispute_ResolvingThisDispute-GET")
        .get("/claim/resolving-this-dispute")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Try to resolve the dispute")))
      .pause(thinktime)
      
      .exec(http("TX016_CMC_ResolvingThisDispute_ResolvingThisDispute-POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .check(regex("Prepare your claim"))
      )
      .pause(thinktime)
  }

}
