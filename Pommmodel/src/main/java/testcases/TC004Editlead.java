package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004Editlead extends LeafTapsWrappers{

	
	@BeforeClass
	public void setData() {
		testCaseName="editlead(Positive)";
		testDescription="editlead";
		browserName="chrome";
		dataSheetName="editlead";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String leadid,String firstname,String lastname,String EFfirstname,String Elastname){

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
        //.verifyCompanyname(companyname)
        .verifyFirstname(firstname)
        .verifylastname(lastname)
        .clickEditButton()
        //.enterEDCompanyname(EFcompanyname)
        .enterEDfirstname(EFfirstname)
        .enterEdlastname(Elastname)
        .clickeditsubmitbutton()
        //.verifyCompanyname(EFcompanyname)
        .verifyFirstname(EFfirstname)
        .verifylastname(Elastname);
      
	
	
	}

}


	
	
	
	
