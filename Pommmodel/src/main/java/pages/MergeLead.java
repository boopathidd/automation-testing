package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLead extends LeafTapsWrappers{

	

	public MergeLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is mergelead Page", "FAIL");
		}
	}
	
	

	
	//clickByXpathNoSnap
	
	public FindleadMergelead clickbyXpathNosnapfromlead() {
		

		clickByXpathNoSnap(prop.getProperty("Mergelead.fromlead.img"));
		switchToLastWindow();
		

		return new FindleadMergelead(driver, test);

	}	
	public FindleadMergelead clickbyXpathNosnapTolead() throws InterruptedException {
		
		//firstwindow(primaryWindowHandle);

		clickByXpathNoSnap(prop.getProperty("Mergelead.Tolead.img"));
switchToLastWindow();
		return new FindleadMergelead(driver, test);

	}	
		

		
	
	
	
	
	
	
	
	

	public Viewlead mergebutton(){
		
		clickByLinkNoSnap(prop.getProperty("Mergelead.Submit.Button"));
		
		acceptAlert();
		return new Viewlead(driver, test);
		
		}
	
	
	
	
		
}