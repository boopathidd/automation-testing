package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class Homepage extends LeafTapsWrappers{
	public Homepage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Login Page", "FAIL");
		}
	}
	
	public Homepage verifyLoggedName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}
	
	public MyHomepage clickcrmsfa(){
		clickByLink(prop.getProperty("Home.CRMSFA.Link"));
		return new MyHomepage(driver, test);
	}
	public LoginPage clickLogout() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new LoginPage(driver,test);

	}
	
	
	
	
}