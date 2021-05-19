package com.object.Junit1;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardandSoft {

	
	/*@Test
	public void testCase1(){
		//hardAssert
		System.out.println("before Assertion");
		Assert.assertEquals(true, false);
		System.out.println("After Assertion");
	}*/
	
	@Test
	public void testCase2(){
		SoftAssert assert1= new SoftAssert();
		System.out.println("Before Assertion");
		assert1.assertEquals(true,false);
		System.out.println("After Assertion");
		
	}
}
