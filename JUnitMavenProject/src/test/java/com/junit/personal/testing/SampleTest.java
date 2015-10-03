package com.junit.personal.testing;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SampleTest {

	private TestRule seleniumServerRule = new ExternalResource() {
		
		@Override
		protected void before() throws Throwable {
			System.out.println("start server");
		}

		@Override
		protected void after() {
			System.out.println("stop server");
		}
		
	};
	
	private TestRule screenshotRule = new TestWatcher() {
		
		@Override
		protected void failed(Throwable e, Description description) {
			String testMethod = description.getClassName() + "#" + description.getMethodName();
			System.out.println("Screenshot of the failed test " + testMethod);
		}

	};
	
	@Rule
	public TestRule ruleChain = RuleChain.outerRule(seleniumServerRule).around(screenshotRule);
	
	@Before
	public void setUp() {
		System.out.println("\tbefore");
	}
	
	@After
	public void tearDown() {
		System.out.println("\tafter");
	}

	@Test
	public void testA() throws Exception {
		System.out.println("\t\ttest a");
		fail();
	}

	@Test
	public void testB() throws Exception {
		System.out.println("\t\ttest b");
	}
}