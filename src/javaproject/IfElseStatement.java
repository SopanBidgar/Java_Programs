package javaproject;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice=1)add 2)multiplication 3)devision 4)sub");
		String choice = sc.next();

		System.out.println("enter your first number:");
		int a = sc.nextInt();

		System.out.println("enter your second number:");
		int b = sc.nextInt();
		if (choice.equals("add")) {
			System.out.println(a + b);
		} else if (choice.equals("sub")) {
			System.out.println(a - b);
		} else if (choice.equals("multiplication")) {
			System.out.println(a * b);
		} else {System.out.println(a/b);
}
		}

	}

class Sample{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first string");
		String s1=sc.next();
		System.out.println("Enter your second string");
		String s2=sc.next();
		System.out.println("Enter your third string");
		String s3=sc.next();
		
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings s1 and s2 are equal");
		}else if (s2.equalsIgnoreCase(s3));
		System.out.println("Strings s2 and s3 are equal");
		}

		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
