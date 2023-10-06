package javaproject;

import java.util.Scanner;

public class Example 
{

		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter your name :");
			 String name = sc.next();
			 greeting(name);
				
			}
			
			
			
			public static void greeting(String name) {
				System.out.println("Hey buddy Welcome "+name);
			}

}


