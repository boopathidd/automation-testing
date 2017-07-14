package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomepage extends LeafTapsWrappers{
	public MyHomepage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public Createlead clickcreatelead(){

		clickByXpath(prop.getProperty("MyHomepage.createleadButton.Xpath"));
		
		
		return new Createlead(driver, test);

	}
	
	


	public Leadpage clickLeadpagemenu(){

		clickByXpath(prop.getProperty("Leadpage.Menu"));
		
		
		return new Leadpage(driver, test);

	}

	
	
	
	
}
