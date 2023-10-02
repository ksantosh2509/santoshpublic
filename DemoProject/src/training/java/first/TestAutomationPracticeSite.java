package training.java.first;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationPracticeSite {

	public void testAutomationPractice() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saka0416\\Desktop\\Telenet\\Selenium_docs\\Chrome_path_2\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Santosh");
		Thread.sleep(3000);
		Select speed = new Select(driver.findElement(By.xpath("//select[@id='speed']")));
		speed.selectByVisibleText("Fast");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		WebElement copyText = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		ac.doubleClick(copyText).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Click Me']")).click();
		Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.close();
	}
	
	public void jqueryUi() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\saka0416\\Desktop\\Telenet\\Selenium_docs\\Chrome_path_2\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Resizable']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("switched to Frame");
		WebElement resize = driver.findElement(By.xpath("//*[contains(@id,'resizable')]/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 300, 100).perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
	}
	
	public void quara() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\saka0416\\Desktop\\Telenet\\Selenium_docs\\Chrome_path_2\\chromedriver.exe");
		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 1);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws InterruptedException {
		TestAutomationPracticeSite obj = new TestAutomationPracticeSite();
		//obj.testAutomationPractice();
		//obj.jqueryUi();
		obj.quara();

	}

}
