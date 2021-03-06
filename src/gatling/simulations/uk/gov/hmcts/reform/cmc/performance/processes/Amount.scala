package uk.gov.hmcts.reform.cmc.performance.processes

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import scala.util._
import uk.gov.hmcts.reform.cmc.performance.utils._

object Amount {

  val TotalAmount = scala.util.Random.nextInt(9999)
  val thinktime = Environment.thinkTime
   
  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    exec(http("TX028_CMC_ClaimAmout_ClaimAmount_GET")
      .get("/claim/amount")
      .check(CsrfCheck.save)
      .check(CurrentPageCheck.save)
      .check(regex("Your claim could be for a single amount or made up of multiple items")))
      .pause(thinktime)
      .exec(http("TX029_CMC_ClaimAmout_ClaimAmount_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("rows[0][reason]", "Performance test cmc on sprod")
        .formParam("rows[0][amount]", Amount.TotalAmount)
        .formParam("rows[1][reason]", "")
        .formParam("rows[1][amount]", "")
        .formParam("rows[2][reason]", "")
        .formParam("rows[2][amount]", "")
        .formParam("rows[3][reason]", "")
        .formParam("rows[3][amount]", "")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Do you want to claim interest")))
      .pause(thinktime)
      
      .exec(http("TX030_CMC_ClaimAmout_Interest_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
       // .formParam("rate", "")
       // .formParam("reason", "")
      //  .formParam("type", "no interest")
        .formParam("option", "no")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Total amount you’re claiming")))
      .pause(thinktime)
      
   /*   .exec(http("TX032_CMC_ClaimAmout_Fees_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Total amount you’re claiming")))
      .pause(thinktime)
      */

      .exec(http("TX031_CMC_ClaimAmout_TotalAmount_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .check(regex("Claim details"))
      )
      .pause(thinktime)
  }

}
