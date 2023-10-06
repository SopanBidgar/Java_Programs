package javaproject;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
  
		int a[]= new int[3];

		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter your value");
			a[i]=sc.nextInt();
		}
		
		System.out.println("=======================================");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		

	}
}


