package com.junit.personal.testing;

import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.AssumptionViolatedException;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.testng.SkipException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WatchmanTest {
	
	private static String fileName = "out.txt";
	private static PrintWriter outputStream; 
	private static String watchedLog="";
	private static Date date = new Date();
	
	@BeforeClass
	public static void setup() throws FileNotFoundException{
		outputStream = new PrintWriter(fileName);
	}
	
  @Rule
  public TestWatcher watchman = new TestWatcher() {
    
	  
	  @Override
    protected void succeeded(Description description) {
    	
      watchedLog += "Time Stamp: "+"["+(date.getMonth()+1)+"/"+date.getDate()+"/"+(date.getYear()+1900)+"]"+ " "+"Passed"+" "+description.getMethodName() +" " + "success!\n";
      //outputStream.println(watchedLog);
    }

    @Override
    protected void failed(Throwable e, Description description) {
      watchedLog += description.getMethodName() +" " + e.getClass().getSimpleName() + "\n";
      //outputStream.println(watchedLog);
    }

    @Override
    protected void skipped(AssumptionViolatedException e, Description description) {
      watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
      //outputStream.println(watchedLog);
    }

    @Override
    protected void starting(Description description) {
      super.starting(description);
      watchedLog+="**************************************";
      watchedLog+="\n";
      watchedLog += "Starting the Test Method: "+description.getMethodName()+ "\n";
      //outputStream.println(watchedLog);
    }

    @Override
    protected void finished(Description description) {
      super.finished(description);
      watchedLog += "Finished the Test Method: "+description.getMethodName()+ "\n";
      //outputStream.println(watchedLog);
    }
  };

  @Test
  public void fails() {
    fail();
  }

  @Test
  public void succeeds() {
  }
  
  @Test
  public void skipTest(){
	  throw new SkipException("Skipping the Test");
  }
  
  @AfterClass
  public static void afterTest(){
	  System.out.println(watchedLog);
	  outputStream.println(watchedLog);
	  outputStream.close();
  }
}