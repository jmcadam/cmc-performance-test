package uk.gov.hmcts.reform.cmc.performance.legalprocesses

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.legalprocesses.LegalLoginPage.thinktime
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}

object ClaimantDetails {

  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {



       exec(http("CLR01_090_ClaimantType")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
         .formParam("type", "ORGANISATION")
         .formParam("organisation", "testclaimantorg")
         .formParam("companyHouseNumber", "")
         .formParam("fullName", "")
         .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
     )
         .pause(thinktime)
     .exec(http("CLR01_0100_ClaimantOrgPost")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
       .formParam("line1", "14")
       .formParam("line2", "Hibernia Gardens")
       .formParam("city", "Hounslow")
       .formParam("postcode", "TW3 3SD")
       .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
     )
         .pause(thinktime)
     .exec(http("CLR01_0110_AddMoreClaimants")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
       .formParam("isAddClaimant", "YES")
       .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
        //.check(regex("Choose defendant type"))
     )
         .pause(thinktime)
         .exec(http("CLR01_0120_AddnlClimantType")
           .post(currentPageTemplate)
           .formParam(csrfParameter, csrfTemplate)
           .formParam("organisation", "")
           .formParam("companyHouseNumber", "")
           .formParam("type", "INDIVIDUAL")
           .formParam("fullName", "mr asss ssss")
           .check(status.in(200,201,204))
           .check(CurrentPageCheck.save)
           .check(CsrfCheck.save)
         )
         .pause(thinktime)

         .exec(http("CLR01_0130_ClimantAddn_Addr")
           .post(currentPageTemplate)
           .formParam(csrfParameter, csrfTemplate)
         .formParam("line1", "18")
         .formParam("line2", "Hibernia Gardens")
         .formParam("city", "Hounslow")
         .formParam("postcode", "TW3 3SD")
           .check(status.in(200,201,204))
           .check(CurrentPageCheck.save)
           .check(CsrfCheck.save)
         )
         .pause(thinktime)

         .exec(http("CLR01_0140_IsAddnlClaimants")
           .post(currentPageTemplate)
           .formParam(csrfParameter, csrfTemplate)
           .formParam("isAddClaimant", "NO")
           .check(status.in(200,201,204))
           .check(CurrentPageCheck.save)
           .check(CsrfCheck.save)

         )
         .pause(thinktime)


  }

}
