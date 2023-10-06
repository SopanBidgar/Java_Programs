package javaproject;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your colour:" + "\n" + "1)Orange" + "\n" +  "2)Blue" +"\n"+ "3)White");
		System.out.println("------------------------------");
		String colour = sc.next();

		switch (colour) {
		case "orange":
			System.out.println("it is color of faith");
			break;
		case "Blue":
			System.out.println("it is color of greenary");
			break;
		case "white":
			System.out.println("it is color of prosperity");
			break;
		default:
			System.out.println("invalid para");
		}

	}

}
