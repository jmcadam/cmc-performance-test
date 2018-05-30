package uk.gov.hmcts.reform.cmc.performance.defendantprocess

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import uk.gov.hmcts.reform.cmc.performance.utils._

object DefendantDetails {
  
  val thinktime = Environment.thinkTime
  

   val dashBoard=
     exec(http("TX07_CMC_Def_Response_dashBoard")
    // .get("/dashboard/38ea3269-a024-46f3-a6ca-03828f5f3da6/defendant")
       .get(currentPageTemplate)
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
      //  .check(regex("Your money claims account"))
			 )
      .pause(thinktime)

    val casetaskList =
      exec(http("TX08_CMC_Def_Response_Case_TaskList_Get")
   // .get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/task-list")
        .get(currentPageTemplate)
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
       // .check(regex("Respond to a money claim"))
			)
        .pause(thinktime)

    .exec(http("Response_YourDetails_Get")
     // .get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/your-details")
      .get(currentPageTemplate)
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        //.check(regex("Timeline of events"))
      )
      .pause(thinktime)

     val defendantDetails=   exec(http("Response_YourDetails_Post")
          .post(currentPageTemplate)
       .formParam(csrfParameter, csrfTemplate)
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
       .check(CsrfCheck.save)
       .check(CurrentPageCheck.save)
       .check(regex("Enter your date of birth"))
		 )
       .pause(thinktime)

       val dob=exec(http("Response_DOB")
         .post(currentPageTemplate)
         .formParam(csrfParameter, csrfTemplate)
         .formParam("known", "true")
         .formParam("date[day]", "01")
         .formParam("date[month]", "03")
         .formParam("date[year]", "1983")
         .formParam("saveAndContinue", "Save and continue")
         .check(CsrfCheck.save)
         .check(CurrentPageCheck.save)
				// .check(regex("Add a contact number"))
			 )
         .pause(thinktime)

    val mobile=   exec(http("Response_Mobile")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
         .formParam("number", "07548723412")
         .formParam("saveAndContinue", "Save and continue")
      .check(CsrfCheck.save)
      .check(CurrentPageCheck.save)
			.check(regex("Do you want more time to respond?"))
		)
      .pause(thinktime)


	//need to add this here-https://moneyclaim.nonprod.platform.hmcts.net/case/6e99f589-5a25-4abf-976a-49622380d6bf/response/task-list

   val moreTimeRequest=
     exec(http("Response_MoreTimeRequest_Get")
          // .get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/more-time-request"))
       .get(currentPageTemplate))
         .exec(http("Response_MoreTimeRequest_Post")
       .post(currentPageTemplate)
       .formParam(csrfParameter, csrfTemplate)
         .formParam("option", "no")
         .formParam("saveAndContinue", "Save and continue")
           .check(CsrfCheck.save)
           .check(CurrentPageCheck.save)
					// .check(regex("Do you want more time to respond?"))
				 )
       .pause(thinktime)


  val responseType=
		exec(http("Response_ResponseType_Get")
			// .get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/more-time-request"))
			.get(currentPageTemplate))

      .exec(http("Response_ResponseType_Post")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .formParam("type[value]", "DEFENCE")
      .formParam("saveAndContinue", "Save and continue")
      .check(CsrfCheck.save)
      .check(CurrentPageCheck.save)
				//.check(regex("How do you respond to the claim?"))

			)
      .pause(thinktime)

  val reject_All_Claims=

      exec(http("Response_Reject_All_Of_Claim_Get")
       // .get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/reject-all-of-claim")
          .get(currentPageTemplate))
    .exec(http("Response_Reject_All_Of_Claim_Post")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
        .formParam("option", "dispute")
        .formParam("saveAndContinue", "Save and continue")
      .check(CsrfCheck.save)
      .check(CurrentPageCheck.save)
		//	.check(regex("Why do you reject the claim?"))

		)
        .pause(thinktime)


     val yourDefence=
       exec(http("Response_Your_Defence_Post_Get")
			//.get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/your-defence")
           .get(currentPageTemplate))


		.exec(http("Response_Your_Defence_Post")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
			.formParam("text", "adadasdfadad")
			.formParam("saveAndContinue", "Save and continue")
      .check(CsrfCheck.save)
      .check(CurrentPageCheck.save)
			//.check(regex("Why do you disagree with the claim?"))
		)
         .pause(thinktime)

	val timeLine=	exec(http("Response_TimeLine")
    .post(currentPageTemplate)
    .formParam(csrfParameter, csrfTemplate)
			.formParam("rows[0][date]", "1 Mar 2018")
			.formParam("rows[0][description]", "asasasasasasas")
			.formParam("rows[1][date]", "3 April 2018")
			.formParam("rows[1][description]", "asasasas")
			.formParam("rows[2][date]", "")
			.formParam("rows[2][description]", "")
			.formParam("rows[3][date]", "")
			.formParam("rows[3][description]", "")
			.formParam("comment", "")
			.formParam("saveAndContinue", "Save and continue")
    .check(CsrfCheck.save)
    .check(CurrentPageCheck.save)
	//	.check(regex("Add your timeline of events"))

	)
    .pause(thinktime)

	val evidence=	exec(http("Response_Evidence")
    .post(currentPageTemplate)
    .formParam(csrfParameter, csrfTemplate)
			.formParam("rows[0][type]", "RECEIPTS")
			.formParam("rows[0][description]", "asasas")
			.formParam("rows[1][type]", "PHOTO")
			.formParam("rows[1][description]", "asasasasa")
			.formParam("rows[2][type]", "")
			.formParam("rows[2][description]", "")
			.formParam("rows[3][type]", "")
			.formParam("rows[3][description]", "")
			.formParam("comment", "")
			.formParam("saveAndContinue", "Save and continue")
    .check(CsrfCheck.save)
    .check(CurrentPageCheck.save)
		//.check(regex("List your evidence"))

	)
    .pause(thinktime)

		val freeMediation =
      exec(http("Response_Free_Mediation_Get")
			//.get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/free-mediation")
          .get(currentPageTemplate))

	.exec(http("Response_Free_Mediation_Post")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
			.formParam("option", "yes")
			.formParam("saveAndContinue", "Save and continue")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
	//	.check(regex("Free mediation"))

	)
  .pause(thinktime)



		val checkAndSend=
      exec(http("Response_CheckAndSend_Get")
		//	.get("/case/38ea3269-a024-46f3-a6ca-03828f5f3da6/response/check-and-send")
        .get(currentPageTemplate))

		.exec(http("Response_CheckAndSend_Post")
        .post(currentPageTemplate)
			.formParam(csrfParameter, csrfTemplate)
			.formParam("signed", "true")
			.formParam("type", "basic")
      .check(CsrfCheck.save)
      .check(CurrentPageCheck.save)
			.check(regex("You’ve submitted your response"))
		)
        .pause(thinktime)









}
