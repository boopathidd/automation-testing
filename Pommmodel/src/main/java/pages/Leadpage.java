package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class Leadpage extends LeafTapsWrappers{

	public Leadpage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not findlead Page", "FAIL");
		}
	}
	
	public Findlead clickFindleadMenu(){
		clickByXpath(prop.getProperty("Leadpage.Findlead.Menu"));
		return new Findlead(driver, test);
	}
	
	
	
	public MergeLead clickmergeleadMenu(){
		clickByXpath(prop.getProperty("Mergelead.Menu.xpath"));
		return new MergeLead(driver, test);
	}
}