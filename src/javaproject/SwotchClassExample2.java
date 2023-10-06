package javaproject;

import java.util.Scanner;

public class SwotchClassExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the role among the following:" + "\n" + "1)Admin" + "\n" + "2)Maker" + "\n"
				+ "3)Checker" + "\n" + "4)Approver");
		System.out.println("-------------------------------------");
		String rolename = sc.next();

		switch (rolename) {
		case "admin":
			System.out.println("having all rights");
			break;
		case "Maker":
			System.out.println("having write acces");
			break;
		case "CHECKER":
			System.out.println("having read acces");
			break;
		case "Approver":
			System.out.println("having both acces");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
