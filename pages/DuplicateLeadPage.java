package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
	public DuplicateLeadPage() {
	}
	public DuplicateLeadPage typePhoneNumber(String PhoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
		return this;
	}
	public DuplicateLeadPage clickFindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	public DuplicateLeadPage clickLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}

	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return this;
	}

	public ViewLeadPage clickDuplicateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}




}
