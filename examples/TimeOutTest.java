package com.junit.training.examples;

import org.junit.Test;

public class TimeOutTest {
	
	@Test(timeout = 1000)
	public void timeOutTestInfiniteLoop() {
		
		
	}
	
	@Test(timeout = 1000)
	public void timeOutWatingService() {
		
		MyException ex = new MyException();
		ex.establishDBConnection("host:0.0.0.0/8;db:test", 500);
	}
	
	
}
