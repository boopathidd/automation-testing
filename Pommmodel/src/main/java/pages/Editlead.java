package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class Editlead extends LeafTapsWrappers{
	public Editlead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not editlead Page", "FAIL");
		}
	}
	

	


	
	
	

	
public Editlead enterEDCompanyname(String EFcompanyname){


		enterByXpath(prop.getProperty("Editlead.companyname.xpath"),EFcompanyname);

	return this;
}

// Enter password in Login Page
public Editlead enterEDfirstname(String efirst){
	enterByXpath(prop.getProperty("Editlead.firstname.xpath"),efirst);

	return this;		
}


public Editlead enterEdlastname(String Elastname){

	enterByXpath(prop.getProperty("Editlead.lastname.xpath"),Elastname);

	return this;
}

public Viewlead clickeditsubmitbutton(){
	clickByXpath(prop.getProperty("Editlead.Update.Button"));

	return new Viewlead(driver, test);
}


	

}