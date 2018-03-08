package uk.gov.hmcts.reform.cmc.performance.utils

object Environment {
  val httpConfig = scala.util.Properties.envOrElse("httpConfig", "http")
  
  val cmcBashURL = scala.util.Properties.envOrElse("baseURL", "https://www-dev.moneyclaim.reform.hmcts.net")
  //val iadmURL = "https://idam-test.dev.ccidam.reform.hmcts.net"
  val PaymentURL = scala.util.Properties.envOrElse("paymentURL", "https://www.payments.service.gov.uk")
  
  val users = scala.util.Properties.envOrElse("numberOfUser", "10")
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "500")
  
  val commonHeader = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

    
    val thinkTime = 15
    val waitForNextIteration = 25
}