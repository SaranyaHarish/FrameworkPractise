package com.object_TestNG;

import org.testng.annotations.Test;

public class Priority {

	//to drive a car
	@Test(priority=0)
	public void StartTheCar(){
		System.out.println("Start the car");
	}
	
	@Test(priority=1)
	public void FirstGear(){
		System.out.println("First Gear");
	}
	
	@Test(priority=2)
	public void SecondGear(){
		System.out.println("Second Gear");
	}
	
	@Test(enabled=false)
	public void ThirdGear(){
		System.out.println("Third Gear");
	}
}
