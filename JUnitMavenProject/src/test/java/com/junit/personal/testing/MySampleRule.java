package com.junit.personal.testing;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/*
 * Step1: Extend the TestRule
 * Step2: Implement apply method of TestRule that returns Statement
 * Step3: Write a new return Statement by implementing the evaluate statement
 * Step4: Write logic for before, during and after
 * 
 */

public class MySampleRule implements TestRule{

	public Statement apply(final Statement base, Description description) {
		
		return new Statement() {
			
			@Override
			public void evaluate() throws Throwable {
				System.out.println("before");
				System.out.println("Next after before");
				try{
					base.evaluate();
				}finally{
					System.out.println("This is the clean up activity");
				}
			}
		};
	}
}