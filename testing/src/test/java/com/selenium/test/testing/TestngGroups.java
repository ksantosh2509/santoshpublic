package com.selenium.test.testing;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngGroups {
	
	
	SoftAssert sa = new SoftAssert();
	
	@Test(groups= {"sanity","regression"},priority=1,description="Arthemetic Ope")
	public void test()
	{
		int a=10;
		assert a == 5*2:"Number should be"+a;
	}
	
	@Test(groups= {"sanity"},priority=2)
	public void test1()
	{
		assert "santosh".equals("santosh"):"String should be:Santosh";
	}
	
	@Test(groups= {"regression","sanity"},priority=4)
	public void test2()
	{
		System.out.println("Santosh Kumar Kalvakuntla");
	}
	
	@Test(groups="regression",priority=3,description="Assert Equal")
	public void test3()
	{
		sa.assertEquals(true, true);
		sa.assertEquals('c', 'c');
		
		sa.assertAll();
	}

}
