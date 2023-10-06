package javaproject;

import java.util.Scanner;

public class Basics 
{

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter you first number:");
			int a=sc.nextInt();
			
			System.out.println("Enter your second number");
			int b= sc.nextInt();
			
			System.out.println("Enter your third number");
			int c= sc.nextInt();
			
			Basics aa=new Basics();
			aa.devNumber(a,b,c);
		}
		public  void devNumber(int a,int b,int c)
		{
			int devide=a/b/c;
			System.out.println(devide);
		}
	}

	


