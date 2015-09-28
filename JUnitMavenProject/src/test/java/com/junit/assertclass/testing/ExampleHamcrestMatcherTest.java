package com.junit.assertclass.testing;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ExampleHamcrestMatcherTest {

    @Test
    public void testWithHamcrestMatchers() {
       
    	//assertThat("Hello Worl", is("Hello World"));
    	//assertThat("Hell World", anyOf(is("Hello World"), containsString("World")));
    	
    	//assertTrue(2>5);
    	//assertThat(2, greaterThan(5));
    	//assertThat(“Hello World", anyOf(is(“Hello World"), containsString(“World")));
    	
    	//assertEquals("abc", 123);
    	assertThat("123", is("abc"));
    }
}