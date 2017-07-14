package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class Tc005Deletelead extends LeafTapsWrappers{
	@BeforeClass
	public void setData() {
		testCaseName="Deletelead(Positive)";
		testDescription="Delete leads";
		browserName="chrome";
		dataSheetName="Deletelead";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String leadid,String firstname,String lastname,String warnmsg){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickcrmsfa()
		.clickLeadpagemenu()
		.clickFindleadMenu()
		.enterfindLeadid(leadid)
		.clickFindbutton()
		.verifyleadid(leadid)
		.clickleadid(leadid)
       // .verifyCompanyname(companyname)
        .verifyFirstname(firstname)
        .verifylastname(lastname)
        .delete()
        .clickFindleadMenu()
        .enterfindLeadid(leadid)
        .clickFindbutton()
        .verifyNoleadid(warnmsg);
        

}
}