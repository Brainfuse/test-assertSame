package com.brainfuse.gwt.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class TestGwtEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		TestInterface interface1 = GWT.create(TestInterface.class);
		interface1.test();

	}

}
