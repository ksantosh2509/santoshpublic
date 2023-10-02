package com.selenium.test.testing;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngTest {
	
	int a = 10;
	int b = 12;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Test Cases execution Started");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Test cases execution ended");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Launching Brower");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Closing Browser");
	}
	
	
	@Test(priority=1, description = "Login")
	public void loginTest() {
		System.out.println("Login Successfull");
	}
	
	@Test(priority=2, description = "Logout")
	public void logOut() {
		System.out.println("Logout Successfull");
	}
	
	@Test
	public void testAddition()
	{
		
		softAssert.assertEquals(a+b,22,"Assert-1"); 
		softAssert.assertEquals(a+b,22,"addition of two numbers should be 22");
		softAssert.assertAll();
	}
}
