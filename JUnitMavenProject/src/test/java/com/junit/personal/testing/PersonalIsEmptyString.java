package com.junit.personal.testing;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;

public class PersonalIsEmptyString extends BaseMatcher<Object>{

	@Factory
	public static PersonalIsEmptyString isEmptyStringNew()
	{
	    return new PersonalIsEmptyString();
	}

	public boolean matches(Object item) {
		return "".equals(item);
	}

	public void describeTo(Description description) {
		description.appendText("Empty String");
	}
	
	public void describeMismatch(Object item, Description mismatchDescription) {
		mismatchDescription.appendText("was ").appendValue(item);
    }
}