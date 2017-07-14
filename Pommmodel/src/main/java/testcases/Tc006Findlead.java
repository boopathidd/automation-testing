package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class Tc006Findlead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login(Positive)";
		testDescription="Login To Opentaps";
		browserName="chrome";
		dataSheetName="findlead";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String leadid,String firstname,String lastname){

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
      //  .verifyCompanyname(companyname)
        .verifyFirstname(firstname)
        .verifylastname(lastname);
        	
	}

}

