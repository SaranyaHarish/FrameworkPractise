package com.object.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo {

	//verify the testcases
	//using Junit Annotations
	
	@Test
	public void testSetup(){
		String str ="Iam testing the Junit!!!";
		//assertEquals is one of the functuion comes from assertclass
		assertEquals("Iam testing the Junit",str);
	}
}
