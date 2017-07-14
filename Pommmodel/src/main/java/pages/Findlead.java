package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class Findlead extends LeafTapsWrappers {



	public Findlead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not findlead Page", "FAIL");
		}
	}
	
	
	



	
		public Findlead enterfindLeadid(String leadid){
			enterByXpath(prop.getProperty("Findlead.enterleadid.xpath"),leadid);

			return this;
		}
	

		public Findlead lastwindow(){
		switchToLastWindow();
		return this;
		
		}
	
		public Findlead clickFindbutton(){
			clickByXpath(prop.getProperty("findlead.clickbutton.xpath"));
			
			return this;
		}
	
	public Findlead verifyleadid(String text){
		
		verifyTextByXpath(prop.getProperty("Findlead.veriffylead"), text);
		return this;
	}

	
	public Findlead verifyNoleadid(String text){
		
		verifyTextByXpath(prop.getProperty("Findlead.verify.Norecord"), text);
		return this;
	}

	
	
public Viewlead clickleadid(String text){
		clickByXpath(prop.getProperty("Findlead.clickByxpath"));
		return new Viewlead(driver, test);
	}

public MergeLead clickleadidsfromfindleadtoMergeLead() throws InterruptedException{
	clickByXpath(prop.getProperty("Findlead.clickByxpath"));
	//clickByXpathNoSnap(prop.getProperty("Findlead.clickByxpath"));
	Thread.sleep(3000);

return new MergeLead(driver, test);
}
	
	

}
