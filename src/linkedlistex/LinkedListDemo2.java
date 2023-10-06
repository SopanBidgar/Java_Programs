package linkedlistex;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println(l);
		LinkedList n = new LinkedList();
		n.addAll(l);
		System.out.println(l);
		n.addFirst("Good");
		System.out.println(n);
		System.out.println(l);

		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);

	}

}
