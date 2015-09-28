package com.junit.paramterize;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Enclosed.class)
public class JUnitEnclosedParameterizedTest {
	
	@RunWith(Parameterized.class)
	public static class PersonNameTest {
	
		@Parameters(name="{index}=PersonNameTest({0})")
	        public static Collection<Object[]> data() {
	            return Arrays.asList(new Object[][]{
	            		new Object[]{"Christian"},
	            		new Object[]{"Joshua"},
	            });
	        }
		
		String name;
	
		public PersonNameTest(String name) {
			this.name = name;
		}
		
		@Test
		public void createPersonWithName(){
			System.out.println("PersonNameTest: "+name);
		}
	}
	
	@RunWith(Parameterized.class)
	public static class PersonTest {
	
	    @Parameters(name="{index}=PersonTest({0})")
	    public static Collection<Object[]> data() {
	            return Arrays.asList(new Object[][]{
	            		new Object[]{"Roy"},
	            		new Object[]{"Hales"},
	            });
	    }

	    public String person;
		
	    public PersonTest(String person) {
	       this.person = person;
	    }
		
	    @Test
            public void savePerson() {
	    		System.out.println("PersonTest: "+person);
	    }
	}
}