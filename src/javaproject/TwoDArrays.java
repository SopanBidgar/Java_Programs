package javaproject;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size==");

	int size=sc.nextInt();  
	int marks[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
       marks[i]=sc.nextInt()	;
      }
     
	int x=sc.nextInt();
	
	for(int i=0;i<marks.length;i++)
	{
        if(marks[i]==x) 
        {
        	System.out.println("found at index :" + i);
        }
        }
	}
     
		

}
	
	
	
