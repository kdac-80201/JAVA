package com.partyvotespackage;
import java.util.Scanner;

public class PartyVotes {
	String party;
	int votes;
	public PartyVotes() {
		// TODO Auto-generated constructor stub
	}
	
	public PartyVotes(String party, int votes) {
		super();
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Party ");
		party =sc.next();
		System.out.print("Enter votes ");
		votes = sc.nextInt();
	}

	@Override
	public String toString() {
		return "PartyVotes [party=" + party + ", votes=" + votes + "]";
	}
	
	
	

}
