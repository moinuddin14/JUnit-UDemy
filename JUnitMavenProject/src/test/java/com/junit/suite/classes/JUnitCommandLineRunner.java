package com.junit.suite.classes;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitCommandLineRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(JUnitSuiteRunner.class);
		for(Failure fail:result.getFailures()){
			System.out.println(fail.toString());
		}
		
		if(result.wasSuccessful())
			System.out.println("All the Test Cases Got Passed");
	}

}
