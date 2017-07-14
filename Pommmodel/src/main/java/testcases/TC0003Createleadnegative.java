package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC0003Createleadnegative extends LeafTapsWrappers {
	@BeforeClass(groups={"common"})
	public void setData() {
		testCaseName="createlead negative(negative)";
		testDescription="createlead negative(negative)";
		browserName="chrome";
		dataSheetName="createnegative";
		category="Smoke";
		authors="Babu";
	}

	@Test(groups={"sanity"},dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String cnameerrormsg,String fnameerrormsg,String Lnameerrormsg,String cName){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
	.verifyLoggedName(loggedInName)
        .clickcrmsfa()
        .clickcreatelead()
        .clickLoginForFailure()
        .verifycnameErrorMsg(cnameerrormsg)
       .verifyfirsttnameErrorMsg(fnameerrormsg)
       .verifyLasttnameErrorMsg(Lnameerrormsg)
       .crlastname(cName)
       .clickLoginForFailure()
       .verifyseccnameErrorMsg(cnameerrormsg)
       .verifyfirsttnameErrorMsg(fnameerrormsg);

		
		
	}

}

