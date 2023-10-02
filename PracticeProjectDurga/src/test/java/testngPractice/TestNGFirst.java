package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFirst {
	
	@Test
	public void test()
	{
		System.out.println("TestNG First test");
		Assert.assertEquals('s', 's');
	}

}
