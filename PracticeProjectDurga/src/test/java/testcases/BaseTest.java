package testcases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class BaseTest {

	
	
	@BeforeTest
	@Test
	public void beforeTest()
	{
	}
	
	@BeforeMethod
	@Test
	public void beforeMethod()
	{
		//one annotation method reference can be used in another annotation method then we use ITestContext
		
	}
	
	

}
