package com.object.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnotationClass {

	
	//flow chart of junit annotation
	@Test
	public void testCase1(){
		System.out.println("TestCase 1");
	}
	
	@Test
	public void testCase2(){
		System.out.println("TestCase 2");
	}
	
	@BeforeClass
	static public void beforeClass(){
		System.out.println("Before TestCase");
	}
	
	
	@Before
	public void before(){
		System.out.println("Before class");
		
	}
	
	@After
	public void after(){
		System.out.println("After TestCase");
	}
	
	@AfterClass
	static public void afterClass(){
		System.out.println("AfterClass");
	}
}
