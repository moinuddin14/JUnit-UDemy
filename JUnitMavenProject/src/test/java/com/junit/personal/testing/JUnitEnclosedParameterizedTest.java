package com.junit.personal.testing;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Enclosed.class)
public class JUnitEnclosedParameterizedTest {

	static class Person {
		final String name;
		public Person(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return String.format("Person[name: %s]", name);
		}
	}
	
	@RunWith(Parameterized.class)
	public static class PersonNameTest {
	
		@Parameters
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
			System.out.println(name);
			Person person = new Person(name);
			assertEquals(name, person.name);
			System.out.println(name);
			System.out.println(person.name);
		}
	}
	
	@RunWith(Parameterized.class)
	public static class PersonTest {
	
	    @Parameters
	    public static Collection<Object[]> data() {
	            return Arrays.asList(new Object[][]{
	            		new Object[]{new Person("Christian")},
	            		new Object[]{new Person("Joshua")},
	            });
	    }

	    Person person;
		
	    public PersonTest(Person person) {
	       this.person = person;
	    }
		
	    @Test
            public void savePerson() {
	      System.out.println(person);
	    }
	}
}