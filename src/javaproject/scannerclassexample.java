package javaproject;

import java.util.Scanner;

public class scannerclassexample {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String choice = sc.next();
		System.out.println("Your name is:" + choice);
		System.out.println("Enter your number:");
		int ss = sc.nextInt();
		System.out.println("your number is:" + ss);
		System.out.println("Enter your phone number:");
		long phno = sc.nextLong();
		System.out.println("your phone number is:" + phno);


		System.out.println("enter first number:");
		int a = sc.nextInt();

		System.out.println("enter second number:");
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println("enter your gender:");
		char gender=sc.next().charAt(0);
		System.out.println("your gender is:" +gender);


		if( a==b) {
			System.out.println(a++);
			System.out.println(a);

			System.out.println(b++);
			System.out.println(b);

		System.out.println("heyy budddy");
		}else {System.out.println("biiii buddy");
           }
			}
	

//////===scanner is a class .we create object of scanner class to take input from user.
	///==syntax:scanner is a class name. sc is reference variable.new is a keyward.system.in is a library files that we have to import from database
}
