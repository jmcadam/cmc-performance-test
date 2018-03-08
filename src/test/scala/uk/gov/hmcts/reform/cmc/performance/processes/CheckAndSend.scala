package uk.gov.hmcts.reform.cmc.performance.processes

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import uk.gov.hmcts.reform.cmc.performance.utils._

object CheckAndSend {

  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    
    val paymentURL = Environment.PaymentURL
    val thinktime = Environment.thinkTime
    
    exec(http("TX036_CMC_CheckAndSend_Checkandsend_GET")
      .get("/claim/check-and-send")
      .check(css("input[name='_csrf']", "value").saveAs("_csrfCardDetailPage"))
      .check(regex("Check your answers before submitting your claim")))
      .pause(thinktime)
      
      .exec(http("TX037_CMC_CheckAndSend_Checkandsend_POST")
		   .post("/claim/check-and-send")
       .formParam("_csrf", "${_csrfCardDetailPage}")
			.formParam("signed", "true")
			.formParam("type", "basic")
			.check(css("input[name='csrfToken']", "value").saveAs("_csrfTokenCardDetailPage"))
			.check(regex("""/card_details/(.+)',""").saveAs("_csrfCardDetailPageChargeId"))
      .check(regex("Enter card details"))
       )
      .pause(thinktime)
      
      .exec(http("TX038_CMC_CardDetail_SubmitCardDetail")
			.post(paymentURL + "/card_details/${_csrfCardDetailPageChargeId}")  
			.formParam("chargeId", "${_csrfCardDetailPageChargeId}")
			.formParam("csrfToken", "${_csrfTokenCardDetailPage}") 
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
			.check(css("input[name='csrfToken']", "value").saveAs("_csrfTokenCardDetailConfirm"))
			 .check(regex("Confirm your payment")))
			 .pause(thinktime)
			 
			 .exec(http("TX039_CMC_CardDetail_ConfirmCardDetail")
			.post(paymentURL + "/card_details/${_csrfCardDetailPageChargeId}/confirm")
			.formParam("csrfToken", "${_csrfTokenCardDetailConfirm}")
			.formParam("chargeId", "${_csrfCardDetailPageChargeId}")
			.check(regex("Claim submitted")))
			.pause(thinktime)
			
			.exec(http("TX050_CMC_Logout")
			.get("/logout")
			.check(regex("Sign in")))
			.pause(thinktime)
  }

}