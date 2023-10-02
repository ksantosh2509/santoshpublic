package com.selenium.test.testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	
	
	public static void chromeBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addExtensions(new File("C:\\Users\\saka0416\\Desktop\\Telenet\\Selenium_docs\\Ad_Block\\extension_4_46_0_0.crx"));
		option.addArguments("user-data-dir=C:\\Users\\saka0416\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		
		ChromeDriver driver = new ChromeDriver(option);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'DOC')]/following::a[1]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[text()='100kB']/following::a[1]"))).click();
		Thread.sleep(6000);
		//driver.close();
		driver.quit();
		
	}
	
	public static void edgeBrowser()
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
	}

	public static void main(String[] args) throws InterruptedException {
	
		chromeBrowser();
	}

}
