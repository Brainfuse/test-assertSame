package com.brainfuse.gwt.test.client;
import org.junit.Test;

import com.google.gwt.junit.client.GWTTestCase;

public class FailedGwtTest extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.brainfuse.gwt.test.TestGwt";
	}
	
	@Test
	public void test(){
		assertTrue(true);
		
	}
	private final String msg = "message";
	private final String username = "brain";
	private final String password = "brainfuse";
	private final String to = "trainme";
	


}
