package com.junit.training.examples;

public class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
	
	public MyException() {
		
	}
	
	public boolean validateTeamAsociated(String teamName) throws MyException {
		
		if(!teamName.isEmpty() && 
				teamName != null)  {
			
			boolean isNoTeam = teamName.contains("no-team");
			boolean haveTeam = teamName.contains("team-name:");
			
			if(isNoTeam || haveTeam) {
				return isNoTeam || haveTeam;
			} else {
				throw new MyException("The Team Name is not valid");
			}
			
		} else {
			throw new MyException("The Team Name should not be null");
		}
	}
	
	public Object establishDBConnection(String conection, int timeConnection) {
		
		Object objCon = new String(conection);
		
		try {
			Thread.sleep(timeConnection);
		} catch (InterruptedException e) {

		}
		return objCon;
	}
}
