package kjtest

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import io.gatling.core.structure.ChainBuilder
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}

class CMCClaimant extends Simulation {

	val httpProtocol = http
		.baseURL("https://www-dev.moneyclaim.reform.hmcts.net")
	  //.baseURL("https://moneyclaim.nonprod.platform.hmcts.net")
		//.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"4ffd-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_2 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"42b96-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_3 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"419-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"cdc-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_5 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"64f-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_6 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"1f8-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_7 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"22b4-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_8 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 28 Feb 2018 16:10:27 GMT",
		"If-None-Match" -> """W/"587-161dd2de138"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_9 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://idam-test.dev.ccidam.reform.hmcts.net",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_10 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 00:02:47 GMT",
		"If-None-Match" -> """W/"52c0-161dede5385"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_11 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 00:02:47 GMT",
		"If-None-Match" -> """W/"42bb2-161dede5327"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_12 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 00:02:45 GMT",
		"If-None-Match" -> """W/"419-161dede4a6b"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 00:02:46 GMT",
		"If-None-Match" -> """W/"d4c-161dede4cfd"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_14 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 00:02:46 GMT",
		"If-None-Match" -> """W/"a9b-161dede4cbe"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_15 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 00:02:47 GMT",
		"If-None-Match" -> """W/"69a-161dede5375"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_16 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 13:26:11 GMT",
		"If-None-Match" -> """W/"587-161e1bddc9a"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_17 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 13:26:11 GMT",
		"If-None-Match" -> """W/"1f8-161e1bddcb9"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_18 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 01 Mar 2018 13:26:11 GMT",
		"If-None-Match" -> """W/"22b4-161e1bddc9a"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_19 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> """W/"20-sn3orpbGGeGvY7nk+h49KO6JkSI"""",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_20 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"referer" -> "https://moneyclaim.nonprod.platform.hmcts.net/",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_21 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> """W/"21fb-8+BuBBe8EUFh94IfCflz2ciQvZ8"""",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_33 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> """W/"17db-0XIqFsq2vXQmvSxGCbuVIIGQ/CI"""",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_58 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://moneyclaim.nonprod.platform.hmcts.net",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_174 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"If-None-Match" -> """W/"2164-5+k1rUczc7Z46Oh4eJlAseXH348"""",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_439 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_441 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_442 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_447 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"cache-control" -> "max-age=0",
		"content-length" -> "487",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://www.payments.service.gov.uk",
		"referer" -> "https://www.payments.service.gov.uk/card_details/pa96bri1bcpt4p4n5ckfgvfd7i",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_449 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://www.payments.service.gov.uk",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_451 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://www.payments.service.gov.uk",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_460 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"cache-control" -> "max-age=0",
		"content-length" -> "450",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://www.payments.service.gov.uk",
		"referer" -> "https://www.payments.service.gov.uk/card_details/pa96bri1bcpt4p4n5ckfgvfd7i/confirm",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

	val headers_461 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"cache-control" -> "max-age=0",
		"content-length" -> "439",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://www.payments.service.gov.uk",
		"referer" -> "https://www.payments.service.gov.uk/card_details/pa96bri1bcpt4p4n5ckfgvfd7i/confirm",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

    val uri1 = "https://www.payments.service.gov.uk"
    val uri3 = "https://www.google-analytics.com"
    val uri4 = "https://idam-test.dev.ccidam.reform.hmcts.net"
   // val uri4 = "https://idam-test.dev.ccidam.reform.hmcts.net"

