package com.object_TestNG;

import org.testng.annotations.Test;

public class GroupingTestCase {

	
	//take 4 mobiles phones 
	//1) Iphone
	//2)Samsung
	//3)Vivo
	//4)Nokia
	
	@Test(groups={"Iphone"})
	public void Iphone1(){
		System.out.println("Iphone1 Testing");
	}
	
	@Test(groups={"Iphone"})
	public void Iphone2(){
		System.out.println("Iphone2 Testing");
	}
	
	@Test(groups={"Samsung"})
	public void Samsung1(){
		System.out.println("Samsung1 Testing");
	}
	
	@Test(groups={"Samsung"})
	public void Samsung2(){
		System.out.println("Samsung2 Testing");
	}
	
	@Test(groups={"Vivo"})
	public void Vivo1(){
		System.out.println("Vivo1 Testing");
	}
	@Test(groups={"Vivo"})
	public void Vivo2(){
		System.out.println("Vivo2 Testing");
	}
	
	@Test(groups={"Nokia"})
	public void Nokia1(){
		System.out.println("Nokia1 Testing");
	}
	
	@Test(groups={"Nokia"})
	public void Nokia2(){
		System.out.println("Nokia2 Testing");
	}
	
}
