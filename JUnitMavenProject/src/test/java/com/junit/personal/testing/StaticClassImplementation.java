package com.junit.personal.testing;

import org.junit.Test;

public class StaticClassImplementation {

	@Test
	public void letsTestStaticClass(){
		
		StaticClass staticClass = new StaticClass();
		StaticClass.StaticClassInner abc = staticClass.new StaticClassInner();
	}
}
