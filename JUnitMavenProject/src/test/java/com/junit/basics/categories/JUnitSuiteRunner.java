package com.junit.basics.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory({SlowTests.class})
@ExcludeCategory({RegressionTests.class})
@Suite.SuiteClasses({
	JUnitTest3.class,
	JUnitTest4.class,
	JUnitTest5.class,
	JUnitTest6.class
})

public class JUnitSuiteRunner {

}