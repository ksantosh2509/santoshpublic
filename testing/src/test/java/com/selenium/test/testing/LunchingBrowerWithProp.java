package com.selenium.test.testing;

public class LunchingBrowerWithProp extends BaseWithProperties

{

	public static void main(String[] args) throws Exception {
		selectBrowser("chromebrowser");
		launchBrowser("zoholink");
		clickElement("clicksignin_1_xpath");
		typeText("textboxsignin_css", "ksantosh.2509@gmail.com");
		clickElement("clickNext_xpath");
		typeText("textboxpwd_id", "SeleniumJava");
		clickElement("clicksignin_2_xpath");
		closeBrowser();

	}
	
	

}
