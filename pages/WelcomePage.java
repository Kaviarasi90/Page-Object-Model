package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public WelcomePage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
	}

	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText(property.getProperty("welcomePage.crmsfa.linktext"))).click();
		return new HomePage(driver);
	}
}
