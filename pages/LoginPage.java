package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
	}
	public LoginPage typeUsername(String username) {
		driver.findElement(By.id(property.getProperty("loginPage.username.id"))).sendKeys(username);
		return this;
	}
	public LoginPage typePassword(String password) {
		driver.findElement(By.id(property.getProperty("loginPage.password.id"))).sendKeys(password);
		return this;
	}
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className(property.getProperty("loginPage.Login.class"))).click();
		return new WelcomePage(driver);
	}
}
