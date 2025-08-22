package com.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class method");
	}
	
	@BeforeMethod(enabled = false)
	public void beforeMethod()
	{
		System.out.println("Before Method method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test method");
	}
	
	@Test(invocationCount = 5)
	public void TestMethod()
	{
		System.out.println("Test method");
	}
	
	@AfterTest
	public void AafterTest()
	{
		System.out.println("after test method");
	}
	
	@AfterMethod
	public void AafterMethod()
	{
		System.out.println("after method method");
	}
	
	@AfterClass
	public void AafterClass()
	{
		System.out.println("after class method");
	}
	
	@AfterSuite
	public void AafterSuite()
	{
		System.out.println("after suite method");
	}

}