	val scn = scenario("CMCClaimant")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			 .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
      .check(css(".form-group>input[name='client_id']", "value").saveAs("clientId"))
      .check(css(".form-group>input[name='state']", "value").saveAs("state"))
      .check(css(".form-group>input[name='redirect_uri']", "value").saveAs("redirectUri"))
      .check(css(".form-group>input[name='continue']", "value").saveAs("continue")))
      .pause(5)
			
		.exec(http("Login - submit_01")
			.post(uri4 + "/login?response_type=code&state=${state}&client_id=${clientId}&redirect_uri=${redirectUri}")
			.headers(headers_9)
			.formParam("username", "civilmoneyclaims+blah4@gmail.com")    //civilmoneyclaims+vivekcmct1@gmail.com
			.formParam("password", "Abcdefg123")    //Password1234
			.formParam("continue", "${redirectUri}?state=${state}")
			.formParam("upliftToken", "")
			.formParam("response_type", "code")
			.formParam("_csrf", "${csrf}")
			.formParam("redirect_uri", "${redirectUri}")
			.formParam("client_id", "${clientId}")
			.formParam("scope", "")
			.formParam("state", "${state}")
			.check(regex("Make a money claim|Make a new money claim")))
		.pause(10)
		
		
		.exec(http("request_21")
			.get("/claim/start")
			.headers(headers_21)
			)
		.pause(3)
		
		
		
		.exec(http("request_33")
			.get("/claim/eligibility")
			.headers(headers_33)
			)
		.pause(3)
		
		
		.exec(http("request_45")
			.get("/claim/eligibility/claim-value")
			)
		.pause(3)
		
		
		.exec(http("request_57")
			.get(uri3 + "/collect?v=1&_v=j66&a=1830095895&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fclaim-value&ul=en-gb&de=UTF-8&dt=Claim%20value%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Select%20claim%20value%20option&el=%C2%A310%2C000%20or%20less&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1264423867")
			.headers(headers_20)
			.resources(http("request_58")
			.post("/claim/eligibility/claim-value")
			.headers(headers_58)
			.formParam("_csrf", "eX0xOJ7C-jfCX3OIZsnETHDRw9m2lBHZA1Ao")
			.formParam("claimValue", "UNDER_10000")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_59")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_60")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_61")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_62")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_63")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_64")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_65")
			.get("/analytics")
			.headers(headers_19),
            http("request_66")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_67")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_68")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_69")
			.get(uri3 + "/collect?v=1&_v=j66&a=673016033&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fhelp-with-fees&ul=en-gb&de=UTF-8&dt=Claimant%20address%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=2000321219")
			.headers(headers_20)))
		.pause(4)
		
		
		.exec(http("request_70")
			.get(uri3 + "/collect?v=1&_v=j66&a=673016033&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fhelp-with-fees&ul=en-gb&de=UTF-8&dt=Claimant%20address%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Select%20claimant%20address%20option&el=No&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1122607896")
			.headers(headers_20)
			.resources(http("request_71")
			.post("/claim/eligibility/help-with-fees")
			.headers(headers_58)
			.formParam("_csrf", "dbGm9Sko-rjc9ntrA3IxJFmm1BErtNGsM16Q")
			.formParam("helpWithFees", "no")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_72")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_73")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_74")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_75")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_76")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_77")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_78")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_79")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_80")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_81")
			.get("/analytics")
			.headers(headers_19),
            http("request_82")
			.get(uri3 + "/collect?v=1&_v=j66&a=242847873&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fclaimant-address&ul=en-gb&de=UTF-8&dt=Claimant%20address%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1939395904")
			.headers(headers_20)))
		.pause(3)
		
		
		.exec(http("request_83")
			.get(uri3 + "/collect?v=1&_v=j66&a=242847873&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fclaimant-address&ul=en-gb&de=UTF-8&dt=Claimant%20address%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Select%20claimant%20address%20option&el=Yes&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=453257997")
			.headers(headers_20)
			.resources(http("request_84")
			.post("/claim/eligibility/claimant-address")
			.headers(headers_58)
			.formParam("_csrf", "ouWVqYzk-04aRpWKQC6iS_lwvXEQt608iP1g")
			.formParam("claimantAddress", "yes")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_85")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_86")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_87")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_88")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_89")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_90")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_91")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_92")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_93")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_94")
			.get("/analytics")
			.headers(headers_19),
            http("request_95")
			.get(uri3 + "/collect?v=1&_v=j66&a=780569730&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fdefendant-address&ul=en-gb&de=UTF-8&dt=Defendant%20address%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=995182975")
			.headers(headers_20)))
		.pause(4)
		
		
		
		.exec(http("request_96")
			.get(uri3 + "/collect?v=1&_v=j66&a=780569730&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fdefendant-address&ul=en-gb&de=UTF-8&dt=Defendant%20address%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Select%20defendant%20address%20option&el=Yes&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1468143947")
			.headers(headers_20)
			.resources(http("request_97")
			.post("/claim/eligibility/defendant-address")
			.headers(headers_58)
			.formParam("_csrf", "uijI8zMY-Y4ApOE1mK6Am8HNbBrK5pu5ffOc")
			.formParam("defendantAddress", "yes")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_98")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_99")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_100")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_101")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_102")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_103")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_104")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_105")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_106")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_107")
			.get("/analytics")
			.headers(headers_19),
            http("request_108")
			.get(uri3 + "/collect?v=1&_v=j66&a=2014674367&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fover-18&ul=en-gb&de=UTF-8&dt=Over%2018%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=364578610")
			.headers(headers_20)))
		.pause(6)
		
		
		.exec(http("request_109")
			.get(uri3 + "/collect?v=1&_v=j66&a=2014674367&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fover-18&ul=en-gb&de=UTF-8&dt=Over%2018%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Select%2018%20or%20over%20option&el=Yes&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=432216888")
			.headers(headers_20)
			.resources(http("request_110")
			.post("/claim/eligibility/over-18")
			.headers(headers_58)
			.formParam("_csrf", "ilBlpoEm-HgkWEvLBcai2iNmKbm7RhhPmll0")
			.formParam("eighteenOrOver", "yes")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_111")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_112")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_113")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_114")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_115")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_116")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_117")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_118")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_119")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_120")
			.get("/analytics")
			.headers(headers_19),
            http("request_121")
			.get(uri3 + "/collect?v=1&_v=j66&a=550763851&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fclaim-type&ul=en-gb&de=UTF-8&dt=Claim%20Type%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=2005515279")
			.headers(headers_20)))
		.pause(3)
		
		
		.exec(http("request_122")
			.get(uri3 + "/collect?v=1&_v=j66&a=550763851&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fclaim-type&ul=en-gb&de=UTF-8&dt=Claim%20Type%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Claim%20Type&el=Just%20myself%20or%20my%20organisation&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=2135592352")
			.headers(headers_20)
			.resources(http("request_123")
			.post("/claim/eligibility/claim-type")
			.headers(headers_58)
			.formParam("_csrf", "8el1PjRm-ukFgDzy7zczS-LkQFUhpoGV3AqQ")
			.formParam("claimType", "PERSONAL_CLAIM")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_124")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_125")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_126")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_127")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_128")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_129")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_130")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_131")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_132")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_133")
			.get("/analytics")
			.headers(headers_19),
            http("request_134")
			.get(uri3 + "/collect?v=1&_v=j66&a=1563569225&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fsingle-defendant&ul=en-gb&de=UTF-8&dt=Single%20Defendant%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1501506897")
			.headers(headers_20)))
		.pause(6)
		
		
		.exec(http("request_135")
			.get(uri3 + "/collect?v=1&_v=j66&a=1563569225&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fsingle-defendant&ul=en-gb&de=UTF-8&dt=Single%20Defendant%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Single%20defendant&el=No&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=949572783")
			.headers(headers_20)
			.resources(http("request_136")
			.post("/claim/eligibility/single-defendant")
			.headers(headers_58)
			.formParam("_csrf", "hgO9zE4B-popRErjvDGQ2bgovs8mfgukCEYc")
			.formParam("singleDefendant", "no")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_137")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_138")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_139")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_140")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_141")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_142")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_143")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_144")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_145")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_146")
			.get("/analytics")
			.headers(headers_19),
            http("request_147")
			.get(uri3 + "/collect?v=1&_v=j66&a=479437058&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fgovernment-department&ul=en-gb&de=UTF-8&dt=Govornment%20department%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=545854865")
			.headers(headers_20)))
		.pause(4)
		
		
		.exec(http("request_148")
			.get(uri3 + "/collect?v=1&_v=j66&a=479437058&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fgovernment-department&ul=en-gb&de=UTF-8&dt=Govornment%20department%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Against%20government%20department%20option&el=No&_u=CACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=266427653")
			.headers(headers_20)
			.resources(http("request_149")
			.post("/claim/eligibility/government-department")
			.headers(headers_58)
			.formParam("_csrf", "iRAx2VeB-PL2EHmKVdXo9x1b77Qh-jYFOsBQ")
			.formParam("governmentDepartment", "no")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_150")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_151")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_152")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_153")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_154")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_155")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_156")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_157")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_158")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_159")
			.get("/analytics")
			.headers(headers_19),
            http("request_160")
			.get(uri3 + "/collect?v=1&_v=j66&a=442957776&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fclaim-is-for-tenancy-deposit&ul=en-gb&de=UTF-8&dt=Is%20claim%20for%20tenancy%20deposit%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1610820794")
			.headers(headers_20)))
		.pause(4)
		
		
		.exec(http("request_161")
			.get(uri3 + "/r/collect?v=1&_v=j66&a=442957776&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Fclaim-is-for-tenancy-deposit&ul=en-gb&de=UTF-8&dt=Is%20claim%20for%20tenancy%20deposit%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&ec=Form&ea=Eligibility%3A%20Select%20claim%20is%20for%20tenancy%20deposit%20option&el=No&_u=CACAAEAB~&jid=15261325&gjid=831897188&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&_r=1&z=1252521401")
			.headers(headers_20)
			.resources(http("request_162")
			.post("/claim/eligibility/claim-is-for-tenancy-deposit")
			.headers(headers_58)
			.formParam("_csrf", "mWR9uTPs-LA6RF7_fsx4NgNmwAaq1PNRmVvA")
			.formParam("claimIsForTenancyDeposit", "no")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_163")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_164")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_165")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_166")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_167")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_168")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_169")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_170")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_171")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_172")
			.get("/analytics")
			.headers(headers_19),
            http("request_173")
			.get(uri3 + "/collect?v=1&_v=j66&a=620727720&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Feligibility%2Feligible&ul=en-gb&de=UTF-8&dt=Eligible%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=692557781")
			.headers(headers_20)))
		.pause(2)
		
		
		.exec(http("request_174")
			.get("/claim/task-list")
			.headers(headers_174)
			.resources(http("request_175")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_176")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_177")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_178")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_179")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_180")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_181")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_182")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_183")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_184")
			.get("/analytics")
			.headers(headers_19),
            http("request_185")
			.get(uri3 + "/collect?v=1&_v=j66&a=1376368444&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Ftask-list&ul=en-gb&de=UTF-8&dt=Task%20list%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=271237484")
			.headers(headers_20)))
		.pause(4)
		
		
		.exec(http("request_186")
			.get("/claim/resolving-this-dispute")
			.headers(headers_0)
			.resources(http("request_187")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_188")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_189")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_190")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_191")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_192")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_193")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_194")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_195")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_196")
			.get("/analytics")
			.headers(headers_19),
            http("request_197")
			.get(uri3 + "/collect?v=1&_v=j66&a=660648769&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Fresolving-this-dispute&ul=en-gb&de=UTF-8&dt=Resolving%20dispute%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1595053075")
			.headers(headers_20)))
		.pause(5)
		
		.exec(http("request_198")
			.post("/claim/resolving-this-dispute")
			.headers(headers_58)
			.formParam("_csrf", "VrIU85Ue-dz_UsDNFHomZHQpHiEgmkv-VyLA")
			.resources(http("request_199")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_200")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_201")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_202")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_203")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_204")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_205")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_206")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_207")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_208")
			.get("/analytics")
			.headers(headers_19),
            http("request_209")
			.get(uri3 + "/collect?v=1&_v=j66&a=1192528115&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Ftask-list&ul=en-gb&de=UTF-8&dt=Task%20list%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=174254170")
			.headers(headers_20)))
		.pause(3)
		.exec(http("request_210")
			.get("/claim/completing-claim")
			.headers(headers_0)
			.resources(http("request_211")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_212")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_213")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_214")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_215")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_216")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_217")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_218")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_219")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_220")
			.get("/analytics")
			.headers(headers_19),
            http("request_221")
			.get(uri3 + "/collect?v=1&_v=j66&a=673945239&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Fcompleting-claim&ul=en-gb&de=UTF-8&dt=Get%20the%20details%20right%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=475678229")
			.headers(headers_20)))
		.pause(3)
		.exec(http("request_222")
			.post("/claim/completing-claim")
			.headers(headers_58)
			.formParam("_csrf", "WpcAxlmO-CgIvZkx7DUO_cWzVVNcaW8k5KYA")
			.resources(http("request_223")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_224")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_225")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_226")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_227")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_228")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_229")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_230")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_231")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_232")
			.get("/analytics")
			.headers(headers_19),
            http("request_233")
			.get(uri3 + "/collect?v=1&_v=j66&a=1925654816&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Ftask-list&ul=en-gb&de=UTF-8&dt=Task%20list%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=17494048")
			.headers(headers_20)))
		.pause(3)
		
		
		.exec(http("request_234")
			.get("/claim/claimant-party-type-selection"))
		.pause(4)
		
		.exec(http("request_246")
			.post("/claim/claimant-party-type-selection")
			.headers(headers_58)
			.formParam("_csrf", "4lC8XZib-YCkj7Y6Fhqt-ci03XAIMUAztzfA")
			.formParam("type", "individual")
			.formParam("saveAndContinue", "Save and continue"))
		.pause(26)
		
		.exec(http("request_258")
			.post("/claim/claimant-individual-details")
			.headers(headers_58)
			.formParam("_csrf", "fsTtchHX-vyT4KJHe0WxKIMaZCpJN07ucttc")
			.formParam("name", "Claimant Full Name")
			.formParam("address[postcodeLookup]", "")
			.formParam("address[line1]", "212")
			.formParam("address[line2]", "")
			.formParam("address[line3]", "")
			.formParam("address[city]", "London")
			.formParam("address[postcode]", "CF10 2HT")
			.formParam("address[addressVisible]", "true")
			.formParam("address[addressSelectorVisible]", "false")
			.formParam("address[enterManually]", "true")
			.formParam("hasCorrespondenceAddress", "false")
			.formParam("correspondenceAddress[postcodeLookup]", "")
			.formParam("correspondenceAddress[line1]", "")
			.formParam("correspondenceAddress[line2]", "")
			.formParam("correspondenceAddress[line3]", "")
			.formParam("correspondenceAddress[city]", "")
			.formParam("correspondenceAddress[postcode]", "")
			.formParam("correspondenceAddress[addressVisible]", "false")
			.formParam("correspondenceAddress[addressSelectorVisible]", "false")
			.formParam("correspondenceAddress[enterManually]", "false")
			.formParam("saveAndContinue", "Save and continue"))
		.pause(10)
		
		.exec(http("request_270")
			.post("/claim/claimant-dob")
			.headers(headers_58)
			.formParam("known", "true")
			.formParam("_csrf", "w4qIa5As-tWMP00snqiTptg_oZpTgaAPg0KI")
			.formParam("date[day]", "31")
			.formParam("date[month]", "3")
			.formParam("date[year]", "1980")
			.formParam("saveAndContinue", "Save and continue"))
		.pause(6)
		
		.exec(http("request_282")
			.post("/claim/claimant-mobile")
			.headers(headers_58)
			.formParam("_csrf", "0U32wkR5-v7ntuMjnNYKrXxQ7C1w9UDER5pM")
			.formParam("number", "02020001002")
			.formParam("saveAndContinue", "Save and continue"))
		.pause(3)
		
		.exec(http("request_294")
			.get("/claim/defendant-party-type-selection")
			.headers(headers_0))
		.pause(6)
		
		.exec(http("request_306")
			.post("/claim/defendant-party-type-selection")
			.headers(headers_58)
			.formParam("_csrf", "nlR63hvC-wJiZWkJejNzRDy-IfRsdsrmMxcU")
			.formParam("type", "individual")
			.formParam("saveAndContinue", "Save and continue")
			)
		.pause(37)
		
		.exec(http("request_318")
			.post("/claim/defendant-individual-details")
			.headers(headers_58)
			.formParam("_csrf", "XURCLszX-u5yVoHfWhuRTBEALPVh39kJeW-8")
			.formParam("name", "Defendant Full Name")
			.formParam("address[postcodeLookup]", "CF10 2HR")
			.formParam("address[line1]", "121")
			.formParam("address[line2]", "")
			.formParam("address[line3]", "")
			.formParam("address[city]", "London")
			.formParam("address[postcode]", "CF10 2HT")
			.formParam("address[addressVisible]", "true")
			.formParam("address[addressSelectorVisible]", "false")
			.formParam("address[enterManually]", "true")
			.formParam("saveAndContinue", "Save and continue")
			)
		.pause(8)
		
		.exec(http("request_330")
			.post("/claim/defendant-email")
			.headers(headers_58)
			.formParam("_csrf", "1XJXVk0m-scayOuYd8W6iWmx2REs5VtSCENo")
			.formParam("address", "defendant@defendant.com")
			.formParam("saveAndContinue", "Save and continue")
		)
		.pause(2)
		
		.exec(http("request_342")
			.get("/claim/amount")
			.headers(headers_0)
			.resources(http("request_343")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_344")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_345")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_346")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_347")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_348")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_349")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_350")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_351")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_352")
			.get("/analytics")
			.headers(headers_19),
            http("request_353")
			.get(uri3 + "/collect?v=1&_v=j66&a=637680235&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Famount&ul=en-gb&de=UTF-8&dt=Claim%20amount&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1395687295")
			.headers(headers_20)))
		.pause(19)
		.exec(http("request_354")
			.post("/claim/amount")
			.headers(headers_58)
			.formParam("_csrf", "4CWy9mOi-j8OBHu_PpUo-x6j8a87a7qh7uKk")
			.formParam("rows[0][reason]", "Performance Test")
			.formParam("rows[0][amount]", "9999")
			.formParam("rows[1][reason]", "")
			.formParam("rows[1][amount]", "")
			.formParam("rows[2][reason]", "")
			.formParam("rows[2][amount]", "")
			.formParam("rows[3][reason]", "")
			.formParam("rows[3][amount]", "")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_355")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_356")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_357")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_358")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_359")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_360")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_361")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_362")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_363")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_364")
			.get("/analytics")
			.headers(headers_19),
            http("request_365")
			.get(uri3 + "/collect?v=1&_v=j66&a=1477090338&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Finterest&ul=en-gb&de=UTF-8&dt=Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1230577833")
			.headers(headers_20)))
		.pause(5)
		.exec(http("request_366")
			.post("/claim/interest")
			.headers(headers_58)
			.formParam("_csrf", "G17nxgY4-jq9fg5cPHZICBdaMSax5666oY68")
			.formParam("rate", "")
			.formParam("reason", "")
			.formParam("type", "no interest")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_367")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_368")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_369")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_370")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_371")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_372")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_373")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_374")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_375")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_376")
			.get("/analytics")
			.headers(headers_19),
            http("request_377")
			.get(uri3 + "/collect?v=1&_v=j66&a=1715675851&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Ffees&ul=en-gb&de=UTF-8&dt=Fees%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=1995465122")
			.headers(headers_20)))
		.pause(2)
		.exec(http("request_378")
			.post("/claim/fees")
			.headers(headers_58)
			.formParam("_csrf", "dd0tXdNu-qDD2PHT_BZed7FQlBrY71pngLuw")
			.resources(http("request_379")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_380")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_381")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_382")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_383")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_384")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_385")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_386")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_387")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_388")
			.get("/analytics")
			.headers(headers_19),
            http("request_389")
			.get(uri3 + "/collect?v=1&_v=j66&a=1713664395&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Ftotal&ul=en-gb&de=UTF-8&dt=Total%20amount%20you%E2%80%99re%20claiming&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=161964053")
			.headers(headers_20)))
		.pause(3)
		.exec(http("request_390")
			.post("/claim/total")
			.headers(headers_58)
			.formParam("_csrf", "ezAKSURn-HdOuNLI1bmWuF46bmx2WH_P-Z68")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_391")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_392")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_393")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_394")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_395")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_396")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_397")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_398")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_399")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_400")
			.get("/analytics")
			.headers(headers_19),
            http("request_401")
			.get(uri3 + "/collect?v=1&_v=j66&a=264075919&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Ftask-list&ul=en-gb&de=UTF-8&dt=Task%20list%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=568217943")
			.headers(headers_20)))
		.pause(3)
		.exec(http("request_402")
			.get("/claim/reason")
			.headers(headers_0)
			.resources(http("request_403")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_404")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_405")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_406")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_407")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_408")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_409")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_410")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_411")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_412")
			.get("/analytics")
			.headers(headers_19),
            http("request_413")
			.get(uri3 + "/collect?v=1&_v=j66&a=1530806613&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Freason&ul=en-gb&de=UTF-8&dt=Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=&gjid=&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&z=2022058170")
			.headers(headers_20)))
		.pause(21)
		.exec(http("request_414")
			.post("/claim/reason")
			.headers(headers_58)
			.formParam("_csrf", "PQchOFpV-Abv-yhHR3cI5cki4d2cVZKYc6-I")
			.formParam("reason", "Performance Testing why owed money")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_415")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_416")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_417")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_418")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_419")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_420")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_421")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_422")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_423")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_424")
			.get("/analytics")
			.headers(headers_19),
            http("request_425")
			.get(uri3 + "/r/collect?v=1&_v=j66&a=707244329&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2Ftask-list&ul=en-gb&de=UTF-8&dt=Task%20list%20%7C%20Money%20claim&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=1596672394&gjid=830734077&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&_r=1&z=2064571836")
			.headers(headers_20)))
		.pause(3)
		
		
		
		.exec(http("request_426")
			.get("/claim/check-and-send")
			)
		.pause(8)
		
		.exec(http("request_438")
			.post("/claim/check-and-send")
			.headers(headers_58)
			.formParam("_csrf", "NlTPgy32-GmWhciRaOTNyYoEnGAFyheS-Qb8")
			.formParam("signed", "true")
			.formParam("type", "basic")
			.resources(http("request_439")
			.get(uri1 + "/public/stylesheets/govuk-template.css?0.22.5")
			.headers(headers_439),
            http("request_440")
			.get(uri1 + "/public/stylesheets/fonts.css?0.22.3")
			.headers(headers_439),
            http("request_441")
			.get(uri1 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.22.5")
			.headers(headers_441),
            http("request_442")
			.get(uri1 + "/public/javascripts/govuk-template.js?0.22.5")
			.headers(headers_442),
            http("request_443")
			.get(uri1 + "/public/stylesheets/govuk-template-print.css?0.22.5")
			.headers(headers_439),
            http("request_444")
			.get(uri1 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.22.5")
			.headers(headers_441),
            http("request_445")
			.get(uri1 + "/public/stylesheets/images/open-government-licence_2x.png?0.22.5")
			.headers(headers_441),
            http("request_446")
			.get(uri1 + "/public/stylesheets/images/govuk-crest-2x.png?0.22.5")
			.headers(headers_441),
            http("request_447")
			.post(uri3 + "/r/collect")
			.headers(headers_447)
			.body(RawFileBody("CMCClaimant_0447_request.txt")),
            http("request_448")
			.get(uri1 + "/public/countries-autocomplete-graph.json")
			.headers(headers_442)))
		.pause(10)
		
		
		.exec(http("request_449")
			.post(uri1 + "/check_card/pa96bri1bcpt4p4n5ckfgvfd7i")
			.headers(headers_449)
			.formParam("cardNo", "4444333322221111"))
		.pause(52)
		.exec(http("request_450")
			.post(uri1 + "/check_card/pa96bri1bcpt4p4n5ckfgvfd7i")
			.headers(headers_449)
			.formParam("cardNo", "4444333322221111"))
		.pause(1)
		.exec(http("request_451")
			.post(uri1 + "/card_details/pa96bri1bcpt4p4n5ckfgvfd7i")
			.headers(headers_451)
			.formParam("chargeId", "pa96bri1bcpt4p4n5ckfgvfd7i")
			.formParam("csrfToken", "E6uQ14yQ-9KBSYkkKEckTt-L8vQhy_jRW5Ls")
			.formParam("cardNo", "4444333322221111")
			.formParam("expiryMonth", "10")
			.formParam("expiryYear", "18")
			.formParam("cardholderName", "Performance Test Credit Card")
			.formParam("cvc", "123")
			.formParam("addressCountry", "GB")
			.formParam("addressLine1", "123")
			.formParam("addressLine2", "")
			.formParam("addressCity", "London")
			.formParam("addressPostcode", "CF10 2HT")
			.formParam("email", "confirmation@confirmation.com")
			.resources(http("request_452")
			.get(uri1 + "/public/stylesheets/govuk-template.css?0.22.5")
			.headers(headers_439),
            http("request_453")
			.get(uri1 + "/public/stylesheets/fonts.css?0.22.3")
			.headers(headers_439),
            http("request_454")
			.get(uri1 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.22.5")
			.headers(headers_441),
            http("request_455")
			.get(uri1 + "/public/javascripts/govuk-template.js?0.22.5")
			.headers(headers_442),
            http("request_456")
			.get(uri1 + "/public/stylesheets/govuk-template-print.css?0.22.5")
			.headers(headers_439),
            http("request_457")
			.get(uri1 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.22.5")
			.headers(headers_441),
            http("request_458")
			.get(uri1 + "/public/stylesheets/images/open-government-licence_2x.png?0.22.5")
			.headers(headers_441),
            http("request_459")
			.get(uri1 + "/public/stylesheets/images/govuk-crest-2x.png?0.22.5")
			.headers(headers_441),
            http("request_460")
			.post(uri3 + "/r/collect")
			.headers(headers_460)
			.body(RawFileBody("CMCClaimant_0460_request.txt"))))
		.pause(7)
		.exec(http("request_461")
			.post(uri3 + "/collect")
			.headers(headers_461)
			.body(RawFileBody("CMCClaimant_0461_request.txt")))
		.pause(9)
		.exec(http("request_462")
			.post(uri1 + "/card_details/pa96bri1bcpt4p4n5ckfgvfd7i/confirm")
			.headers(headers_451)
			.formParam("csrfToken", "eiq1pN5B-D8-mrAyanM9CnXbkB8-h3KFz1W8")
			.formParam("chargeId", "pa96bri1bcpt4p4n5ckfgvfd7i")
			.resources(http("request_463")
			.get("/stylesheets/lib/govuk-template.css?0.23.0")
			.headers(headers_10),
            http("request_464")
			.get("/stylesheets/lib/fonts.css?0.23.0")
			.headers(headers_11),
            http("request_465")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_12),
            http("request_466")
			.get("/js/lib/govuk-template.js?0.23.0")
			.headers(headers_13),
            http("request_467")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_14),
            http("request_468")
			.get("/stylesheets/lib/govuk-template-print.css?0.23.0")
			.headers(headers_15),
            http("request_469")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_16),
            http("request_470")
			.get("/stylesheets/lib/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_17),
            http("request_471")
			.get("/stylesheets/lib/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_18),
            http("request_472")
			.get("/analytics")
			.headers(headers_19),
            http("request_473")
			.get(uri3 + "/r/collect?v=1&_v=j66&a=1373816832&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fclaim%2F8a7cb85f-6746-43b7-a1dd-533d3f086c96%2Fconfirmation&dr=https%3A%2F%2Fwww.payments.service.gov.uk%2F&ul=en-gb&de=UTF-8&dt=Claim%20confirmation&sd=24-bit&sr=1440x900&vp=1185x424&je=0&_u=AACAAEAB~&jid=723278267&gjid=1974902314&cid=2002960063.1519895273&tid=UA-97111056-1&_gid=1580373941.1519895273&_r=1&z=1304803383")
			.headers(headers_20)))
		.pause(43)
		.exec(http("request_474")
			.get("/logout")
			.headers(headers_0)
			.resources(http("request_475")
			.get(uri4 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_8),
            http("request_476")
			.get(uri4 + "/public/stylesheets/images/open-government-licence_2x.png?0.23.0")
			.headers(headers_6),
            http("request_477")
			.get(uri4 + "/public/stylesheets/images/govuk-crest-2x.png?0.23.0")
			.headers(headers_7)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}