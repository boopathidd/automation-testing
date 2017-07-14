package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class Tc002loginFAILURE extends LeafTapsWrappers {
	@BeforeClass(groups={"common"})
	public void setData() {
		testCaseName="Login(Negative)";
		testDescription="Negative Scenarios of Login";
		browserName="chrome";
		dataSheetName="loginfailure";
		category="Sanity";
		authors="Gopi";
	}

	@Test(groups={"smoke"},dataProvider="fetchData")
	public void login(String userName, String password, String message){

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure()
		.verifyErrorMsg(message);
		
		
	}
}
