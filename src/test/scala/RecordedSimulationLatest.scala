
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulationLatest extends Simulation {

	val httpProtocol = http
		.baseURL("https://moneyclaim.nonprod.platform.hmcts.net")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_1 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cookie" -> "CONSENT=WP.26d711.26d8af; SID=LAZVr-SaQ8vu6h4KO30BmZisM8jDJhrBEEoFaNllYfst8mFHN12OTm0FO25XP8TLSzrBYg.; HSID=AwFOUY2CI8gOKghJF; SSID=AAT83TkrEXtgQjK01; APISID=kQsrCF5r0v1678wW/AjWAvk1dzvptN5OjG; SAPISID=oeFD1cvblkj4F02H/AqKk22KtliwtgRpDP; NID=131=JkHN8-JxuzPv_F0orm9kEdAAV_9kGb3jkyoKN60bDfK9GaUORVAyHTkPP50Dl0ceSQKne9IZo9JY9QOc53BBFS-jCnwbcmV05PlOXtHX3zjn9lkJbIFlGVKg-3-QFj6-Kn17_cf5BkWDVqe3RzQIlptqvkB3R_QL5qdof7Rt-Q-Khy2dgT9flwal4VgXQJLBaUTYvg18Tb52O4Fsfmm4-nCpmb6p5SIFo7chkis2ePqtrVN7gi-yo0RVfwCC9YXUf5eRCWUsx18dGtojqg; 1P_JAR=2018-5-30-13",
		"referer" -> "https://www.google.co.uk/_/chrome/newtab?rlz=1C1EKKP_enGB778GB778&ie=UTF-8",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36",
		"x-client-data" -> "CIW2yQEIo7bJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_3 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"52c1-1632038f7df"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_4 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"7e1-1632038f6e5"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_5 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:13 GMT",
		"If-None-Match" -> """W/"419-1622fed263b"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"e08-1632038f6d6"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_7 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:14 GMT",
		"If-None-Match" -> """W/"a9b-1622fed2a42"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_8 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:17 GMT",
		"If-None-Match" -> """W/"69a-1622fed34a7"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_9 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 29 May 2018 08:49:58 GMT",
		"If-None-Match" -> """W/"e00-163ab16f68a"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_10 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 29 May 2018 08:49:58 GMT",
		"If-None-Match" -> """W/"2f9-163ab16f69a"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_11 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 29 May 2018 08:49:58 GMT",
		"If-None-Match" -> """W/"587-163ab16f67a"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_12 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"1093c-1632038f753"""",
		"Origin" -> "https://moneyclaim.nonprod.platform.hmcts.net",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"d884-1632038f743"""",
		"Origin" -> "https://moneyclaim.nonprod.platform.hmcts.net",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_14 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_15 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"referer" -> "https://moneyclaim.nonprod.platform.hmcts.net/",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_16 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://moneyclaim.nonprod.platform.hmcts.net",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_31 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"4ffd-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_32 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"42b96-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_33 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"419-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_34 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"cdc-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_35 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"64f-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_36 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"e00-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_37 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"2f9-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_38 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"587-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_39 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://idam.preprod.ccidam.reform.hmcts.net",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

    val uri1 = "https://idam.preprod.ccidam.reform.hmcts.net"
    val uri2 = "https://www.google.co.uk/gen_204"
    val uri4 = "https://www.google-analytics.com"

	val scn = scenario("RecordedSimulationLatest")
		.exec(http("request_0")
			.get(uri2 + "?atyp=i&ct=nfkbx&cad=&ei=ptsLW9H5Ec6ZsAex67GgCw&zx=1527686457296")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri2 + "?atyp=i&ct=nfkbx&cad=&ei=ptsLW9H5Ec6ZsAex67GgCw&zx=1527686457296")
			.headers(headers_1)))
		.pause(1)
		.exec(http("request_2")
			.get("/first-contact/start")
			.headers(headers_2)
			.resources(http("request_3")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_4")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_5")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_6")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_7")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_8")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_9")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_10")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_11")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_12")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_13")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_14")
			.get("/analytics")
			.headers(headers_14),
            http("request_15")
			.get(uri4 + "/collect?v=1&_v=j68&a=616705543&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Ffirst-contact%2Fstart&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1016218813")
			.headers(headers_15)))
		.pause(10)
		.exec(http("request_16")
			.post("/first-contact/start")
			.headers(headers_16)
			.formParam("_csrf", "Pv1iJQyk-rVDRPUTcDHmLpWt9Kgd7bMJ2ApA")
			.formParam("start-button", "Start now")
			.resources(http("request_17")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_18")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_19")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_20")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_21")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_22")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_23")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_24")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_25")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_26")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_27")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_28")
			.get("/analytics")
			.headers(headers_14),
            http("request_29")
			.get(uri4 + "/collect?v=1&_v=j68&a=731206765&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Ffirst-contact%2Fclaim-reference&ul=en-us&de=UTF-8&dt=Enter%20your%20claim%20number%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=677949932")
			.headers(headers_15)))
		.pause(16)
		.exec(http("request_30")
			.post("/first-contact/claim-reference")
			.headers(headers_16)
			.formParam("_csrf", "vc7EEv9F-9t8aPp7FCM3tWWojrncYdoOmRgk")
			.formParam("reference", "012MC999")
			.resources(http("request_31")
			.get(uri1 + "/public/stylesheets/govuk-template.css?0.23.0")
			.headers(headers_31),
            http("request_32")
			.get(uri1 + "/public/stylesheets/fonts.css?0.23.0")
			.headers(headers_32),
            http("request_33")
			.get(uri1 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_33),
            http("request_34")
			.get(uri1 + "/public/javascripts/govuk-template.js?0.23.0")
			.headers(headers_34),
            http("request_35")
			.get(uri1 + "/public/stylesheets/govuk-template-print.css?0.23.0")
			.headers(headers_35),
            http("request_36")
			.get(uri1 + "/public/stylesheets/images/govuk-crest.png?0.23.0")
			.headers(headers_36),
            http("request_37")
			.get(uri1 + "/public/stylesheets/images/open-government-licence.png?0.23.0")
			.headers(headers_37),
            http("request_38")
			.get(uri1 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_38)))
		.pause(158)
		.exec(http("request_39")
			.post(uri1 + "/login/pin?response_type=code&state=012MC999&client_id=cmc_citizen&redirect_uri=https://moneyclaim.nonprod.platform.hmcts.net/receiver")
			.headers(headers_39)
			.formParam("pinnumber", "dVnpKEE6")
			.formParam("response_type", "code")
			.formParam("_csrf", "XEUn8THR-K8eA4lkNXrlDT49JHz9vOoXLXlM")
			.formParam("redirect_uri", "https://moneyclaim.nonprod.platform.hmcts.net/receiver")
			.formParam("client_id", "cmc_citizen")
			.formParam("scope", "")
			.formParam("state", "012MC999")
			.resources(http("request_40")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_41")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_42")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_43")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_44")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_45")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8)))
		.pause(1)
		.exec(http("request_46")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9)
			.resources(http("request_47")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_48")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_49")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_50")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_51")
			.get("/analytics")
			.headers(headers_14),
            http("request_52")
			.get(uri4 + "/r/collect?v=1&_v=j68&a=561982903&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Ffirst-contact%2Fclaim-summary&dr=https%3A%2F%2Fidam.preprod.ccidam.reform.hmcts.net%2F&ul=en-us&de=UTF-8&dt=Claim%20details%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=330828938&gjid=1454205382&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&_r=1&z=2141204068")
			.headers(headers_15)))
		.pause(392)
		.exec(http("request_53")
			.post("/first-contact/claim-summary")
			.headers(headers_16)
			.formParam("_csrf", "J95Nrs2E-eQ6iazxZyuH-9xgURVMUXqnMruM")
			.resources(http("request_54")
			.get(uri1 + "/public/stylesheets/govuk-template.css?0.23.0")
			.headers(headers_31),
            http("request_55")
			.get(uri1 + "/public/stylesheets/fonts.css?0.23.0")
			.headers(headers_32),
            http("request_56")
			.get(uri1 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_33),
            http("request_57")
			.get(uri1 + "/public/javascripts/govuk-template.js?0.23.0")
			.headers(headers_34),
            http("request_58")
			.get(uri1 + "/public/stylesheets/govuk-template-print.css?0.23.0")
			.headers(headers_35),
            http("request_59")
			.get(uri1 + "/public/stylesheets/images/govuk-crest.png?0.23.0")
			.headers(headers_36),
            http("request_60")
			.get(uri1 + "/public/stylesheets/images/open-government-licence.png?0.23.0")
			.headers(headers_37),
            http("request_61")
			.get(uri1 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_38)))
		.pause(153)
		.exec(http("request_62")
			.get(uri1 + "/login?response_type=code&client_id=cmc_citizen&redirect_uri=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Freceiver&state=52624&upliftToken=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlOTlwcjB2dmx0Y3YwbW5hZGUwYnNpZ3VsMyIsInN1YiI6IjUyNjI0IiwiaWF0IjoxNTI3Njg2NjQ2LCJleHAiOjE1Mjc3MTU0NDYsImRhdGEiOiJsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXItbG9hMCIsInR5cGUiOiJBQ0NFU1MiLCJpZCI6IjUyNjI0IiwiZm9yZW5hbWUiOiJEYW5pZWwgTXVycGh5Iiwic3VybmFtZSI6IiIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MCwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy5tb25leWNsYWltcy5kZW1vLnBsYXRmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoibGV0dGVyLWhvbGRlciJ9.4mjz0BiwUD_2a_yMgTIBMeRGbO-sVMj_r6_Cql-Mpgo")
			.headers(headers_2)
			.resources(http("request_63")
			.get(uri1 + "/public/stylesheets/govuk-template.css?0.23.0")
			.headers(headers_31),
            http("request_64")
			.get(uri1 + "/public/stylesheets/fonts.css?0.23.0")
			.headers(headers_32),
            http("request_65")
			.get(uri1 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_33),
            http("request_66")
			.get(uri1 + "/public/stylesheets/govuk-template-print.css?0.23.0")
			.headers(headers_35),
            http("request_67")
			.get(uri1 + "/public/javascripts/govuk-template.js?0.23.0")
			.headers(headers_34),
            http("request_68")
			.get(uri1 + "/public/stylesheets/images/govuk-crest.png?0.23.0")
			.headers(headers_36),
            http("request_69")
			.get(uri1 + "/public/stylesheets/images/open-government-licence.png?0.23.0")
			.headers(headers_37),
            http("request_70")
			.get(uri1 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_38)))
		.pause(177)
		.exec(http("request_71")
			.post(uri1 + "/login?response_type=code&client_id=cmc_citizen&redirect_uri=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Freceiver&state=52624&upliftToken=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlOTlwcjB2dmx0Y3YwbW5hZGUwYnNpZ3VsMyIsInN1YiI6IjUyNjI0IiwiaWF0IjoxNTI3Njg2NjQ2LCJleHAiOjE1Mjc3MTU0NDYsImRhdGEiOiJsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXItbG9hMCIsInR5cGUiOiJBQ0NFU1MiLCJpZCI6IjUyNjI0IiwiZm9yZW5hbWUiOiJEYW5pZWwgTXVycGh5Iiwic3VybmFtZSI6IiIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MCwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy5tb25leWNsYWltcy5kZW1vLnBsYXRmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoibGV0dGVyLWhvbGRlciJ9.4mjz0BiwUD_2a_yMgTIBMeRGbO-sVMj_r6_Cql-Mpgo")
			.headers(headers_39)
			.formParam("username", "cmcvv110@mailinator.com")
			.formParam("password", "Pass19word")
			.formParam("continue", "https://moneyclaim.nonprod.platform.hmcts.net/receiver?state=52624")
			.formParam("upliftToken", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlOTlwcjB2dmx0Y3YwbW5hZGUwYnNpZ3VsMyIsInN1YiI6IjUyNjI0IiwiaWF0IjoxNTI3Njg2NjQ2LCJleHAiOjE1Mjc3MTU0NDYsImRhdGEiOiJsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXItbG9hMCIsInR5cGUiOiJBQ0NFU1MiLCJpZCI6IjUyNjI0IiwiZm9yZW5hbWUiOiJEYW5pZWwgTXVycGh5Iiwic3VybmFtZSI6IiIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MCwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy5tb25leWNsYWltcy5kZW1vLnBsYXRmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoibGV0dGVyLWhvbGRlciJ9.4mjz0BiwUD_2a_yMgTIBMeRGbO-sVMj_r6_Cql-Mpgo")
			.formParam("response_type", "code")
			.formParam("_csrf", "1UYaSaCg-ua9850O-TwhZ1veZZF1lQP2aI7c")
			.formParam("redirect_uri", "https://moneyclaim.nonprod.platform.hmcts.net/receiver")
			.formParam("client_id", "cmc_citizen")
			.formParam("scope", "")
			.formParam("state", "52624")
			.formParam("selfRegistrationEnabled", "true")
			.resources(http("request_72")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_73")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_74")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_75")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_76")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_77")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_78")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_79")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_80")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_81")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_82")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_83")
			.get("/analytics")
			.headers(headers_14),
            http("request_84")
			.get(uri4 + "/r/collect?v=1&_v=j68&a=1433127533&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fdashboard&dr=https%3A%2F%2Fidam.preprod.ccidam.reform.hmcts.net%2F&ul=en-us&de=UTF-8&dt=Your%20money%20claims%20account%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=38098588&gjid=1312594372&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&_r=1&z=2032935282")
			.headers(headers_15)))
		.pause(6)
		.exec(http("request_85")
			.get("/dashboard/6e99f589-5a25-4abf-976a-49622380d6bf/defendant")
			.headers(headers_2)
			.resources(http("request_86")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_87")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_88")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_89")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_90")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_91")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_92")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_93")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_94")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_95")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_96")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_97")
			.get("/analytics")
			.headers(headers_14),
            http("request_98")
			.get(uri4 + "/collect?v=1&_v=j68&a=170857225&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fdashboard%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fdefendant&ul=en-us&de=UTF-8&dt=Claim%20status%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1262238239")
			.headers(headers_15)))
		.pause(6)
		.exec(http("request_99")
			.get("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/task-list")
			.headers(headers_2)
			.resources(http("request_100")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_101")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_102")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_103")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_104")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_105")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_106")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_107")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_108")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_109")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_110")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_111")
			.get("/analytics")
			.headers(headers_14),
            http("request_112")
			.get(uri4 + "/collect?v=1&_v=j68&a=1696371007&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ftask-list&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=379552667")
			.headers(headers_15)))
		.pause(5)
		.exec(http("request_113")
			.get("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/your-details")
			.headers(headers_2)
			.resources(http("request_114")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_115")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_116")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_117")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_118")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_119")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_120")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_121")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_122")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_123")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_124")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_125")
			.get("/analytics")
			.headers(headers_14),
            http("request_126")
			.get(uri4 + "/collect?v=1&_v=j68&a=217532667&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fyour-details&ul=en-us&de=UTF-8&dt=Confirm%20your%20details%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=13149378")
			.headers(headers_15)))
		.pause(12)
		.exec(http("request_127")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/your-details")
			.headers(headers_16)
			.formParam("_csrf", "Y9FxugWa-_WqMqm7UHfgs312zl4JDrifwZWU")
			.formParam("type", "individual")
			.formParam("address[line1]", "Flat 3")
			.formParam("address[line2]", "Street 1")
			.formParam("address[line3]", "Cooler house name")
			.formParam("address[city]", "London")
			.formParam("address[postcode]", "SW1A 2AA")
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
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_128")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_129")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_130")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_131")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_132")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_133")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_134")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_135")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_136")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_137")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_138")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_139")
			.get("/analytics")
			.headers(headers_14),
            http("request_140")
			.get(uri4 + "/collect?v=1&_v=j68&a=433311636&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fyour-dob&ul=en-us&de=UTF-8&dt=Enter%20your%20date%20of%20birth%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=627925751")
			.headers(headers_15)))
		.pause(115)
		.exec(http("request_141")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/your-dob")
			.headers(headers_16)
			.formParam("known", "true")
			.formParam("_csrf", "c9orejgZ-UBafMuCuCEXensye965iXl3YLLk")
			.formParam("date[day]", "01")
			.formParam("date[month]", "08")
			.formParam("date[year]", "1982")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_142")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_143")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_144")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_145")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_146")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_147")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_148")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_149")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_150")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_151")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_152")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_153")
			.get("/analytics")
			.headers(headers_14),
            http("request_154")
			.get(uri4 + "/r/collect?v=1&_v=j68&a=513550682&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fyour-mobile&ul=en-us&de=UTF-8&dt=Add%20a%20contact%20number%20(optional)%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=33897875&gjid=1888869915&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&_r=1&z=717034813")
			.headers(headers_15)))
		.pause(24)
		.exec(http("request_155")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/your-mobile")
			.headers(headers_16)
			.formParam("_csrf", "zBY3ltPq-agqyMWVrEvKYFFv4KoMz9z2c6go")
			.formParam("number", "")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_156")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_157")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_158")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_159")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_160")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_161")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_162")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_163")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_164")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_165")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_166")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_167")
			.get("/analytics")
			.headers(headers_14),
            http("request_168")
			.get(uri4 + "/collect?v=1&_v=j68&a=2099059503&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ftask-list&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=306990494")
			.headers(headers_15)))
		.pause(103)
		.exec(http("request_169")
			.get("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/more-time-request")
			.headers(headers_2)
			.resources(http("request_170")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_171")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_172")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_173")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_174")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_175")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_176")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_177")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_178")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_179")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_180")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_181")
			.get("/analytics")
			.headers(headers_14),
            http("request_182")
			.get(uri4 + "/r/collect?v=1&_v=j68&a=1541779341&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fmore-time-request&ul=en-us&de=UTF-8&dt=Do%20you%20want%20more%20time%20to%20respond%3F%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=597024379&gjid=616794808&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&_r=1&z=1206520428")
			.headers(headers_15)))
		.pause(16)
		.exec(http("request_183")
			.get(uri4 + "/collect?v=1&_v=j68&a=1541779341&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fmore-time-request&ul=en-us&de=UTF-8&dt=Do%20you%20want%20more%20time%20to%20respond%3F%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&ec=Form&ea=Response%3A%20More%20time%20request&el=No%2C%20I%20don%E2%80%99t%20need%20more%20time&_u=CACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=2002874111")
			.headers(headers_15)
			.resources(http("request_184")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/more-time-request")
			.headers(headers_16)
			.formParam("_csrf", "LJuJz2TH-PCL5BSjhrUrNDFHLHV5IYh-lP-g")
			.formParam("option", "no")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_185")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_186")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_187")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_188")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_189")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_190")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_191")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_192")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_193")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_194")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_195")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_196")
			.get("/analytics")
			.headers(headers_14),
            http("request_197")
			.get(uri4 + "/collect?v=1&_v=j68&a=712638403&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ftask-list&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1794825508")
			.headers(headers_15)))
		.pause(6)
		.exec(http("request_198")
			.get("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/response-type")
			.headers(headers_2)
			.resources(http("request_199")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_200")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_201")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_202")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_203")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_204")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_205")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_206")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_207")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_208")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_209")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_210")
			.get("/analytics")
			.headers(headers_14),
            http("request_211")
			.get(uri4 + "/collect?v=1&_v=j68&a=1348617859&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fresponse-type&ul=en-us&de=UTF-8&dt=How%20do%20you%20respond%20to%20the%20claim%3F%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=580661508")
			.headers(headers_15)))
		.pause(6)
		.exec(http("request_212")
			.get(uri4 + "/collect?v=1&_v=j68&a=1348617859&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fresponse-type&ul=en-us&de=UTF-8&dt=How%20do%20you%20respond%20to%20the%20claim%3F%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&ec=Form&ea=Response%3A%20Select%20defendant%20response%20option&el=I%20reject%20all%20of%20the%20claim&_u=CACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=2013803588")
			.headers(headers_15)
			.resources(http("request_213")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/response-type")
			.headers(headers_16)
			.formParam("_csrf", "FwCZFYys-HhhoNhp6k8t9KvxxawSjGylzEwo")
			.formParam("type[value]", "DEFENCE")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_214")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_215")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_216")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_217")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_218")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_219")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_220")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_221")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_222")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_223")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_224")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_225")
			.get("/analytics")
			.headers(headers_14),
            http("request_226")
			.get(uri4 + "/collect?v=1&_v=j68&a=634245841&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Freject-all-of-claim&ul=en-us&de=UTF-8&dt=Why%20do%20you%20reject%20the%20claim%3F%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=6082334")
			.headers(headers_15)))
		.pause(6)
		.exec(http("request_227")
			.get(uri4 + "/collect?v=1&_v=j68&a=634245841&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Freject-all-of-claim&ul=en-us&de=UTF-8&dt=Why%20do%20you%20reject%20the%20claim%3F%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&ec=Form&ea=Response%3A%20Select%20full%20admission%20option&el=I%20dispute%20all%20of%20the%20claim&_u=CACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1808916392")
			.headers(headers_15)
			.resources(http("request_228")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/reject-all-of-claim")
			.headers(headers_16)
			.formParam("_csrf", "hXe3aPZO-b94BggloiTOATfv91D9QNPa6SG8")
			.formParam("option", "dispute")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_229")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_230")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_231")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_232")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_233")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_234")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_235")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_236")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_237")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_238")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_239")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_240")
			.get("/analytics")
			.headers(headers_14),
            http("request_241")
			.get(uri4 + "/collect?v=1&_v=j68&a=1634083934&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ftask-list&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=48888284")
			.headers(headers_15)))
		.pause(4)
		.exec(http("request_242")
			.get("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/your-defence")
			.headers(headers_2)
			.resources(http("request_243")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_244")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_245")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_246")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_247")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_248")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_249")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_250")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_251")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_252")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_253")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_254")
			.get("/analytics")
			.headers(headers_14),
            http("request_255")
			.get(uri4 + "/collect?v=1&_v=j68&a=269414605&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fyour-defence&ul=en-us&de=UTF-8&dt=Why%20do%20you%20disagree%20with%20the%20claim%3F%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=103363539")
			.headers(headers_15)))
		.pause(9)
		.exec(http("request_256")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/your-defence")
			.headers(headers_16)
			.formParam("_csrf", "Oinw2pNZ-3J0-xOAnBPqgoYNOgvhN5mnEXYY")
			.formParam("text", "asasasasasas")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_257")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_258")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_259")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_260")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_261")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_262")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_263")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_264")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_265")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_266")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_267")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_268")
			.get("/analytics")
			.headers(headers_14),
            http("request_269")
			.get(uri4 + "/collect?v=1&_v=j68&a=1585123192&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ftimeline&ul=en-us&de=UTF-8&dt=Add%20your%20timeline%20of%20events%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=2007321504")
			.headers(headers_15)))
		.pause(29)
		.exec(http("request_270")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/timeline")
			.headers(headers_16)
			.formParam("_csrf", "Thhu1SzP-SUaABFeBDXUM0X0O-I21exd5Dlo")
			.formParam("rows[0][date]", "1 May 2018")
			.formParam("rows[0][description]", "test user ")
			.formParam("rows[1][date]", "21 May 2018")
			.formParam("rows[1][description]", "test users2")
			.formParam("rows[2][date]", "")
			.formParam("rows[2][description]", "")
			.formParam("rows[3][date]", "")
			.formParam("rows[3][description]", "")
			.formParam("comment", "")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_271")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_272")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_273")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_274")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_275")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_276")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_277")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_278")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_279")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_280")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_281")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_282")
			.get("/analytics")
			.headers(headers_14),
            http("request_283")
			.get(uri4 + "/r/collect?v=1&_v=j68&a=440492375&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fevidence&ul=en-us&de=UTF-8&dt=List%20your%20evidence%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=1080902105&gjid=708619514&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&_r=1&z=88153151")
			.headers(headers_15)))
		.pause(21)
		.exec(http("request_284")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/evidence")
			.headers(headers_16)
			.formParam("_csrf", "OgyjVGi5-Ts5RppcsPwJ3C9slWjJY0VSq_F0")
			.formParam("rows[0][type]", "EXPERT_WITNESS")
			.formParam("rows[0][description]", "asasasas")
			.formParam("rows[1][type]", "CORRESPONDENCE")
			.formParam("rows[1][description]", "zasasasa")
			.formParam("rows[2][type]", "")
			.formParam("rows[2][description]", "")
			.formParam("rows[3][type]", "")
			.formParam("rows[3][description]", "")
			.formParam("comment", "")
			.formParam("saveAndContinue", "Save and continue")
			.resources(http("request_285")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_286")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_287")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_288")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_289")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_290")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_291")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_292")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_293")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_294")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_295")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_296")
			.get("/analytics")
			.headers(headers_14),
            http("request_297")
			.get(uri4 + "/collect?v=1&_v=j68&a=18967975&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ftask-list&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1577088433")
			.headers(headers_15)))
		.pause(4)
		.exec(http("request_298")
			.get("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/free-mediation")
			.headers(headers_2)
			.resources(http("request_299")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_300")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_301")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_302")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_303")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_304")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_305")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_306")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_307")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_308")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_309")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_310")
			.get("/analytics")
			.headers(headers_14),
            http("request_311")
			.get(uri4 + "/collect?v=1&_v=j68&a=76030448&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ffree-mediation&ul=en-us&de=UTF-8&dt=Free%20mediation%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1341117932")
			.headers(headers_15)))
		.pause(4)
		.exec(http("request_312")
			.get(uri4 + "/collect?v=1&_v=j68&a=76030448&t=event&_s=2&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ffree-mediation&ul=en-us&de=UTF-8&dt=Free%20mediation%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&ec=Form&ea=Response%3A%20Free%20mediation&el=Yes&_u=CACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1012015340")
			.headers(headers_15)
			.resources(http("request_313")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/free-mediation")
			.headers(headers_16)
			.formParam("_csrf", "vlgMEmWV-X6Vrao1Eau-pPTKNqECpkv9botU")
			.formParam("option", "yes")
			.formParam("saveAndContinue", "Save and continue"),
            http("request_314")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_315")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_316")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_317")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_318")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_319")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_320")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_321")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_322")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_323")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_324")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_325")
			.get("/analytics")
			.headers(headers_14),
            http("request_326")
			.get(uri4 + "/collect?v=1&_v=j68&a=1966745071&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Ftask-list&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1457265464")
			.headers(headers_15)))
		.pause(3)
		.exec(http("request_327")
			.get("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/check-and-send")
			.headers(headers_2)
			.resources(http("request_328")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_3),
            http("request_329")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_4),
            http("request_330")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_5),
            http("request_331")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_6),
            http("request_332")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_7),
            http("request_333")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_8),
            http("request_334")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_335")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_336")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_337")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_338")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_339")
			.get("/analytics")
			.headers(headers_14),
            http("request_340")
			.get(uri4 + "/collect?v=1&_v=j68&a=1714490744&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fcheck-and-send&ul=en-us&de=UTF-8&dt=Check%20your%20answers%20before%20submitting%20your%20response%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=2039088797")
			.headers(headers_15)))
		.pause(5)
		.exec(http("request_341")
			.post("/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/check-and-send")
			.headers(headers_16)
			.formParam("_csrf", "OoUDXamD-JC4Bctj03_J0eUYZNDdIw_tzBUg")
			.formParam("signed", "true")
			.formParam("type", "basic")
			.resources(http("request_342")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_9),
            http("request_343")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_10),
            http("request_344")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_11),
            http("request_345")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_12),
            http("request_346")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_13),
            http("request_347")
			.get("/analytics")
			.headers(headers_14),
            http("request_348")
			.get(uri4 + "/collect?v=1&_v=j68&a=1194321479&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2F6e99f589-5a25-4abf-976a-49622380d6bf%2Fresponse%2Fconfirmation&ul=en-us&de=UTF-8&dt=Confirmation%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x454&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=602170790")
			.headers(headers_15)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}