package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;



public class EditLead_Positive extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc002";
	}
	@Test(dataProvider = "getData")
	public void tc002(String username, String password,String PhoneNumber, String CompanyName) throws InterruptedException {
		new LoginPage()
		.typeUserName(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.typePhoneNumber(PhoneNumber) 
		.clickFindLeads()
		.clickLeadID()
		.clickEditLead()
		.typeCompanyName(CompanyName)
		.clickEditLeadButton()
		.verifyLeadID();

	
	}
	
	}
