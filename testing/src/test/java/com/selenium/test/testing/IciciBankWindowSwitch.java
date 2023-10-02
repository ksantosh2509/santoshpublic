package com.selenium.test.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IciciBankWindowSwitch {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@class='lazy loaded'][contains(@src,'dream-about-it-own-d')])[1]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='PL'][@class='lazy loaded']"))).click();
		Set<String> windowHandle = driver.getWindowHandles();
		
		
		/*
		 * for(String wh :windowHandle) { System.out.println(wh.charAt(0)); }
		 */
		
		// Converted Set to array and accessing by Index as it returns Object type so type casted to String
		driver.switchTo().window((String) (windowHandle.toArray())[1]);
		System.out.println(driver.getTitle());
		
		//System.out.println((windowHandle.toArray())[0]);
		//System.out.println((windowHandle.toArray())[1]);
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
