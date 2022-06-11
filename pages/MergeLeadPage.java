package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods{
public MergeLeadPage() {
}
public MergeLeadPage clickonWidgetofFromLeadandFirstResultingLead() throws InterruptedException {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> windowHandlesList = new ArrayList<String>(windowHandles);
	driver.switchTo().window(windowHandlesList.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
	driver.switchTo().window(windowHandlesList.get(0));
	Thread.sleep(3000);
	return this;

}
public MergeLeadPage clickonWidgetofToLeadandSecondResultingLead() throws InterruptedException {
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> towindowHandles = driver.getWindowHandles();
	List<String> towindowHandlesList = new ArrayList<String>(towindowHandles);
	driver.switchTo().window(towindowHandlesList.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[2]")).click();
	driver.switchTo().window(towindowHandlesList.get(0));
	return this;
}
public MergeLeadPage click_MergeButton() {
	driver.findElement(By.linkText("Merge")).click();
	return this;
}
public MergeLeadPage accept_Alert() {
	driver.switchTo().alert().accept();
	return this;
}

public MergeLeadPage clickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return this;
}

public MergeLeadPage enterLeadID(String ID) {
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(ID);
	return this;
}

public ViewLeadPage clickFindLeadsButton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return new ViewLeadPage();	
}
}
