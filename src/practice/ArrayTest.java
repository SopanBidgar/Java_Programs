package practice;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {

	public static void main(String[] args) {

		
		int age[]=new int[6];
		age[0]=45;
		age[1]=20;
		age[2]=41;
		age[3]=78;
		age[4]=78;
		age[5]=54;
		
		
		int age1[]=new int[6];
		age1[0]=45;
		age1[1]=20;
		age1[2]=41;
		age1[3]=78;
		age1[4]=78;
		age1[5]=54;
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		System.out.println(age[5]);
		System.out.println("===================");

		for(int a:age) {
			System.out.println(a);
		}
		System.out.println("===================");

        for(int i=0;i<age.length;i++) {
        	System.out.println(age[i]);
        }
        Arrays.sort(age);
        for(int a:age) {
			System.out.println(a);
		}
        Arrays.binarySearch(age, 3);
      System.out.println(Arrays.compare(age, age1));
      System.out.println( Arrays.equals(age, age1));
     
      int index = Arrays.binarySearch(age, 78);
      if (index >= 0) {
          System.out.println("Found at index " + index);
      } else {
          System.out.println("Not found");
      }
	}

}
