package linkedlistex;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		LinkedList  l=new LinkedList ();
		// <Integer> w=new LinkedList <Integer>();

		l.add(100);
		l.add("Sopan");
		l.add('A');
		l.add(10.20);
		l.add(true);
		l.add(null);
		l.add(1);
		l.add(10);
		l.add(10);
		l.add(1000);
		l.add(100);l.add(100);
		
		System.out.println(l);

		l.addFirst("Welcome");
		System.out.println(l);
		l.addLast("Bye Buddy");
		System.out.println(l);

		System.out.println(l.size());
		l.remove(2);
		System.out.println(l);
		System.out.println(l.size());
		l.add(4, "False");
		System.out.println(l);

		System.out.println(l.get(6));
		l.set(5, "Shubhs");
		System.out.println(l);

         System.out.println(l.contains("Sopan"));
        
 		System.out.println( l.isEmpty());

 		
 		
 		for(int i=0;i<l.size();i++) {
 			System.out.println(l.get(i));
 		}
 		
 		
 		for(Object a:l) {
 			System.out.println(a);
 		}
 		
 		Iterator t= l.iterator();
 		while(t.hasNext()){
 	 		System.out.println(t.next());

 		}
		System.out.println(l.size());

	}

}
