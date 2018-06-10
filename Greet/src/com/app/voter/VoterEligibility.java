package com.app.voter;


public class VoterEligibility {
   
	public void checkVoterEligibility(String name,int age){
		
		if(age<18 || age>100){
			
			System.out.println("Hello : "+name+" Your age : "+age+" not eligilble for vote");
		}
		else{
			
			System.out.println("Hello : "+name+" Your age : "+age+" eligilble for vote");
		}
	}
	
}
