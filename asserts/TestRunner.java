package com.junit.training.asserts;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.junit.training.asserts.ObjectAssertionTest;

public class TestRunner {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(ObjectAssertionTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println("Failure: " + failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
}
