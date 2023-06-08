package com.skill.lync.p1;

import java.util.Scanner; 

public class MainApp {
	private static boolean res;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Text2Speech ts = new Text2Speech();
		System.out.println("\t\t CorePathi-2023");
		Candidate c1 = new Candidate();
		String candidate_name = c1.getCandidate_name();
		String gender = c1.getGender();
		if (gender.equalsIgnoreCase("Male")) {
			System.out.println("\nWelcome to Kaun Banega Corepathi Mr." + candidate_name + "\n");
		} else if (gender.equalsIgnoreCase("Female")) {
			System.out.println("\nWelcome to Kaun Banega Corepathi Ms/Mrs." + candidate_name + "\n");
		} else {
			System.out.println("\nWelcome to Kaun Banega Corepathi " + candidate_name + "\n");
		}

		System.out.println("-----------------------------------");

		System.out.println("\t** Please find the below details for this Game **\n\n"
				+ "1. Game will be having 5 Levels\n" + "2. Each Level will have Doubled Cash Prize\n"
				+ "3. You will have 1 Life Line. (50-50) \n" + "4. Wrong answer will lead to termination of the game\n"
				+ "5. Each question will have 4 options");

		System.out.println("-----------------------------------\n\n");
		System.out.println("Are you okay with rules. Shall we Start?? (Yes/No)");
		String strt = sc.next();
		if (strt.equalsIgnoreCase("Yes")) {
			System.out.println("All The Best Lets Begins !!!!!\n+\n");
			res = Question.question1(candidate_name);
			if (res == true) {
				System.out.println("Correct Answer. You have won : Rs." + Candidate.getAmount_won() + "\n");
				ts.speak("Correct Answer");
				System.out.println("------");
				res = Question.question2(candidate_name);
				if (res == true) {
					System.out.println("Correct Answer. You have won : Rs." + Candidate.getAmount_won() + "\n");
					ts.speak("Correct Answer");
					System.out.println("------");
					res = Question.question3(candidate_name);
					if (res == true) {
						System.out.println("Correct Answer. You have won : Rs." + Candidate.getAmount_won() + "\n");
						ts.speak("Correct Answer");
						System.out.println("------");
						res = Question.question4(candidate_name);
						if (res == true) {
							System.out.println("Correct Answer. You have won : Rs." + Candidate.getAmount_won() + "\n");
							ts.speak("Correct Answer");
							System.out.println("------");
							res = Question.question5(candidate_name);
							if (res == true) {
								System.out.println("Correct Answer. You have won : Rs." + Candidate.getAmount_won() + "\n");
								ts.speak("Correct Answer");
								System.out.println("Congratulations You have completed the game");
								ts.speak("Congratulations You have completed the game");
							} else {
								ts.speak("We are sorry its a wrong answer your game is over");
								System.out.println("Your Game is over. You have won : Rs." + Candidate.getAmount_won());
							}
						} else {
							ts.speak("We are sorry its a wrong answer your game is over");
							System.out.println("Your Game is over. You have won : Rs." + Candidate.getAmount_won());
						}
					} else {
						ts.speak("We are sorry its a wrong answer your game is over");
						System.out.println("Your Game is over. You have won : Rs." + Candidate.getAmount_won());
					}
				} else {
					ts.speak("We are sorry its a wrong answer your game is over");
					System.out.println("Your Game is over. You have won : Rs." + Candidate.getAmount_won());
				}
			} else {
				ts.speak("We are sorry its a wrong answer your game is over");
				System.out.println("Your Game is over. You have won : Rs." + Candidate.getAmount_won());
			}
		} else {
			ts.speak("Thank you for your interest");
			System.out.println("Thank you for your interest.");
		}
	}
}
