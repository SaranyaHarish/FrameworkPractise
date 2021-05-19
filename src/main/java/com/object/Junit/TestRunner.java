package com.object.Junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	
	public static void main(String[] args) {
		
		//to test the full module we are going for JunitCore
		Result result = JUnitCore.runClasses(FaceBookApplication.class);
		for(Failure fail :result .getFailures()){
			System.out.println(fail.toString());
		}
		System.out.println("Result"+result.wasSuccessful());
	}
}
