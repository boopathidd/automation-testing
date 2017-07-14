package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Viewlead;
import wrappers.LeafTapsWrappers;

public class TC0003CreateleadPositive extends LeafTapsWrappers {

	@BeforeClass(groups={"common"})
	public void setData() {
		testCaseName="createlead positive(positive)";
		testDescription="createlead positive(positive)";
		browserName="chrome";
		dataSheetName="createleadpositive";
		category="Smoke";
		authors="Babu";
	}

	@Test(groups={"sanity"},dataProvider="fetchData")
	public void createlead(String userName, String password, String loggedInName,String companyname,String firstname,String Lastname,String wfirstname,String wLastname){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
	.verifyLoggedName(loggedInName)
        .clickcrmsfa()
        .clickcreatelead()
        .crcompanyname(companyname)
        .crfirstname(firstname)
        .crlastname(Lastname)
        .createclicksubmit()
		//.verifyCompanyname(companyname)
		.verifyFirstname(firstname)
		.verifylastname(Lastname);
		//System.out.println("***************finish*********************");
               		
	}

}

