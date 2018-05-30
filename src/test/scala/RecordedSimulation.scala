
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://moneyclaim.nonprod.platform.hmcts.net")
		.inferHtmlResources()

	val headers_0 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_1 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"referer" -> "https://www.google.co.uk/_/chrome/newtab?rlz=1C1EKKP_enGB778GB778&ie=UTF-8",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36",
		"x-client-data" -> "CIW2yQEIo7bJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_2 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cookie" -> "CONSENT=WP.26d710; SID=LAZVr-SaQ8vu6h4KO30BmZisM8jDJhrBEEoFaNllYfst8mFHN12OTm0FO25XP8TLSzrBYg.; HSID=AmzkmZwYsDmzNmrAX; SSID=ATfvckCzjZBd70mmp; APISID=kQsrCF5r0v1678wW/AjWAvk1dzvptN5OjG; SAPISID=oeFD1cvblkj4F02H/AqKk22KtliwtgRpDP; ACCOUNT_CHOOSER=AFx_qI4147Rj-SM0PWJloMoke9mW_4N0Pwqi5FltievsFkxNNPKvduDGjdSlXdFOzMQ0iQg3zNdeW--FJve1T6mhKN85J_oHp2xhJzMic-61CustwYYT2ixXiCWjQNXid-G6OaTBLy6-; LSID=doritos|mail|o.mail.google.com|o.notifications.google.com|s.GB|s.youtube:LAZVr3EN8gBFFi0aJ_it4N5QIYQWcKtpaQwOW8SO9ALAjRaVWV3XKWXYaasQKhqbfHyUXg.; 1P_JAR=2018-5-29-9; GAPS=1:F7jyf-0xY2J67ko8hGcFcEmSv87SMgGOl_uKYCp_3kTBBSLIifGU8Uf1FBtlP2DBTy0vlM4AruSebBI29EeOe4qc0ZVHtw:Q2zHp-Z2wAnjJVPm; NID=131=tcTGOomhmFOXkhzS6XJNjmh4HW4HMR3Da9eDGHWuY7Feflw6zCZ6L6cOgVqzVjPq8RY-FCnR586rucscVsTLYuO4T5lJ4eqnNcOe_rfawaGxKGbWA0-FashupxdgR2k8pXfVyLWv4Ub_KaIWutOK3WxgO0AYWf0Uy0szyaVMwzIB_1ddUUUlC0qqPEbbesKD7u1TltllzcgQQCbmav8lDZMX9eRveSPZJAr1SHc4OjNwxd6en4PxhmD9Ij5i6A; SIDCC=AEfoLeYFiqgGGJOXBc8CUJmfKvEVk_qIrHylMhBdJ1Ob0CSuNMulSsewwn_ZJ7z6_27wldS5DUs",
		"referer" -> "https://www.google.co.uk/_/chrome/newtab?rlz=1C1EKKP_enGB778GB778&ie=UTF-8",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36",
		"x-chrome-connected" -> "mode=0,enable_account_consistency=false",
		"x-client-data" -> "CIW2yQEIo7bJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_4 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cookie" -> "CONSENT=WP.26d711.26d8af; SID=LAZVr-SaQ8vu6h4KO30BmZisM8jDJhrBEEoFaNllYfst8mFHN12OTm0FO25XP8TLSzrBYg.; HSID=AwFOUY2CI8gOKghJF; SSID=AAT83TkrEXtgQjK01; APISID=kQsrCF5r0v1678wW/AjWAvk1dzvptN5OjG; SAPISID=oeFD1cvblkj4F02H/AqKk22KtliwtgRpDP; NID=131=EVv2aJ7RiRKbAG60fj6dpt4is2whyzoeEmS4fn__8OKNdyZJMBYAdEQetrzYVaAmTi3LdxWebcA4_STh7pLmppdE2J9DfeHN1vnr7BshAaYnDP6eubXRptaKG3LURil5LGM5hZB5dFbua2gSP1I2KWrzIEB6vEKq2Be8BR7HdxsxT7uDtwLqxbJ9PpFUIu8dFg4Q3SZfPdOYI4SU6eVM3RA-Ygeh_wjdyLNMmmg2KgjJOspBm9q6kHWKX0OXK9tnsMDBGK4tkDF5y6snaA; 1P_JAR=2018-5-29-15",
		"referer" -> "https://www.google.co.uk/_/chrome/newtab?rlz=1C1EKKP_enGB778GB778&ie=UTF-8",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36",
		"x-client-data" -> "CIW2yQEIo7bJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_5 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_6 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"52c1-1632038f7df"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_7 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"7e1-1632038f6e5"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_8 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Thu, 12 Apr 2018 08:51:35 GMT",
		"If-None-Match" -> """W/"2dae0-162b90d8b56"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_9 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:13 GMT",
		"If-None-Match" -> """W/"419-1622fed263b"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"e08-1632038f6d6"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_11 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:16 GMT",
		"If-None-Match" -> """W/"15391-1622fed3235"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_12 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:15 GMT",
		"If-None-Match" -> """W/"440-1622fed2bd0"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_13 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:15 GMT",
		"If-None-Match" -> """W/"1521-1622fed2bdb"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_14 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:14 GMT",
		"If-None-Match" -> """W/"1b1-1622fed2a71"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_15 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:14 GMT",
		"If-None-Match" -> """W/"80-1622fed2a84"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_16 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:14 GMT",
		"If-None-Match" -> """W/"300-1622fed2a54"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_17 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:14 GMT",
		"If-None-Match" -> """W/"a9b-1622fed2a42"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_18 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:17 GMT",
		"If-None-Match" -> """W/"69a-1622fed34a7"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_19 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 29 May 2018 08:49:58 GMT",
		"If-None-Match" -> """W/"e00-163ab16f68a"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_20 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 29 May 2018 08:49:58 GMT",
		"If-None-Match" -> """W/"2f9-163ab16f69a"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_21 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 16 Mar 2018 17:48:14 GMT",
		"If-None-Match" -> """W/"cf-1622fed2754"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_22 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Tue, 29 May 2018 08:49:58 GMT",
		"If-None-Match" -> """W/"587-163ab16f67a"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_23 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"1093c-1632038f753"""",
		"Origin" -> "https://moneyclaim.nonprod.platform.hmcts.net",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_24 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Wed, 02 May 2018 09:39:54 GMT",
		"If-None-Match" -> """W/"d884-1632038f743"""",
		"Origin" -> "https://moneyclaim.nonprod.platform.hmcts.net",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_25 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_26 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-modified-since" -> "Fri, 18 May 2018 01:10:24 GMT",
		"referer" -> "https://moneyclaim.nonprod.platform.hmcts.net/",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_27 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"referer" -> "https://moneyclaim.nonprod.platform.hmcts.net/",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_28 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://moneyclaim.nonprod.platform.hmcts.net",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_51 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"4ffd-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_52 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"42b96-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_53 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:09 GMT",
		"If-None-Match" -> """W/"153ac-1634ee5bcc8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_54 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"419-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_55 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"64f-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_56 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"cdc-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_57 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:09 GMT",
		"If-None-Match" -> """W/"192e-1634ee5bcc8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_58 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:09 GMT",
		"If-None-Match" -> """W/"456ff-1634ee5bcc8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_59 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"df9-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_60 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"41e-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_61 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"144c-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_62 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:09 GMT",
		"If-None-Match" -> """W/"2ca-1634ee5bcc8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_63 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"e00-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_64 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"2f9-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_65 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"If-Modified-Since" -> "Fri, 11 May 2018 11:11:07 GMT",
		"If-None-Match" -> """W/"587-1634ee5b4f8"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

	val headers_66 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "https://idam.preprod.ccidam.reform.hmcts.net",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")

    val uri1 = "https://accounts.google.com/ListAccounts"
    val uri2 = "https://www.google.co.uk/gen_204"
    val uri3 = "https://www.google-analytics.com"
    val uri4 = "https://idam.preprod.ccidam.reform.hmcts.net"
    val uri6 = "https://lh3.googleusercontent.com/-QBu9KalPCmo/AAAAAAAAAAI/AAAAAAAAAAA/AB6qoq1nDUSTsr-PVjFT4YlBzEx2I7PJ7g/s48-c-mo/photo.jpg"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get(uri6 + "")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri6 + "")
			.headers(headers_1),
            http("request_2")
			.get(uri1 + "?listPages=0&pid=243&gpsia=1&source=ogb&mo=1&mn=1&hl=en&origin=https%3A%2F%2Fwww.google.co.uk")
			.headers(headers_2)))
		.pause(7)
		.exec(http("request_3")
			.get(uri2 + "?atyp=i&ct=nfkbx&cad=&ei=ptsLW9H5Ec6ZsAex67GgCw&zx=1527608897956")
			.headers(headers_0)
			.resources(http("request_4")
			.get(uri2 + "?atyp=i&ct=nfkbx&cad=&ei=ptsLW9H5Ec6ZsAex67GgCw&zx=1527608897956")
			.headers(headers_4)))
		.pause(2)
		.exec(http("request_5")
			.get("/first-contact/start")
			.headers(headers_5)
			.resources(http("request_6")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_6),
            http("request_7")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_7),
            http("request_8")
			.get("/stylesheets/application.css")
			.headers(headers_8),
            http("request_9")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_9),
            http("request_10")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_10),
            http("request_11")
			.get("/js/lib/jquery.min.js")
			.headers(headers_11),
            http("request_12")
			.get("/js/lib/govuk/shim-links-with-button-role.js")
			.headers(headers_12),
            http("request_13")
			.get("/js/lib/govuk/show-hide-content.js")
			.headers(headers_13),
            http("request_14")
			.get("/js/application.js")
			.headers(headers_14),
            http("request_15")
			.get("/js/detectJavascript.js")
			.headers(headers_15),
            http("request_16")
			.get("/js/analytics.js")
			.headers(headers_16),
            http("request_17")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_17),
            http("request_18")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_18),
            http("request_19")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_19),
            http("request_20")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_20),
            http("request_21")
			.get("/img/lib/icon-pointer.png")
			.headers(headers_21),
            http("request_22")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_22),
            http("request_23")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_23),
            http("request_24")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_24),
            http("request_25")
			.get("/analytics")
			.headers(headers_25),
            http("request_26")
			.get(uri3 + "/analytics.js")
			.headers(headers_26),
            http("request_27")
			.get(uri3 + "/r/collect?v=1&_v=j68&a=198550527&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Ffirst-contact%2Fstart&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x344&je=0&_u=AACAAEAB~&jid=1842179076&gjid=1037221191&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&_r=1&z=286374721")
			.headers(headers_27)))
		.pause(5)
		.exec(http("request_28")
			.post("/first-contact/start")
			.headers(headers_28)
			.formParam("_csrf", "roRilgpX-xB3SHPHPgWxmdGfmwumnOUXdvYI")
			.formParam("start-button", "Start now")
			.resources(http("request_29")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_6),
            http("request_30")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_7),
            http("request_31")
			.get("/stylesheets/application.css")
			.headers(headers_8),
            http("request_32")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_9),
            http("request_33")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_10),
            http("request_34")
			.get("/js/lib/jquery.min.js")
			.headers(headers_11),
            http("request_35")
			.get("/js/lib/govuk/shim-links-with-button-role.js")
			.headers(headers_12),
            http("request_36")
			.get("/js/lib/govuk/show-hide-content.js")
			.headers(headers_13),
            http("request_37")
			.get("/js/application.js")
			.headers(headers_14),
            http("request_38")
			.get("/js/detectJavascript.js")
			.headers(headers_15),
            http("request_39")
			.get("/js/analytics.js")
			.headers(headers_16),
            http("request_40")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_17),
            http("request_41")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_18),
            http("request_42")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_19),
            http("request_43")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_20),
            http("request_44")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_22),
            http("request_45")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_23),
            http("request_46")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_24),
            http("request_47")
			.get("/analytics")
			.headers(headers_25),
            http("request_48")
			.get(uri3 + "/analytics.js")
			.headers(headers_26),
            http("request_49")
			.get(uri3 + "/collect?v=1&_v=j68&a=590006293&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Ffirst-contact%2Fclaim-reference&ul=en-us&de=UTF-8&dt=Enter%20your%20claim%20number%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x344&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=273154049")
			.headers(headers_27)))
		.pause(12)
		.exec(http("request_50")
			.post("/first-contact/claim-reference")
			.headers(headers_28)
			.formParam("_csrf", "svavcY0A-nR2Lp5s6f6DQNEQyXa7Dl42RPX4")
			.formParam("reference", "012MC752")
			.resources(http("request_51")
			.get(uri4 + "/public/stylesheets/govuk-template.css?0.23.0")
			.headers(headers_51),
            http("request_52")
			.get(uri4 + "/public/stylesheets/fonts.css?0.23.0")
			.headers(headers_52),
            http("request_53")
			.get(uri4 + "/public/stylesheets/application.css")
			.headers(headers_53),
            http("request_54")
			.get(uri4 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_54),
            http("request_55")
			.get(uri4 + "/public/stylesheets/govuk-template-print.css?0.23.0")
			.headers(headers_55),
            http("request_56")
			.get(uri4 + "/public/javascripts/govuk-template.js?0.23.0")
			.headers(headers_56),
            http("request_57")
			.get(uri4 + "/public/javascripts/details.polyfill.js")
			.headers(headers_57),
            http("request_58")
			.get(uri4 + "/public/javascripts/jquery-1.11.3.js")
			.headers(headers_58),
            http("request_59")
			.get(uri4 + "/public/javascripts/govuk/selection-buttons.js")
			.headers(headers_59),
            http("request_60")
			.get(uri4 + "/public/javascripts/govuk/shim-links-with-button-role.js")
			.headers(headers_60),
            http("request_61")
			.get(uri4 + "/public/javascripts/govuk/show-hide-content.js")
			.headers(headers_61),
            http("request_62")
			.get(uri4 + "/public/javascripts/application.js")
			.headers(headers_62),
            http("request_63")
			.get(uri4 + "/public/stylesheets/images/govuk-crest.png?0.23.0")
			.headers(headers_63),
            http("request_64")
			.get(uri4 + "/public/stylesheets/images/open-government-licence.png?0.23.0")
			.headers(headers_64),
            http("request_65")
			.get(uri4 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_65)))
		.pause(12)
		.exec(http("request_66")
			.post(uri4 + "/login/pin?response_type=code&state=012MC752&client_id=cmc_citizen&redirect_uri=https://moneyclaim.nonprod.platform.hmcts.net/receiver")
			.headers(headers_66)
			.formParam("pinnumber", "kenKpqnW")
			.formParam("response_type", "code")
			.formParam("_csrf", "d5Ivltv1-H56FrA8b9xv5FE9sJAl2Bkb3L44")
			.formParam("redirect_uri", "https://moneyclaim.nonprod.platform.hmcts.net/receiver")
			.formParam("client_id", "cmc_citizen")
			.formParam("scope", "")
			.formParam("state", "012MC752")
			.resources(http("request_67")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_6),
            http("request_68")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_7),
            http("request_69")
			.get("/stylesheets/application.css")
			.headers(headers_8),
            http("request_70")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_9),
            http("request_71")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_10),
            http("request_72")
			.get("/js/lib/jquery.min.js")
			.headers(headers_11),
            http("request_73")
			.get("/js/lib/govuk/shim-links-with-button-role.js")
			.headers(headers_12),
            http("request_74")
			.get("/js/lib/govuk/show-hide-content.js")
			.headers(headers_13),
            http("request_75")
			.get("/js/application.js")
			.headers(headers_14),
            http("request_76")
			.get("/js/detectJavascript.js")
			.headers(headers_15),
            http("request_77")
			.get("/js/analytics.js")
			.headers(headers_16),
            http("request_78")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_17),
            http("request_79")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_18),
            http("request_80")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_19),
            http("request_81")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_20),
            http("request_82")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_22),
            http("request_83")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_23),
            http("request_84")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_24),
            http("request_85")
			.get("/analytics")
			.headers(headers_25),
            http("request_86")
			.get(uri3 + "/analytics.js")
			.headers(headers_0),
            http("request_87")
			.get(uri3 + "/collect?v=1&_v=j68&a=725536752&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Ffirst-contact%2Fclaim-summary&dr=https%3A%2F%2Fidam.preprod.ccidam.reform.hmcts.net%2F&ul=en-us&de=UTF-8&dt=Claim%20details%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x344&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=337755902")
			.headers(headers_27)))
		.pause(5)
		.exec(http("request_88")
			.post("/first-contact/claim-summary")
			.headers(headers_28)
			.formParam("_csrf", "DsWM0SyC--S_JhyZA7xf92fTIMtTnUNxPf20")
			.resources(http("request_89")
			.get(uri4 + "/public/stylesheets/govuk-template.css?0.23.0")
			.headers(headers_51),
            http("request_90")
			.get(uri4 + "/public/stylesheets/fonts.css?0.23.0")
			.headers(headers_52),
            http("request_91")
			.get(uri4 + "/public/stylesheets/application.css")
			.headers(headers_53),
            http("request_92")
			.get(uri4 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_54),
            http("request_93")
			.get(uri4 + "/public/stylesheets/govuk-template-print.css?0.23.0")
			.headers(headers_55),
            http("request_94")
			.get(uri4 + "/public/javascripts/govuk-template.js?0.23.0")
			.headers(headers_56),
            http("request_95")
			.get(uri4 + "/public/javascripts/details.polyfill.js")
			.headers(headers_57),
            http("request_96")
			.get(uri4 + "/public/javascripts/jquery-1.11.3.js")
			.headers(headers_58),
            http("request_97")
			.get(uri4 + "/public/javascripts/govuk/selection-buttons.js")
			.headers(headers_59),
            http("request_98")
			.get(uri4 + "/public/javascripts/govuk/shim-links-with-button-role.js")
			.headers(headers_60),
            http("request_99")
			.get(uri4 + "/public/javascripts/govuk/show-hide-content.js")
			.headers(headers_61),
            http("request_100")
			.get(uri4 + "/public/javascripts/application.js")
			.headers(headers_62),
            http("request_101")
			.get(uri4 + "/public/stylesheets/images/govuk-crest.png?0.23.0")
			.headers(headers_63),
            http("request_102")
			.get(uri4 + "/public/stylesheets/images/open-government-licence.png?0.23.0")
			.headers(headers_64),
            http("request_103")
			.get(uri4 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_65)))
		.pause(6)
		.exec(http("request_104")
			.get(uri4 + "/login?response_type=code&client_id=cmc_citizen&redirect_uri=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Freceiver&state=51193&upliftToken=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJ0aXM1bmE2M2gzdWR2c24yM2hiNm9lcG5wIiwic3ViIjoiNTExOTMiLCJpYXQiOjE1Mjc2MDg5MzEsImV4cCI6MTUyNzYzNzczMSwiZGF0YSI6ImxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlci1sb2EwIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiNTExOTMiLCJmb3JlbmFtZSI6IkRhbmllbCBNdXJwaHkiLCJzdXJuYW1lIjoiIiwiZGVmYXVsdC1zZXJ2aWNlIjoiQ01DIiwibG9hIjowLCJkZWZhdWx0LXVybCI6Imh0dHBzOi8vd3d3Lm1vbmV5Y2xhaW1zLmRlbW8ucGxhdGZvcm0uaG1jdHMubmV0L3JlY2VpdmVyIiwiZ3JvdXAiOiJsZXR0ZXItaG9sZGVyIn0.F0cI2KMM4ZMVQd9Pb4a0b_tgH3OVNjFRWdhMDfX9_n8")
			.headers(headers_5)
			.resources(http("request_105")
			.get(uri4 + "/public/stylesheets/govuk-template.css?0.23.0")
			.headers(headers_51),
            http("request_106")
			.get(uri4 + "/public/stylesheets/fonts.css?0.23.0")
			.headers(headers_52),
            http("request_107")
			.get(uri4 + "/public/stylesheets/application.css")
			.headers(headers_53),
            http("request_108")
			.get(uri4 + "/public/images/gov.uk_logotype_crown_invert_trans.png?0.23.0")
			.headers(headers_54),
            http("request_109")
			.get(uri4 + "/public/javascripts/govuk-template.js?0.23.0")
			.headers(headers_56),
            http("request_110")
			.get(uri4 + "/public/javascripts/details.polyfill.js")
			.headers(headers_57),
            http("request_111")
			.get(uri4 + "/public/javascripts/jquery-1.11.3.js")
			.headers(headers_58),
            http("request_112")
			.get(uri4 + "/public/javascripts/govuk/selection-buttons.js")
			.headers(headers_59),
            http("request_113")
			.get(uri4 + "/public/javascripts/govuk/shim-links-with-button-role.js")
			.headers(headers_60),
            http("request_114")
			.get(uri4 + "/public/javascripts/govuk/show-hide-content.js")
			.headers(headers_61),
            http("request_115")
			.get(uri4 + "/public/javascripts/application.js")
			.headers(headers_62),
            http("request_116")
			.get(uri4 + "/public/stylesheets/govuk-template-print.css?0.23.0")
			.headers(headers_55),
            http("request_117")
			.get(uri4 + "/public/stylesheets/images/govuk-crest.png?0.23.0")
			.headers(headers_63),
            http("request_118")
			.get(uri4 + "/public/stylesheets/images/open-government-licence.png?0.23.0")
			.headers(headers_64),
            http("request_119")
			.get(uri4 + "/public/stylesheets/images/gov.uk_logotype_crown.png?0.23.0")
			.headers(headers_65)))
		.pause(23)
		.exec(http("request_120")
			.post(uri4 + "/login?response_type=code&client_id=cmc_citizen&redirect_uri=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Freceiver&state=51193&upliftToken=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJ0aXM1bmE2M2gzdWR2c24yM2hiNm9lcG5wIiwic3ViIjoiNTExOTMiLCJpYXQiOjE1Mjc2MDg5MzEsImV4cCI6MTUyNzYzNzczMSwiZGF0YSI6ImxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlci1sb2EwIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiNTExOTMiLCJmb3JlbmFtZSI6IkRhbmllbCBNdXJwaHkiLCJzdXJuYW1lIjoiIiwiZGVmYXVsdC1zZXJ2aWNlIjoiQ01DIiwibG9hIjowLCJkZWZhdWx0LXVybCI6Imh0dHBzOi8vd3d3Lm1vbmV5Y2xhaW1zLmRlbW8ucGxhdGZvcm0uaG1jdHMubmV0L3JlY2VpdmVyIiwiZ3JvdXAiOiJsZXR0ZXItaG9sZGVyIn0.F0cI2KMM4ZMVQd9Pb4a0b_tgH3OVNjFRWdhMDfX9_n8")
			.headers(headers_66)
			.formParam("username", "cmcvv104@mailinator.com")
			.formParam("password", "Pass19word")
			.formParam("continue", "https://moneyclaim.nonprod.platform.hmcts.net/receiver?state=51193")
			.formParam("upliftToken", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJ0aXM1bmE2M2gzdWR2c24yM2hiNm9lcG5wIiwic3ViIjoiNTExOTMiLCJpYXQiOjE1Mjc2MDg5MzEsImV4cCI6MTUyNzYzNzczMSwiZGF0YSI6ImxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlci1sb2EwIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiNTExOTMiLCJmb3JlbmFtZSI6IkRhbmllbCBNdXJwaHkiLCJzdXJuYW1lIjoiIiwiZGVmYXVsdC1zZXJ2aWNlIjoiQ01DIiwibG9hIjowLCJkZWZhdWx0LXVybCI6Imh0dHBzOi8vd3d3Lm1vbmV5Y2xhaW1zLmRlbW8ucGxhdGZvcm0uaG1jdHMubmV0L3JlY2VpdmVyIiwiZ3JvdXAiOiJsZXR0ZXItaG9sZGVyIn0.F0cI2KMM4ZMVQd9Pb4a0b_tgH3OVNjFRWdhMDfX9_n8")
			.formParam("response_type", "code")
			.formParam("_csrf", "kfnOqzWA-p6VCpA4Gz4O9SyZWQWj3h5yLkIM")
			.formParam("redirect_uri", "https://moneyclaim.nonprod.platform.hmcts.net/receiver")
			.formParam("client_id", "cmc_citizen")
			.formParam("scope", "")
			.formParam("state", "51193")
			.formParam("selfRegistrationEnabled", "true")
			.resources(http("request_121")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_6),
            http("request_122")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_7),
            http("request_123")
			.get("/stylesheets/application.css")
			.headers(headers_8),
            http("request_124")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_9),
            http("request_125")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_10),
            http("request_126")
			.get("/js/lib/jquery.min.js")
			.headers(headers_11),
            http("request_127")
			.get("/js/lib/govuk/shim-links-with-button-role.js")
			.headers(headers_12),
            http("request_128")
			.get("/js/lib/govuk/show-hide-content.js")
			.headers(headers_13),
            http("request_129")
			.get("/js/application.js")
			.headers(headers_14),
            http("request_130")
			.get("/js/detectJavascript.js")
			.headers(headers_15),
            http("request_131")
			.get("/js/analytics.js")
			.headers(headers_16),
            http("request_132")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_17),
            http("request_133")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_18),
            http("request_134")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_19),
            http("request_135")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_20),
            http("request_136")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_22),
            http("request_137")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_23),
            http("request_138")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_24),
            http("request_139")
			.get("/analytics")
			.headers(headers_25),
            http("request_140")
			.get(uri3 + "/analytics.js")
			.headers(headers_0),
            http("request_141")
			.get(uri3 + "/r/collect?v=1&_v=j68&a=1096254133&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fdashboard&dr=https%3A%2F%2Fidam.preprod.ccidam.reform.hmcts.net%2F&ul=en-us&de=UTF-8&dt=Your%20money%20claims%20account%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x456&je=0&_u=AACAAEAB~&jid=2096237469&gjid=773482789&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&_r=1&z=25588610")
			.headers(headers_27)))
		.pause(4)
		.exec(http("request_142")
			.get("/dashboard/d86f6425-4453-45b8-b6f3-d875a5e19fd4/defendant")
			.headers(headers_5)
			.resources(http("request_143")
			.get("/stylesheets/lib/govuk-template.css?0.24.0")
			.headers(headers_6),
            http("request_144")
			.get("/stylesheets/lib/fonts.css?0.24.0")
			.headers(headers_7),
            http("request_145")
			.get("/stylesheets/application.css")
			.headers(headers_8),
            http("request_146")
			.get("/img/lib/gov.uk_logotype_crown_invert_trans.png?0.24.0")
			.headers(headers_9),
            http("request_147")
			.get("/js/lib/govuk-template.js?0.24.0")
			.headers(headers_10),
            http("request_148")
			.get("/js/lib/jquery.min.js")
			.headers(headers_11),
            http("request_149")
			.get("/js/lib/govuk/shim-links-with-button-role.js")
			.headers(headers_12),
            http("request_150")
			.get("/js/lib/govuk/show-hide-content.js")
			.headers(headers_13),
            http("request_151")
			.get("/js/application.js")
			.headers(headers_14),
            http("request_152")
			.get("/js/detectJavascript.js")
			.headers(headers_15),
            http("request_153")
			.get("/js/analytics.js")
			.headers(headers_16),
            http("request_154")
			.get("/js/analytics-custom-event-sender.js?2017-10-11")
			.headers(headers_17),
            http("request_155")
			.get("/stylesheets/lib/govuk-template-print.css?0.24.0")
			.headers(headers_18),
            http("request_156")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_19),
            http("request_157")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_20),
            http("request_158")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_22),
            http("request_159")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_23),
            http("request_160")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_24),
            http("request_161")
			.get("/analytics")
			.headers(headers_25),
            http("request_162")
			.get(uri3 + "/analytics.js")
			.headers(headers_0),
            http("request_163")
			.get(uri3 + "/collect?v=1&_v=j68&a=2072408107&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fdashboard%2Fd86f6425-4453-45b8-b6f3-d875a5e19fd4%2Fdefendant&ul=en-us&de=UTF-8&dt=Claim%20status%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x456&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=1787313054")
			.headers(headers_27)))
		.pause(6)
		.exec(http("request_164")
			.get("/case/d86f6425-4453-45b8-b6f3-d875a5e19fd4/response/task-list")
			.headers(headers_5)
			.resources(http("request_165")
			.get("/stylesheets/lib/images/govuk-crest.png?0.24.0")
			.headers(headers_19),
            http("request_166")
			.get("/stylesheets/lib/images/open-government-licence.png?0.24.0")
			.headers(headers_20),
            http("request_167")
			.get("/stylesheets/lib/images/gov.uk_logotype_crown.png?0.24.0")
			.headers(headers_22),
            http("request_168")
			.get("/stylesheets/lib/fonts/v1-f38ad40456-light.woff2?0.24.0")
			.headers(headers_23),
            http("request_169")
			.get("/stylesheets/lib/fonts/v1-a2452cb66f-bold.woff2?0.24.0")
			.headers(headers_24),
            http("request_170")
			.get("/analytics")
			.headers(headers_25),
            http("request_171")
			.get(uri3 + "/analytics.js")
			.headers(headers_0),
            http("request_172")
			.get(uri3 + "/collect?v=1&_v=j68&a=1536605375&t=pageview&_s=1&dl=https%3A%2F%2Fmoneyclaim.nonprod.platform.hmcts.net%2Fcase%2Fd86f6425-4453-45b8-b6f3-d875a5e19fd4%2Fresponse%2Ftask-list&ul=en-us&de=UTF-8&dt=Respond%20to%20a%20money%20claim%20-%20Money%20Claims&sd=24-bit&sr=1280x720&vp=1251x456&je=0&_u=AACAAEAB~&jid=&gjid=&cid=254763792.1527585292&tid=UA-97111056-1&_gid=342853850.1527585292&z=386542624")
			.headers(headers_27)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}