package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public MyLeadsPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.createLead.linktext"))).click();
		return new CreateLeadPage(driver);
	}
}
