package com.junit.personal.testing;

import java.util.concurrent.Callable;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorClass {
	
	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();
	
	@Test
	public void errorCollectorMethod(){
		errorCollector.checkSucceeds( new Callable<Integer>(){
			public Integer call(){
				return (10/0);
			};
		});
		errorCollector.addError(new Throwable("First Error"));
		errorCollector.addError(new Throwable("Second Error"));
		errorCollector.addError(new Throwable("Third Error"));
		//System.out.println((10/0));
		errorCollector.addError(new Throwable("Fourth Error"));
		errorCollector.addError(new Throwable("Fifth Error"));
		errorCollector.addError(new Throwable("Sixth Error"));
		System.out.println("Test Case Passed");
	}
}
