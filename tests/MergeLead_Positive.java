package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;


import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;



public class MergeLead_Positive extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc003";
	}
	@Test(dataProvider = "getData")
	public void tc002(String username, String password,String ID) throws InterruptedException {
		new LoginPage()
		.typeUserName(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickonWidgetofFromLeadandFirstResultingLead()
		.clickonWidgetofToLeadandSecondResultingLead()
		.click_MergeButton() 
		.accept_Alert()
		.clickFindLeads()
		.enterLeadID(ID)
		.clickFindLeadsButton()
		.verifyDisplaying_records();

	
	}
	
	}
