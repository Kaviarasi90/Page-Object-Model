package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DeleteLeadPage extends ProjectSpecificMethods{
	public DeleteLeadPage() {
	}
	public DeleteLeadPage typePhoneNumber(String PhoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
		return this;
	}
	public DeleteLeadPage clickFindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	public DeleteLeadPage clickLeadID_DeleteLead_Find_Leads_showDeletedLeadID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	public ViewLeadPage clickFind_LeadsButton(){
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return new ViewLeadPage();	
		}
}
