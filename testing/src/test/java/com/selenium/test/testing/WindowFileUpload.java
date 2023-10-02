package com.selenium.test.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowFileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("C:\\Users\\saka0416\\Desktop\\Telenet\\Selenium_docs\\test.txt");
		driver.findElement(By.xpath("//input[@name='note']")).sendKeys("Selenium Test File");
		driver.findElement(By.xpath("//input[@value='Press']")).click();
		driver.close();

	}

}
