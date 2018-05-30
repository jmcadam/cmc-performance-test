package vvtest


import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CMCDefendant extends Simulation {

	val httpProtocol = http
		.baseURL("https://moneyclaim.nonprod.platform.hmcts.net")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())
		.acceptHeader("text/html, application/xhtml+xml, application/xml; q=0.9, */*; q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/17.17134")

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map("Accept" -> "*/*")

    val uri1 = "https://moneyclaim.nonprod.platform.hmcts.net/case/191f7c07-4168-4445-84d5-5826702f1533/response/receipt"

	val scn = scenario("vvtest.CMCDefendant")
		.exec(http("request_0")
			.get("/case/191f7c07-4168-4445-84d5-5826702f1533/response/receipt")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/case/191f7c07-4168-4445-84d5-5826702f1533/response/receipt")
			.headers(headers_1)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}