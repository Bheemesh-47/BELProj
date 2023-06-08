package com.skill.lync.p1;

import java.util.Scanner;

public class Question {
	static String res;
	static int help_line=1;
	static Scanner sc = new Scanner(System.in);
	public static boolean question1(String candidate_name) {
		System.out.println(candidate_name+", your first question is :\n"+
				"Who is the founder of java?\n"+
				"a) James Gosling\n"+
				"b) Charles\n"+
				"c) david\n"+
				"d) none of them");
		System.out.println("(Select the correct option)");
		System.out.println("**** Type Help to use help line ****");
		res = sc.next();//A--a
		if(res.equalsIgnoreCase("a")) {
			Candidate.amount_won = 10000;
			return true;
		}
		else if(res.equalsIgnoreCase("help")){
			if(help_line==1) {
				help_line=0;
				System.out.println("Updated options are: \n"+
						"a) James Gosling\n"+
						"b) Charles\n");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 10000;
					return true;
				}
			}
			else {
				System.out.println("You cannot use the help_line");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 10000;
					return true;
				}
			}
		}
		return false;
	}

	public static boolean question2(String candidate_name) {
		System.out.println(candidate_name+", your second question is :\n"+
				"Who the captain of Indian ODI Cricket Team?\n"+
				"a) Rohit\n"+
				"b) Virat\n"+
				"c) Hardik\n"+
				"d) none of them");
		System.out.println("(Select the correct option)");
		System.out.println("**** Type Help to use help line ****");
		res = sc.next();
		if(res.equalsIgnoreCase("a")) {
			Candidate.amount_won = 20000;
			return true;
		}
		else if(res.equalsIgnoreCase("help")) {
			if(help_line==1) {
				help_line=0;
				System.out.println("Updated options are: \n"+
						"a) Rohit\n"+
						"b) Virat\n");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 20000;
					return true;
				}
			}
			else {
				System.out.println("You cannot use the help_line");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 20000;
					return true;
				}
			}
		}
		return false;
	}

	public static boolean question3(String candidate_name) {
		System.out.println(candidate_name+", your third question is :\n"+
				"Who is the Prime Minister of India?\n"+
				"a) Rahul\n"+
				"b) Modi\n"+
				"c) Soniya\n"+
				"d) none of them");
		System.out.println("(Select the correct option)");
		System.out.println("**** Type Help to use help line ****");
		res = sc.next();
		if(res.equalsIgnoreCase("a")) {
			Candidate.amount_won = 40000;
			return true;
		}
		else if(res.equalsIgnoreCase("help")) {
			if(help_line==1) {
				help_line=0;
				System.out.println("Updated options are: \n"+
						"a) Modi\n"+
						"b) Soniya\n");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 40000;
					return true;
				}
			}
			else {
				System.out.println("You cannot use the help_line");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 40000;
					return true;
				}
			}
		}
		return false;	}

	public static boolean question4(String candidate_name) {
		System.out.println(candidate_name+", your fourth question is :\n"+
				"What is the national animal of India?\n"+
				"a) Lion\n"+
				"b) Elephant\n"+
				"c) Tiger\n"+
				"d) Jaguar");
		System.out.println("(Select the correct option)");
		System.out.println("**** Type Help to use help line ****");
		res = sc.next();
		if(res.equalsIgnoreCase("b")) {
			Candidate.amount_won = 80000;
			return true;
		}
		else if(res.equalsIgnoreCase("help")) {
			if(help_line==1) {
				help_line=0;
				System.out.println("Updated options are: \n"+
						"a) Lion\n"+
						"b) Tiger\n");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("b")) {
					Candidate.amount_won = 80000;
					return true;
				}
			}
			else {
				System.out.println("You cannot use the help_line");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 80000;
					return true;
				}
			}
		}
		return false;
	}

	public static boolean question5(String candidate_name) {
		System.out.println(candidate_name+", your Last question is :\n"+
				"Which is the best college?\n"+
				"a) NBKR Institue of Technology\n"+
				"b) PES\n"+
				"c) RV\n"+
				"d) IIT");
		System.out.println("(Select the correct option)");
		System.out.println("**** Type Help to use help line ****");
		res = sc.next();
		if(res.equalsIgnoreCase("a")) {
			Candidate.amount_won = 200000;
			return true;
		}
		else if(res.equalsIgnoreCase("help")) {
			if(help_line==1) {
				help_line=0;
				System.out.println("Updated options are: \n"+
						"a) NBKR Institue of Technology\n"+
						"b) RV\n");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 200000;
					return true;
				}
			}
			else {
				System.out.println("You cannot use the help_line");
				System.out.println("(Please Select the correct option)");
				res = sc.next();
				if(res.equalsIgnoreCase("a")) {
					Candidate.amount_won = 200000;
					return true;
				}
			}
		}
		return false;
	}
}
