package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
	}
	
	public ViewLeadPage verifyLeadId() {
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println(leadID);
		return this;
	}
}
