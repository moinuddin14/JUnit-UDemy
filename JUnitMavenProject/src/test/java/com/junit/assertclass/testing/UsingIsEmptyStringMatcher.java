package com.junit.assertclass.testing;

import static com.junit.assertclass.testing.IsStringEmpty.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static com.junit.assertclass.testing.IsStringNotEmpty.*;

public class UsingIsEmptyStringMatcher {

	@Test
	public void testMethod(){
		assertThat("Trying to run the isStringEmpty Custom Matcher", "", isStringEmpty());
		assertThat("Trying to run the isStringNotEmpty Custom Matcher", "", isStringNotEmpty());
	}
	
}