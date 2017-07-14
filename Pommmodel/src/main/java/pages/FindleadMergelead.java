package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindleadMergelead extends LeafTapsWrappers {



	public FindleadMergelead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		
		if(!verifyTitle("Find Leads")){
			reportStep("This is not findlead Page", "FAIL");
		}
	}
	
	
	



	
		public FindleadMergelead enterfindLeadid(String leadid) throws InterruptedException{
		Thread.sleep(3000);	
		lastwindowhandle();
			enterByXpath(prop.getProperty("Findlead.enterleadid.xpath"),leadid);

			return this;
		}
	

		public FindleadMergelead lastwindow(){
		switchToLastWindow();
		return this;
		
		}
	
		public FindleadMergelead clickFindbutton(){
			clickByXpath(prop.getProperty("findlead.clickbutton.xpath"));
			
			return this;
		}
	
	public FindleadMergelead verifyleadid(String text){
		
		verifyTextByXpath(prop.getProperty("Findlead.veriffylead"), text);
		return this;
	}

	
	public FindleadMergelead verifyNoleadid(String text){
		
		verifyTextByXpath(prop.getProperty("Findlead.verify.Norecord"), text);
		return this;
	}

	
	
public Viewlead clickleadid(String text){
		clickByXpath(prop.getProperty("Findlead.clickByxpath"));
		return new Viewlead(driver, test);
	}

public MergeLead clickleadidsfromfindleadtoMergeLead() throws InterruptedException{
	clickByXpathNoSnap(prop.getProperty("Findlead.clickByxpath"));
	Thread.sleep(3000);
switchToLastWindow();
return new MergeLead(driver, test);
}
	
	

}
