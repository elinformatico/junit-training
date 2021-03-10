package com.junit.training.rules;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RulesUsingTimeOut {

	@Rule
	public Timeout tiempoGlobal = Timeout.seconds(2);
	
	@Test
	public void validateTimeOutService() 
			throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(1);
	}
}
