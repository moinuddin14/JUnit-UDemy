package com.junit.assertclass.testing;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class IsStringEmpty extends BaseMatcher<Object>{

	//Extend BaseMatcher
	//Factory Annotated Static Method that will return the class object
	//Write the logic inside the matches method
	//Override the methods in BaseMatcher
	//Override the method in Matcher (Basematcher's parent Interface) i.e., describemismatch
	
	@Factory
	public static IsStringEmpty isStringEmpty(){
		return new IsStringEmpty();
	}
	
	public boolean matches(Object item) {
		return "".equals(item);
	}

	public void describeTo(Description description) {
		description.appendText("Empty String");
	}
	
	public void describeMismatch(Object item, Description mismatchDescription){
		mismatchDescription.appendText("was ").appendValue(item);
	}
	
}