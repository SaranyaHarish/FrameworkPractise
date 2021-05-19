package com.object.Junit1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.object.Junit.FaceBookApplication;

public class Test {

public static void main(String[] args) {
		
		//to test the full module we are going for JunitCore
		Result result = JUnitCore.runClasses(TestSuite.class);
		for(Failure fail :result .getFailures()){
			System.out.println(fail.toString());
		}
		System.out.println("Result"+result.wasSuccessful());
	}
}
