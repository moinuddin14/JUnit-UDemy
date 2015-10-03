package com.junit.basics.rules;

import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.junit.AfterClass;
import org.junit.AssumptionViolatedException;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.testng.SkipException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestWatcherRuleClass {

	private static String Watcher = "";
	private static String logFile = "logfile.txt";
	private static PrintWriter writer;
	
	@BeforeClass
	public static void setup() throws FileNotFoundException{
		writer = new PrintWriter(logFile);
	}
	
	@Rule
	public TestWatcher testWatcher= new TestWatcher(){
		
		protected void succeeded(Description description) {
			
			
		};
		
		protected void failed(Throwable e, Description description) {
			
		};
		
		protected void skipped(AssumptionViolatedException e, Description description) {
			
			
		};
		
		protected void starting(Description description) {
			Watcher += "***************";
			Watcher += "\n"+"Started: "+description.getMethodName()+"\n";
		};
		
		protected void finished(Description description) {
			
			Watcher += "Finished with the method: "+description.getMethodName()+"\n";
			
		};
		
	};
	
	@Test
	public void successTest(){
		System.out.println("Inside the Test Method successTest");
	}
	
	@Test
	public void failTest(){
		System.out.println("Inside the Test Method failTest");
		fail();
	}
	
	@Test
	public void skipTest(){
		System.out.println("Inside the Test Method skipTest");
		throw new SkipException("This Test Case is Skipped");
	}
	
	@AfterClass
	public static void afterCompletionOfAllTests(){
		System.out.println(Watcher);
		writer.println(Watcher);
		writer.close();
	}
}
