package com.junit.assertclass.testing;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class IsStringNotEmpty extends BaseMatcher<Object>{

	@Factory
	public static IsStringNotEmpty isStringNotEmpty(){
		return new IsStringNotEmpty();
	}
	
	public boolean matches(Object item) {
		return !("".equals(item));
	}

	public void describeTo(Description description) {
		description.appendText("Not Empty String");
	}
	
	public void describeMismatch(Object item, Description mismatchDescription){
		mismatchDescription.appendText("was ").appendValue(item);
	}
	
}
