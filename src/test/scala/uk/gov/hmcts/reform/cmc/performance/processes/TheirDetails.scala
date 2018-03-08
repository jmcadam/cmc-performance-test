package uk.gov.hmcts.reform.cmc.performance.processes

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}
import uk.gov.hmcts.reform.cmc.performance.utils._

object TheirDetails {

  val thinktime = Environment.thinkTime
  
  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    exec(http("TX025_CMC_TheirDetail_PartyTypeSelection_GET")
      .get("/claim/defendant-party-type-selection")
      .check(CsrfCheck.save)
      .check(CurrentPageCheck.save)
       .check(regex("We need to know if you’re claiming against them as an individual")))
      .pause(thinktime)
      
      .exec(http("TX026_CMC_TheirDetail_PartyTypeSelection_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("type", "individual")
       // .formParam("saveAndContinue", "Save and continue")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
        .check(regex("Their details")))
      .pause(thinktime)
      
      .exec(http("TX027_CMC_TheirDetail_TheirDetails_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("name", "John Smith")
        .formParam("address[postcodeLookup]", "")
        .formParam("address[line1]", "221B Baker street")
        .formParam("address[line2]", "")
        .formParam("address[line3]", "")
        .formParam("address[city]", "London")
        .formParam("address[postcode]", "NW1 6XE")
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
        .formParam("correspondenceAddress[addressSelectorVisible]", "false")
			  .formParam("correspondenceAddress[enterManually]", "false")
        .formParam("saveAndContinue", "Save and continue")
        .check(CsrfCheck.save)
        .check(CurrentPageCheck.save)
         .check(regex("Their email address")))
      .pause(thinktime)
      
      .exec(http("TX028_CMC_TheirDetail_EmailAddress_POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("address", "")
        .formParam("saveAndContinue", "Save and continue")
        .check(regex("Claim amount"))
      )
      .pause(thinktime)
  }

}
