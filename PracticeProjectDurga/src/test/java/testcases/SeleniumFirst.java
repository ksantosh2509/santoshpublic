package testcases;

import java.lang.module.FindException;
import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFirst {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String str="https://www.saucedemo.com/";
		driver.get(str);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(20);
		
		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 
		 String dropDwnXpath="//select[contains(@class,'product_sort_container')]";
		 WebElement drpDwn;
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
		  drpDwn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropDwnXpath)));
		 
		 Select selectText = new Select(drpDwn);
		 selectText.selectByVisibleText("Price (low to high)");
		 drpDwn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropDwnXpath)));
		 Select selectIndex = new Select(drpDwn);
		 selectIndex.selectByIndex(1);
		 drpDwn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropDwnXpath)));
		 Select selectValue = new Select(drpDwn);
		 selectValue.selectByValue("za");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 WebElement linkedInIcon = driver.findElement(By.xpath("//a[text()='LinkedIn']"));
		 js.executeScript("arguments[0].scrollIntoView(true);",linkedInIcon);
		 js.executeScript("window.scrollTo(0,0)");
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 
		 linkedInIcon.click();
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 int size = windowHandles.size();
		 
		 Object[] wHArray = windowHandles.toArray();
		 
		 for(Object i:wHArray)
		 {
			 System.out.println("WindowHandle: "+ i);
		 }
		 
		 
		 
		 Iterator<String> itr = windowHandles.iterator();
		 
		 while(itr.hasNext())
		 {
			 driver.switchTo().window(itr.next());
		 }
		 
		 System.out.println(size);
		 
		
	}

}
