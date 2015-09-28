package com.junit.personal.testing;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class MockitoMultiplyTestClass {

	@Mock
	Math mathObj;
	
	@Before
	public void setUp(){
		initMocks(this);
		when(mathObj.mul(anyInt(), eq(0))).thenReturn(0);
	}
	
	@Test
	public void testMultiply(){
		System.out.println(mathObj.mul(20, 0));
	}
}
