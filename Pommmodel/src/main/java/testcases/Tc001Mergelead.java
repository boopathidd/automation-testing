package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class Tc001Mergelead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setData() {
		testCaseName="mergelead(Positive)";
		testDescription="mergelead";
		browserName="chrome";
		dataSheetName="merge";
		category="Smoke";
		authors="Babu";
	}

	@Test(dataProvider="fetchData")
	public void login(String userName, String password, String loggedInName,String fromleadid,String toleadid,String firstname,String lastname,String verifyid) throws InterruptedException{

		/*	clickByXpath("(//img[@alt='Lookup'])[1]");
		lastwindowhandle();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", fromLead);
		Thread.sleep(6000);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(6000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		firstwindow(PrimaryWindow);
		clickByXpath("(//img[@alt='Lookup'])[2]");
		lastwindowhandle();
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",toLead);
		Thread.sleep(6000);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(6000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		firstwindow(PrimaryWindow);
		System.out.println(driver.getTitle());
		clickByLinktext("Merge");
		Thread.sleep(10000);
		acceptAlert();
	*/
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(loggedInName)
		.clickcrmsfa()
		.clickLeadpagemenu()
		.clickmergeleadMenu()
		
		
        .clickbyXpathNosnapfromlead()

		.enterfindLeadid(fromleadid)
		.clickFindbutton()
		.verifyleadid(fromleadid)
		.clickleadidsfromfindleadtoMergeLead()
		
		
		
		
		.clickbyXpathNosnapTolead()
		
        
		.enterfindLeadid(toleadid)
		.clickFindbutton()
		.verifyleadid(toleadid)
		.clickleadidsfromfindleadtoMergeLead()
		
		
		
		
		.mergebutton()
		
		.verifyFirstname(firstname)
		.verifylastname(lastname);
		
		
		
		
		
		
	
		
	
	
	}
		
		
		

}
