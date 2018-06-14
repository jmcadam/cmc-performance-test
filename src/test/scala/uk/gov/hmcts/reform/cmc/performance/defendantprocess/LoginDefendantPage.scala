package uk.gov.hmcts.reform.cmc.performance.defendantprocess

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.cookie.CookieJar
import io.gatling.http.cookie._
import uk.gov.hmcts.reform.cmc.performance.processes.LoginPage.{feeder, thinktime}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
//import uk.gov.hmcts.reform.idam.User

import uk.gov.hmcts.reform.cmc.performance.utils._

object LoginDefendantPage {

  val thinktime = Environment.thinkTime
  val jwtCookieName = Environment.idamCookieName
  
    val feeder = csv("IdamUserDataPreprodEnv.csv").circular
   
  //def logIn(user: User)(implicit postHeaders: Map[String, String]): ChainBuilder = {
 val claimNumber =   exec(http("TX02_CMC_Def_Login_ClaimNumber")
       .post("/first-contact/claim-reference")
   .formParam(csrfParameter, csrfTemplate)
   .formParam("reference", "013MC129")
   .check(css(".form-group>input[name='response_type']", "value").saveAs("responseType"))
   .check(css(".form-group>input[name='client_id']", "value").saveAs("clientId"))
   .check(css(".form-group>input[name='state']", "value").saveAs("state"))
     .check(css(".form-group>input[name='scope']", "value").saveAs("scope"))
   .check(css(".form-group>input[name='redirect_uri']", "value").saveAs("redirectUri"))
   .check(CurrentPageCheck.save)
   .check(CsrfCheck.save)
    .check(regex("Please enter your security code to continue"))
 )
      .pause(thinktime)
      .feed(feeder)

  val enterCode =   exec(http("TX03_CMC_Def_Login_LoginPage")
    .post(currentPageTemplate)
    //view-source:https://idam.preprod.ccidam.reform.hmcts.net/login/pin?response_type=code&state=012MC999&client_id=cmc_citizen&redirect_uri=https://moneyclaim.nonprod.platform.hmcts.net/receiver
    .formParam(csrfParameter, csrfTemplate)
    .formParam("pinnumber", "fe4AHTqm")
    .formParam("response_type", "${responseType}")
    .formParam("redirect_uri", "${redirectUri}")
    .formParam("client_id", "${clientId}")
    .formParam("scope", "")
    .formParam("state", "${state}")
    //.check(css(".form-group>input[name='Sign in']", "value").saveAs("continue"))
    .check(CurrentPageCheck.save)
    .check(CsrfCheck.save)
    .check(regex("Claim details"))
  )
    .pause(thinktime)
    .feed(feeder)


  val ClaimSummary =   exec(http("TX04_CMC_Def_FirstContact_ClaimSummary")
    .post(currentPageTemplate)
    //https://moneyclaim.nonprod.platform.hmcts.net/first-contact/claim-summary
    .formParam(csrfParameter, csrfTemplate)
    .check(CurrentPageCheck.save)
    .check(CsrfCheck.save)
    .check(regex("Create an account or sign in"))
  )
    .pause(thinktime)
    .feed(feeder)

    .exec( session => {
      session("gatling.http.cookies").validate[CookieJar].map{
        cookieJar =>
          println(cookieJar)
      }
      session
    })

    .exec(
      session => {
        val jwt: String = session("gatling.http.cookies")
          .as[CookieJar]
          .store
          .values
          .filter(c => c.cookie.getName.equals(jwtCookieName))
          .head
          .cookie
          .getValue

        session.set("jwt", jwt)
      })


  val receiver_get =   exec(http("TX05_CMC_Def_Login_Receiver_Get")
    .get(currentPageTemplate)
    //https://idam.preprod.ccidam.reform.hmcts.net/login/uplift?response_type=code&state=52624&client_id=cmc_citizen&redirect_uri=https://moneyclaim.nonprod.platform.hmcts.net/receiver&
    // jwt=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIydGR2dWswZmUzbnFlN2xiN2QyN3I2bzBhciIsInN1YiI6IjUyNjI0IiwiaWF0IjoxNTI3NjgwODM5LCJleHAiOjE1Mjc3MDk2MzksImRhdGEiOiJsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXItbG9hMCIsInR5cGUiOiJBQ0NFU1MiLCJpZCI6IjUyNjI0IiwiZm9yZW5hbWUiOiJEYW5pZWwgTXVycGh5Iiwic3VybmFtZSI6IiIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MCwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy5tb25leWNsYWltcy5kZW1vLnBsYXRmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoibGV0dGVyLWhvbGRlciJ9.8Bt_Z9jaLsVv_wIX7pUSJ56kniYiPv3lXBKESA3p0BY
    //.check(css(".form-group>input[name='response_type']", "value").saveAs("responseType"))
    .check(css(".form-group>input[name='client_id']", "value").saveAs("clientId"))
    .check(css(".form-group>input[name='state']", "value").saveAs("state"))
    .check(css(".form-group>input[name='redirect_uri']", "value").saveAs("redirectUri"))
    .check(css(".form-group>input[name='upliftToken']", "value").saveAs("upliftToken"))
    .check(CurrentPageCheck.save)
    .check(CsrfCheck.save)

   // .check(css(".form-group>input[name='continue']", "value").saveAs("continue"))
    .check(regex("Sign in"))
    )
    .pause(thinktime)
    .feed(feeder)



  val loginAsDefendant= exec(http("TX06_CMC_Def_Login_As_Defendant")
    .post(currentPageTemplate)
    //https://idam.preprod.ccidam.reform.hmcts.net/login?response_type=code&client_id=cmc_citizen&redirect_uri=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Freceiver&state=52624&upliftToken=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlOTlwcjB2dmx0Y3YwbW5hZGUwYnNpZ3VsMyIsInN1YiI6IjUyNjI0IiwiaWF0IjoxNTI3Njg2NjQ2LCJleHAiOjE1Mjc3MTU0NDYsImRhdGEiOiJsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXItbG9hMCIsInR5cGUiOiJBQ0NFU1MiLCJpZCI6IjUyNjI0IiwiZm9yZW5hbWUiOiJEYW5pZWwgTXVycGh5Iiwic3VybmFtZSI6IiIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MCwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy5tb25leWNsYWltcy5kZW1vLnBsYXRmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoibGV0dGVyLWhvbGRlciJ9.4mjz0BiwUD_2a_yMgTIBMeRGbO-sVMj_r6_Cql-Mpgo
    .formParam(csrfParameter, csrfTemplate)
      .formParam("username", "cmcvv300@mailinator.com")
      .formParam("password", "Pass19word")
    .formParam("response_type", "${responseType}")
    .formParam("continue", "https://moneyclaim.nonprod.platform.hmcts.net/receiver?state=${state}") // tactical idam maps redirect_uri to continue =/
    .formParam("upliftToken", "${upliftToken}")
    .formParam("redirect_uri", "${redirectUri}")
    .formParam("client_id", "${clientId}")
    .formParam("scope", "")
    .formParam("state", "${state}")
    .formParam("selfRegistrationEnabled", "true")
    .check(CurrentPageCheck.save)
    .check(CsrfCheck.save))
   // .check(regex("Find out if you can make a claim using this service")))
    .pause(thinktime)


}
