package com.junit.basics.rules;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifierRuleClass {

	private WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rehaan\\git\\JUnitMavenProject\\JUnitMavenProject\\src\\test"
				+ "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Rule
	public Verifier verifier = new Verifier() {
		
		@Override public void verify(){
			
			if(driver.getWindowHandle()!=null){
				System.out.println("The Driver is still active and its windown handle is: "+driver.getWindowHandle());
				Assert.assertEquals("Yahoo", driver.getTitle());
				driver.quit();
				
			}else
				System.out.println("The Driver is already quite");
         }

	};
	
	@Test
	public void openGoogleChromeGoogleDotCom() {
		driver.get("http://google.com");
	}
	
	@Test
	public void openGoogleChromeYahooDotCom() {
		driver.get("http://yahoo.com");
	}
	
}