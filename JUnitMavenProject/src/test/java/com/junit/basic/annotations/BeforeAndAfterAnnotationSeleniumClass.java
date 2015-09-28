package com.junit.basic.annotations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAndAfterAnnotationSeleniumClass {

	private WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rehaan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void openGoogleChromeGoogleDotCom(){
		driver.get("http://google.com");
	}
	
	@Test
	public void openGoogleChromeYahooDotCom(){
		driver.get("http://yahoo.com");
	}
	
}