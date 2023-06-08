package com.skill.lync.p1;

import java.util.Scanner;

public class Candidate {
	String candidate_name;
	String gender;
	Scanner sc = new Scanner(System.in);
	static int amount_won;
	Candidate(){
		System.out.println("Enter Your name:");
		candidate_name = sc.nextLine();
		System.out.println("Select the gender. (Male/Female/Others)");
		gender = sc.next();
	}
	public String getCandidate_name() {
		return candidate_name;
	}
	public String getGender() {
		return gender;
	}
	public static int getAmount_won() {
		return amount_won;
	}
	public static void setAmount_won(int amount_won) {
		Candidate.amount_won = amount_won;
	}
	
}
