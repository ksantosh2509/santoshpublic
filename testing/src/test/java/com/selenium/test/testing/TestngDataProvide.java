package com.selenium.test.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDataProvide {

	@Test(dataProvider = "Login")
	public void loginTest(String userName, String pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}

	@DataProvider(name = "Login")
	public Object[][] dataProvider() {

		return new Object[][] { { "standard_user", "secret_sauce" }, { "problem_user", "secret_sauce" } };

	}

}
