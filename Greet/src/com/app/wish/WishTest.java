package com.app.wish;

import com.app.voter.VoterEligibility;

public class WishTest {
	
	public static void main(String[] args) {
		WishGenerator w=new WishGenerator();
		w.wish("Pradeep");
		VoterEligibility vote=new VoterEligibility();
		vote.checkVoterEligibility("Pradeep", 18);
		vote.checkVoterEligibility("Saurabh", 101);
	}
  
}
