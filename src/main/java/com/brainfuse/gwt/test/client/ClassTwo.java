package com.brainfuse.gwt.test.client;

public class ClassTwo implements TestInterface {

	@Override
	public void test() {
		ClassOne classTest = new ClassOne();
		classTest.test(); 
		
	}

}
