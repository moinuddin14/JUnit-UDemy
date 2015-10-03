package com.junit.basics.rules;

import java.util.concurrent.Callable;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.Matchers.*;

public class ErrorCollectorClass {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void impErrorColRule(){
		
		errCol.checkThat(11, is(10));
		errCol.addError(new ArithmeticException());
		errCol.addError(new NullPointerException());
		errCol.checkThat("Comparing Hello World", "Hello World", is("Hello Worl"));
		errCol.checkSucceeds( new Callable<Integer>(){
			public Integer call(){
				return (10/0);
			};
		});
		System.out.println("End of the Test Case");
	}
	
}