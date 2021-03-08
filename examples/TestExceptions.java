package com.junit.training.examples;

import org.junit.Test;

public class TestExceptions {
	
	
	@Test(expected = ArithmeticException.class)
	public void expectedExeption() {
		double div = 1/0;
	}
	
	@Test(expected = MyException.class)
	public void personalException() throws MyException  {
		
		MyException ex = new MyException();
		String teamName = "team-name: Live and Let Code";
		
		ex.validateTeamAsociated(teamName);
	}

}
