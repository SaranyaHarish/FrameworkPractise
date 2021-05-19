package com.object_failedTestCase;

import static org.testng.Assert.assertEquals;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class TestCase {

	//failedTestng.xml
//retry analyser(interface)
	//Iannotationtransformer(interface)
	
	@Test(retryAnalyzer=RetryListener.class)
	public void testCase1(){
		assertEquals(true,false);
	}
	
	@Test
	public void testCase2(){
		assertEquals(false,false);
	}
}
