package uk.gov.hmcts.reform.cmc.performance.legalprocesses

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.legalprocesses.LegalLoginPage.thinktime
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}

object ClaimantLegalRepresentative {

  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    val startPagePath = "/claim/representative-name"

    exec(http("CLR01_030_ClaimStart")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .formParam("start", "Start now")
      .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
    )
      .pause(thinktime)
        .exec(http("CLR01_040_LegalRepOrgName")
        .post(startPagePath)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("name", "Abc Organisation")
          .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
      )
      .pause(thinktime)
      .exec(http("CLR01_050_LegalRepOrgAddr")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("line1", "102 Petty France")
        .formParam("line2", "6th floor")
        .formParam("city", "London")
        .formParam("postcode", "SW1H 9AJ")
        .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
      )
      .pause(thinktime)
      .exec(http("CLR01_060_LegalRepOrgContact")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("phoneNumber", "0700000000")
        .formParam("email", "abc@abc.com")
        .formParam("dxAddress", "DX1234")
        .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
      )
      .pause(thinktime)
      .exec(http("CLR01_070_LegalRepOrg_Ref")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("reference", "REFLR001")
        .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
      )
      .pause(thinktime)
      .exec(http("CLR01_080_LegalRepOrg_Court")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("name", "Central Court")
        .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
      )
      .pause(thinktime)

  }

}
