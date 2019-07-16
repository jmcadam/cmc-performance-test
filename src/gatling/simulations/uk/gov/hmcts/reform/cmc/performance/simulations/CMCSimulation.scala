package uk.gov.hmcts.reform.cmc.performance.simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef.{Proxy, http}
import io.gatling.http.protocol.HttpProtocolBuilder
import uk.gov.hmcts.reform.cmc.performance.utils.Environment

class CMCSimulation extends Simulation
     {

       val httpProtocol: HttpProtocolBuilder = http.proxy(Proxy("proxyout.reform.hmcts.net", 8080))
         .baseUrl(Environment.cmcBashURL)
         .headers(Environment.commonHeader)

       implicit val postHeaders: Map[String, String] = Map(
         "Origin" -> Environment.cmcBashURL
       )
       val scenario1 = scenario("Create Claim Journey")
         .exec(CreateClaimSimulation.createClaimScenario)

       val scenario2 = scenario("Basic Divorce Not Completed")
         .exec(CreateDefendantSimulation.createDefendantScenario)

       /*setUp(
         scenario1.inject(
           atOnceUsers(1)).protocols(httpProtocol))*/

         /*setUp(scenario1
           .inject(
           rampUsers(1).over(10 seconds))
           .protocols(httpProtocol))
           .maxDuration(90 minutes)
           .assertions(
               global.responseTime.max.lt(5000),
               forAll.failedRequests.count.lt(20)*/


       setUp(scenario1
         .inject(
           rampUsers(10) during (200))
         .protocols(httpProtocol))
         .maxDuration(5400)
        /* .assertions(
           global.responseTime.max.lt(5000),
           forAll.failedRequests.count.lt(20)
         )*/

       /*setUp(scenario1
         .inject(
           rampUsers(714) over (1200))
         .protocols(httpProtocol))
         .maxDuration(7200)*/

}