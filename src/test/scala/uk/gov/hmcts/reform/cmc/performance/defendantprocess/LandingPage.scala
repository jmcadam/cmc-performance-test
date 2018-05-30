package uk.gov.hmcts.reform.cmc.performance.defendantprocess

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
//import uk.gov.hmcts.reform.idam.User

import uk.gov.hmcts.reform.cmc.performance.utils._

object LandingPage {

  val thinktime = Environment.thinkTime
  
    val feeder = csv("IdamUserDataPreprodEnv.csv").circular
   
  //def logIn(user: User)(implicit postHeaders: Map[String, String]): ChainBuilder = {
 val landingPage =   exec(http("TX01_CMC_Def_LandingPage_Get")
      .get("/first-contact/start")
      .check(CsrfCheck.save)
      .check(regex("Start now")))
      .pause(thinktime)

  val startPage=exec(http("TX01_CMC_Def_LandingPage_Post")
    .post("/first-contact/start")
    .formParam(csrfParameter, csrfTemplate)
    .formParam("start-button", "Start now")
    .check(CurrentPageCheck.save)
    .check(CsrfCheck.save)
    .check(regex("Enter your claim number"))

  )
    .pause(thinktime)

}
