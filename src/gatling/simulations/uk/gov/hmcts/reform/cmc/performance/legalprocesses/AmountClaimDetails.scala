package uk.gov.hmcts.reform.cmc.performance.legalprocesses

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import uk.gov.hmcts.reform.cmc.performance.legalprocesses.LegalLoginPage.thinktime
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CsrfCheck.{csrfParameter, csrfTemplate}
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.CurrentPageCheck.currentPageTemplate
import uk.gov.hmcts.reform.cmc.performance.simulations.checks.{CsrfCheck, CurrentPageCheck}

object AmountClaimDetails {
  def run(implicit postHeaders: Map[String, String]): ChainBuilder = {
    exec(http("CLR01_0240_Personal_Injury_Claim")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .formParam("personalInjury", "YES")
      .formParam("generalDamages[value]", "MORE")
      .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
    )
      .pause(thinktime)

    .exec(http("CLR01_0250_housing_Disrepair_Details")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .formParam("housingDisrepair", "YES")
      .formParam("generalDamages[value]", "MORE")
      .formParam("otherDamages[value]", "MORE")
      .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
    )
      .pause(thinktime)
    .exec(http("CLR01_0260_Claim_Desc")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .formParam("text", "the type of claim, for example 'rent arrears' or 'damages' explained here blah")
      .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
    )
      .pause(thinktime)
    .exec(http("CLR01_0270_Claim_Amounts")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .formParam("lowerValue", "3000")
      .formParam("higherValue", "5000")
      .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
      //.check(regex("£70"))
    )
      .pause(thinktime)
      //claim total
    .exec(http("CLR01_0280_Claim_Total")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
    )
      .pause(thinktime)

      //claim details summary
    .exec(http("CLR01_0290_Check_Claim_Details")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
     // .check(regex("Statement of truth"))
    )
    .pause(thinktime)
     /* .exec(http("Check the claim details  - POST")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
       // .check(regex("Statement of truth"))
      )
      .pause(thinktime)*/

      .exec(http("CLR01_0300_Statement_OF_Truth")
      .post(currentPageTemplate)
      .formParam(csrfParameter, csrfTemplate)
      .formParam("signerName", "Blah")
      .formParam("signerRole", "QA")
        .check(status.in(200,201,204))
      .check(CurrentPageCheck.save)
      .check(CsrfCheck.save)
     // .check(regex("Pay by Fee Account"))
    )
      .pause(thinktime)
//pay by account
      .exec(http("CLR01_0310_Claim_Submit")
        .post(currentPageTemplate)
        .formParam(csrfParameter, csrfTemplate)
        .formParam("reference", "PBA1235476")
        .check(status.in(200,201,204))
        .check(CurrentPageCheck.save)
        .check(CsrfCheck.save)
      .check(regex("Your claim has been issued"))
      .check(css("a:contains('Download the sealed claim form')", "href").saveAs("pdfDownload"))
      .check(css(".govuk-box-highlight>h2.bold-medium").saveAs("claimNumber"))

      )
        .pause(thinktime)

      /*.exec {
        session =>
          println("this is a pdf download url ....." + session("pdfDownload").as[String])
          println("claim number ....." + session("claimNumber").as[String])

          session
      }*/

      /*.exec {
        session =>
          val fw = new BufferedWriter(new FileWriter("ClaimNumber.csv", true))
          try {
            fw.write(session("claimNumber").as[String] + "\r\n")
          }
          finally fw.close()
          session
      }*/

      .exec(http("CLR01_0320_Claim_Download")
        .get("${pdfDownload}")
        .check(status.is(200)))
      .pause(thinktime)

  }
}
