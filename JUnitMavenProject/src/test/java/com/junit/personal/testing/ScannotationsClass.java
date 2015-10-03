package com.junit.personal.testing;

import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.rules.Verifier;
import org.junit.runner.Runner;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.util.Set;

public class ScannotationsClass {

	public static Reflections reflections; 
	
	public static void main(String[] args) {
		 
		/*reflections = new Reflections("org.openqa.selenium");
		Set<Class<? extends TakesScreenshot>> subTypes = reflections.getSubTypesOf(TakesScreenshot.class);
		//System.out.println(subTypes);
		
		for(Class<?> subType:subTypes){
			System.out.println(subType);
		}
		
		System.out.println("****************************************");
		
		reflections = new Reflections("org.junit.rules");
		Set<Class<? extends ExternalResource>> subTypesOfExternalResource = reflections.getSubTypesOf(ExternalResource.class);
		
		for (Class<?> subTypeOfExternalResource:subTypesOfExternalResource){
			System.out.println(subTypeOfExternalResource);
		}
		
		System.out.println("****************************************");*/
		//TestRule
		/*reflections = new Reflections("org.junit.rules");
		Set<Class<? extends TestRule>> subTypesOfTestRule = reflections.getSubTypesOf(TestRule.class);
		
		for (Class<?> subTypeOfTestRule:subTypesOfTestRule){
			System.out.println(subTypeOfTestRule);
			if(subTypeOfTestRule.getName().contains("TestName")){
				System.out.println("#################################");
				Method[] methods = subTypeOfTestRule.getMethods();
				for(Method method:methods){
					System.out.println(method.getName().toString());
				}
				System.out.println("#################################");
			}
		}
		System.out.println("#################################");
		//System.out.println("");
		String allPackages = "org.hamcrest, org.hamcrest.core , org.junit, org.junit.experimental,"
				+ " org.junit.experimental.categories, org.junit.experimental.max, org.junit.experimental.results, "
				+ "org.junit.experimental.runners, org.junit.experimental.theories, org.junit.experimental.theories.suppliers, "
				+ "org.junit.matchers, org.junit.rules, org.junit.runner, org.junit.runner.manipulation, org.junit.runner.notification, "
				+ "org.junit.runners, org.junit.runners.model, org.junit.runners.parameterized, org.junit.validator";
		String onePackage = "org.junit.runner";
		reflections = new Reflections(onePackage, "org.junit.matchers", "org.junit.experimental.runners", "org.junit.experimental.theories");
		Set<Class <? extends Runner>> subTypesofRunner = reflections.getSubTypesOf(Runner.class);
		System.out.println(subTypesofRunner);*/
		
		reflections = new Reflections("org.junit, org.junit.experimental","org.junit.experimental.categories", "org.junit.experimental.max", "org.junit.experimental.results","org.junit.experimental.runners", "org.junit.experimental.theories", "org.junit.experimental.theories.suppliers","org.junit.matchers", "org.junit.rules", "org.junit.runner", "org.junit.runner.manipulation", "org.junit.runner.notification","org.junit.runners", "org.junit.runners.model", "org.junit.runners.parameterized", "org.junit.validator");
		Set<Class <? extends TestWatcher>> subTypesOfTestWatcher = reflections.getSubTypesOf(TestWatcher.class);
		
		System.out.println(subTypesOfTestWatcher);
	}

}