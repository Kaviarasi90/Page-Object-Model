package com.leaftaps.ui.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leaftaps.ui.utility.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
public RemoteWebDriver driver;
public String excelFileName;
public static Properties property;

	
	@BeforeMethod
	public void startBrowser() throws Exception{
		
		// Getting App Config
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("./config/AppConfig.properties");
		prop.load(file);
		// Getting browsername from the property file
		String browserName = prop.getProperty("browserName");
		
		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		// Getting URL from the property file
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Getting Language Config
		property = new Properties();
		FileInputStream file1 = new FileInputStream("./config/"+prop.getProperty("language")+".properties");
		property.load(file1);
	
	
	
	}

	@AfterMethod
	public void endBrowser() {
		driver.close();
	}
	@DataProvider
	public String[][] getData() throws IOException {
		return ReadExcelData.readData(excelFileName);
	}
}
