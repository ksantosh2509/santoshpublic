package com.selenium.test.testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWithProperties {

	static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;

	public static void propFileInit() throws Exception {

		fis = new FileInputStream(projectPath + "\\src\\test\\resources\\properties\\testdata.properties");
		prop = new Properties();
		prop.load(fis);

	}

	public static void selectBrowser(String browserName) throws Exception {

		propFileInit();
		try {
			if (prop.getProperty(browserName).equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();

			} else if (prop.getProperty(browserName).equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		} catch (NullPointerException ne) {

			System.out.println("Key is not exists in properties file");
		}
	}

	public static void launchBrowser(String siteLink) {
		try {
			driver.get(prop.getProperty(siteLink));
		} catch (NullPointerException e) {
			System.out.println("Key is not exists in properties file");
		}
	}

	public static void clickElement(String locatorKey) {
		//driver.findElement(By.xpath(prop.getProperty(locatorKey))).click();
		
		try {
			getElement(locatorKey).click();
		} catch (Exception e) {
			System.out.println("xpath is not correct");
		}
	}

	public static void typeText(String locatorKey, String emailid) {
		// driver.findElement(By.cssSelector(prop.getProperty(locatorKey))).sendKeys(emailid);

		try {
			getElement(locatorKey).sendKeys(emailid);
		} catch (NullPointerException e) {

			System.out.println("Please correct the locator key" + locatorKey);
		}
	}

	public static WebElement getElement(String locatorKey) {
		WebElement element = null;

		element = driver.findElement(getLocator(locatorKey));

		return element;

	}

	public static By getLocator(String locatorKey) {
		By locator = null;

		if (locatorKey.endsWith("_id")) {
			locator = By.id(prop.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_xpath")) {
			locator = By.xpath(prop.getProperty(locatorKey));
		} else if (locatorKey.endsWith("_css")) {
			locator = By.cssSelector(prop.getProperty(locatorKey));
		}

		return locator;

	}
	
	public static void closeBrowser()
	{
		driver.close();
	}

}
