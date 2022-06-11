package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLead_Positive extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc001";
	}

	@Test(dataProvider = "getData")
	public void tc001(String username, String password, String cName, String fName, String lName) {
		
		
		new LoginPage(driver)
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLeadButton()
		.verifyLeadId();
		
		
		// Reference for building this
		
		
		
		
		
		
		/*LoginPage page1 = new LoginPage().typeUsername(username);
		page1.typePassword(password);
		
		WelcomePage page2 = new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton();
		
		HomePage page3 = new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA();
		
		MyLeadsPage page4 = new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads();
		
		CreateLeadPage page5 = new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead();*/
		
		
		
		
		
		
		/*LoginPage page1 = new LoginPage();
		page1.typeUsername(username);
		page1.typePassword(password);
		page1.clickLoginButton();
		
		WelcomePage page2 = new WelcomePage();
		page2.clickCRMSFA();
		
		HomePage page3 = new HomePage();
		page3.clickLeads();
		
		MyLeadsPage page4 = new MyLeadsPage();
		page4.clickCreateLead();
		
		CreateLeadPage page5 = new CreateLeadPage();
		page5.typeCompanyName(cName);
		page5.typeFirstName(fName);
		page5.typeLastName(lName);
		page5.clickCreateLeadButton();
		
		ViewLeadPage page6 = new ViewLeadPage();
		page6.verifyLeadId();*/
	}
}
