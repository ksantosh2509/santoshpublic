package com.selenium.test.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleMaps {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("Wankhede Stadium Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
		Thread.sleep(2000);
		WebElement rating = driver.findElement(By.xpath("//div[@role='button']/child::span/child::span/child::span"));
		System.out.println(rating.getText());
		Thread.sleep(2000);
		WebElement reviewCount = driver.findElement(By.xpath("(//button[contains(@aria-label,'reviews')])[1]"));
		System.out.println(reviewCount.getText());
		driver.close();

	}

}
