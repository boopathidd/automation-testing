package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class Viewlead extends LeafTapsWrappers {

	public Viewlead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("This is not viewlead Page", "FAIL");
		}
	}

	
	

	public Editlead clickEditButton() {

		clickByXpath(prop.getProperty("Editlead.edit.Button"));

		return new Editlead(driver, test);

	}	
	
	public Viewlead verifyCompanyname(String text) {

		verifyTextByXpath(prop.getProperty("viewlead.companyname.xpath"), text);
		return this;

	}		
	
	public Viewlead verifyFirstname(String text) {


		verifyTextByXpath(prop.getProperty("viewlead.firstname.xpath"), text);
		return this;

	}

	public Viewlead verifylastname(String text) {
		verifyTextByXpath(prop.getProperty("viewlead.lastname.xpath"), text);
		return this;

	}
	
	
	public Leadpage delete() {
		clickByXpath(prop.getProperty("viewlead.Delete.xpath"));
		return new Leadpage(driver, test);

	}
	
	
	
	
}