package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportHandsonTest
{		
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("targets/spark.html");
		WebDriver driver = new ChromeDriver();

		
		@AfterSuite
		public void tearDown()
		{
			report.flush();
			driver.quit();
		}
		
		@BeforeTest
		public void launch()
		{
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}
		
		@Test(testName = "Verify presnece of google search button",priority = 0)
		public void checkGoogleSearchButton()
		{			
			boolean flag = driver.findElement(By.xpath("//input[@value='Google Search' and @class='gNO89b']")).isEnabled();	
			Assert.assertTrue(flag, "Verify google search button is enable");
		}
		
		@Test(testName = "Verify google home page title",priority = 1)
		public void getTitle()
		{			
			String title = driver.getTitle();			
			Assert.assertEquals(title, "Google");
		}	

}
