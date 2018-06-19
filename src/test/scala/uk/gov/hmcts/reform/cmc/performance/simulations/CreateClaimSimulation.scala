package uk.gov.hmcts.reform.cmc.performance.simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import scala.concurrent.duration._
import uk.gov.hmcts.reform.cmc.performance.processes._
//import uk.gov.hmcts.reform.cmc.performance.simulations.lifecycle.SimulationHooks
//import uk.gov.hmcts.reform.idam.{User,LoginPage}

import uk.gov.hmcts.reform.cmc.performance.utils._

import scala.concurrent.duration.FiniteDuration

object  CreateClaimSimulation {

  val WaitForNextIteration = Environment.waitForNextIteration

  val httpProtocol: HttpProtocolBuilder = http
    .baseURL(Environment.cmcBashURL)
    .headers(Environment.commonHeader)

  implicit val postHeaders: Map[String, String] = Map(
    "Origin" -> Environment.cmcBashURL
  )

  def createClaimScenario =
    exec(
      LoginPage.logIn,        //  LoginPage.logIn(testUsers.head),
      Eligibility.run,
      ResolvingThisDispute.run,
      CompletingYourClaim.run,
      YourDetails.run,
      TheirDetails.run,
      Amount.run,
      Reason.run,
      CheckAndSend.run
    )

  pace(WaitForNextIteration)

  /*setUp(createClaimScenario
    .inject(rampUsers(1).over(10 seconds))
    .protocols(httpProtocol))
    .maxDuration(90 minutes)
    .assertions(
      global.responseTime.max.lt(5000),
      forAll.failedRequests.count.lt(20)
    )*/

}
