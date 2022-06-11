package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	public EditLeadPage() {
	}
	public EditLeadPage typePhoneNumber(String PhoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
		return this;
	}
	public EditLeadPage clickFindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	public EditLeadPage clickLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}

	public EditLeadPage clickEditLead() {
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}

	public EditLeadPage typeCompanyName(String CompanyName) {
		WebElement company_Name = driver.findElement(By.id("updateLeadForm_companyName"));
		company_Name.clear();
		company_Name.sendKeys(CompanyName);		
		return this;
	}

	public ViewLeadPage clickEditLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}




}
