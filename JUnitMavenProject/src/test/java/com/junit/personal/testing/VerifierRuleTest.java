package com.junit.personal.testing;

import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.Verifier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifierRuleTest {
	
	private static String errorMsg=null;
	private static WebDriver driver;
	private static String chromeDriverPath="C:\\Users\\Rehaan\\git\\JUnitMavenProject"
			+ "\\JUnitMavenProject\\src\\test\\resources\\chromedriver.exe";
	private static String str;
	private static String methodName;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}
	
	@Rule
	public TestName testName = new TestName();
	
	@Rule
	public Verifier verifier = new Verifier() {
		@Override public void verify() {
			//Assert.assertEquals("Yahoo", driver.getTitle().toString());
			str+=" World";
			System.out.println("Running the Verifier for Method: "+methodName);
			if(driver.getWindowHandle()!=null){
				System.out.println(driver.getWindowHandle().toString());
				driver.quit();
			}else
				System.out.println("Driver is Quit for the method"+methodName);
         }
	};
	
	@Test
	public void openGoogleChromeGoogleDotCom() throws Exception{
		driver.get("http://google.com");
		str="Hello";
		methodName = testName.getMethodName();
	}
	
	@Test
	public void openGoogleChromeYahooDotCom() throws Exception{
		//driver.get("http://yahoo.com");
		System.out.println("Value of String str: "+str);
		Assert.assertEquals("Hello World", str);
		methodName = testName.getMethodName();
	}
	
}