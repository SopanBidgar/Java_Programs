package javaproject;

import java.util.Scanner;

public class Scannerexample2 {

	public static void main(String[] args) {
   		
   Scanner sc=new Scanner(System.in);
  
   System.out.println("enter your roll no:");
   int rollno=sc.nextInt();
   System.out.println("your rollno is:"+rollno);
   System.out.println("enter yourn name:");
   String str=sc.next();
   System.out.println("your name is:"+str);
   System.out.println("enter your phone number:");
   long ss=sc.nextLong();
   System.out.println(ss);
   
	}

}
