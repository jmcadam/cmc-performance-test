package uk.gov.hmcts.reform.cmc.performance.processes

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import uk.gov.hmcts.reform.cmc.performance.utils._

object Eligibility {
  
  val thinktime = Environment.thinkTime

  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    val eligibilityPath = "/claim/eligibility"

      exec(http("TX03_CMC_Eligibility_MakeNewClaim")
			.get("/claim/start")
			.check(regex("Make a money claim")))
		.pause(thinktime)
		
     .exec(http("TX04_CMC_Eligibility_FindoutEligibilityPage")
      .get(eligibilityPath)
      .check(regex("Find out if you can use this service")))
      .pause(thinktime)
      
      .exec(http("TX05_CMC_Eligibility_TotalAmountYouAreclaiming")
        .get(s"$eligibilityPath/claim-value")
        .check(CsrfCheck.save)
        .check(regex("Total amount you’re claiming")))
        .pause(thinktime)
        
      .exec(http("TX06_CMC_Eligibility_TotalAmountYouAreclaiming")
        .post(s"$eligibilityPath/claim-value")
        .formParam(csrfParameter, csrfTemplate)
        .formParam("claimValue", "UNDER_10000")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Do you need help paying your court fees?")))
        .pause(thinktime)
        
      .exec(http("TX07_CMC_Eligibility_HelpWithCourtyFees")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("helpWithFees", "no")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Do you live in the UK?")))
        .pause(thinktime)
        
      .exec(http("TX08_CMC_Eligibility_ClaimantAddress")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("claimantAddress", "yes")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Does the person or organisation you’re claiming against have an address in England or Wales?")))
        .pause(thinktime)
        
      .exec(http("TX09_CMC_Eligibility_DefendantAddress")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("defendantAddress", "yes")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Are you and the person you’re claiming against 18 or older?")))
        .pause(thinktime)
        
      .exec(http("TX010_CMC_Eligibility_Over18")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("eighteenOrOver", "yes")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Who are you making the claim for?")))
        .pause(thinktime)
        
      .exec(http("TX011_CMC_Eligibility_SingleClaimant")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("claimType", "PERSONAL_CLAIM")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Is this claim against more than one person or organisation?")))
        .pause(thinktime)
        
      .exec(http("TX012_CMC_Eligibility_SingleDefendant")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("singleDefendant", "no")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Are you claiming against a government department?")))
        .pause(thinktime)
        
      .exec(http("TX013_CMC_Eligibility_GovernmentDepartment")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("governmentDepartment", "no")
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        .check(regex("Is your claim for a tenancy deposit?")))
        .pause(thinktime)
        
      .exec(http("TX014_CMC_Eligibility_TenancyDeposit")
        .post(s"$eligibilityPath/claim-is-for-tenancy-deposit")
        .formParam(csrfParameter, csrfTemplate)
        .formParam("claimIsForTenancyDeposit", "no")
        .check(CurrentPageCheck.save)
        .check(regex("You can use this service")))
        .pause(thinktime)    
  }

}
