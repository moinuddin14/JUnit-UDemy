package com.junit.suite.classes;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	JunitTest1.class,
	JunitTest2.class
})

public class JUnitSuiteRunner {

	
}