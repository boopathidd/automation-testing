package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class Createlead extends LeafTapsWrappers{

	public Createlead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not MyHome Page", "FAIL");
		}
	}

	
	public Createlead crcompanyname(String cName){

		enterByXpath(prop.getProperty("Createlead.companyname.xpath"),cName);

			return this;
		}

		// Enter password in Login Page
		public Createlead crfirstname(String cfirst){

			enterByXpath(prop.getProperty("Createlead.firstname.xpath"),cfirst);
			
			return this;		
		}


		public Createlead crlastname(String clast){
			enterByXpath(prop.getProperty("Createlead.lastname.xpath"), clast);

			return this;
		}

		
		
		
		
		public Createlead clickLoginForFailure(){
			clickByXpath(prop.getProperty("Createlead.submitbutton.xpath"));
			return this;
		}
		
		// Verify the error message
		public Createlead verifycnameErrorMsg(String text){
		//	verifyTextContainsById(prop.getProperty("Createlead.error.class"), text);
			verifyTextContainsByXpath(prop.getProperty("Createlead.cnameerror.xpath"), text);
			return this;
		}
	
		public Createlead verifyLasttnameErrorMsg(String text){
			//	verifyTextContainsById(prop.getProperty("Createlead.error.class"), text);
				verifyTextContainsByXpath(prop.getProperty("Createlead.lastnameerror.xpath"), text);
				return this;
			}
		public Createlead verifyfirsttnameErrorMsg(String text){
			//	verifyTextContainsById(prop.getProperty("Createlead.error.class"), text);
				verifyTextContainsByXpath(prop.getProperty("Createlead.firstnameerror.xpath"), text);
				return this;
			}	
		
		
		
		
		public Createlead verifyseccnameErrorMsg(String text){
		//	verifyTextContainsById(prop.getProperty("Createlead.error.class"), text);
			verifyTextContainsByXpath(prop.getProperty("Createlead.secCnameerror.xpath"), text);
			return this;
		}
		public Viewlead createclicksubmit(){
			clickByXpath(prop.getProperty("Createlead.submitbutton.xpath"));

			return new Viewlead(driver, test);
		}
		
		
		
		
		

	
	
	
	
	
	
	
	
}
