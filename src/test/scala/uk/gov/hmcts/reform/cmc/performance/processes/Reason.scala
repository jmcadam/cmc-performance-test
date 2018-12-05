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
        .check(regex("Briefly explain your claim")))
      .pause(thinktime)
      
      .exec(http("TX035_CMC_ClaimDetail_Reason_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("reason", "Performance test")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Timeline of events"))
      )
      .pause(thinktime)

      .exec(http("TX035_CMC_ClaimDetail_Timeline_POST")
        .post("/claim/timeline")
        .formParam(csrfParameter, csrfTemplate)
        .formParam("rows[0][date]", "1 July 2018")
        .formParam("rows[0][description]", "signed a contract")
        .formParam("rows[1][date]", "")
        .formParam("rows[1][description]", "")
        .formParam("rows[2][date]", "")
        .formParam("rows[2][description]", "")
        .formParam("rows[3][date]", "")
        .formParam("rows[3][description]", "")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Evidence"))
      )
      .pause(thinktime)

      .exec(http("TX035.1_CMC_ClaimDetail_Timeline_Evidence_POST")
        .post("/claim/evidence")
        .formParam(csrfParameter, csrfTemplate)
        .formParam("rows[0][type]", "RECEIPTS")
        .formParam("rows[0][description]", "Receipts")
        .formParam("rows[1][type]", "")
        .formParam("rows[1][description]", "")
        .formParam("rows[2][type]", "")
        .formParam("rows[2][description]", "")
        .formParam("rows[3][type]", "")
        .formParam("rows[3][description]", "")
        .check(regex("Check and submit your claim"))
      )
      .pause(thinktime)

  }

}
