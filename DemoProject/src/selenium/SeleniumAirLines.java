package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAirLines {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\saka0416\\\\Desktop\\\\Telenet\\\\Selenium_docs\\\\Chrome_path_2\\\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='input_wrapper']/following::input[contains(@name,'cabinClass')]")).click();
		driver.findElement(By.xpath("//span[.='Premium Economy']")).click();
		Thread.sleep(3000);
		
		

	}

}
