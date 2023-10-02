package com.selenium.test.testing;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingaporeAirLines {
	public static void main(String[] args) throws InterruptedException {
		// Chrome Options
		ChromeOptions options = new ChromeOptions();
		
		// Disabling Chrome Notifications
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		//Launching Website
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		
		//maximize window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Accepting cookie to click on accept
		driver.findElement(By.xpath("//a[@id='cookie-continue']")).click();
		Thread.sleep(3000);
		
		//JavaScript to Page Scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		
		//Click on Origin City Auto Suggestion Box and sending part of the destination
		WebElement originCity = driver.findElement(By.xpath("//input[@id='flightOrigin1']"));
		originCity.click();
		originCity.sendKeys("san");
		
		//Storing Auto Suggestions in List
		List<WebElement> suggestionCity = driver.findElements(By.xpath("//div[@class='suggestion__city']"));
		System.out.println(suggestionCity.size());
		
		//loop on above list and comparing text with required city then breaking the loop
		for (int i = 0; i < suggestionCity.size(); i++) {
			System.out.println(suggestionCity.get(i).getText());
			if (suggestionCity.get(i).getText().contains("San Sebastian, Spain"))
			{
				suggestionCity.get(i).click();
				break;
			}	
		}
		Thread.sleep(3000);
		
		//Clicking on Drop Down
		driver.findElement(By.xpath("//div[@class='input_wrapper']/following::input[contains(@name,'cabinClass')]"))
				.click();
		Thread.sleep(3000);
		
		//Selecting value from Drop Down
		driver.findElement(By.xpath("//span[.='Premium Economy']")).click();
		Thread.sleep(3000);
		
		//Storing all the links with anchor tags in list and printing them
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		System.out.println("Number of Tags: " + tags.size());
		for (int i = 0; i < tags.size(); i++) {
			System.out.println(tags.get(i).getAttribute("href"));
			System.out.println(tags.get(i).getText());
		}
		driver.close();

	}

}
