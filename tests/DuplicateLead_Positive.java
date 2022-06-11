package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;



public class DuplicateLead_Positive extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc00003";
	}
	@Test(dataProvider = "getData")
	public void tc002(String username, String password,String PhoneNumber) throws InterruptedException {
		new LoginPage()
		.typeUserName(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.click_Phone()
		.typePhoneNumber(PhoneNumber) 
		.clickFindLeads()
		.clickLeadID()
		.clickDuplicateLead()
		.clickDuplicateLeadButton()
		.verifyLeadID();
	
	}
	
	}
