package HashsetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {

		PriorityQueue pq=new PriorityQueue();
		Set h = new HashSet();
		h.add(1);
		h.add(2);
		h.add("welcome");
		h.add(null);
		h.add(5);
		h.add(10.20);
		h.add(7);
		h.add(8);
		h.add(9);
		h.add(10);

		System.out.println(h);
		h.remove(5);
		System.out.println("after removing objects:" + h);
		System.out.println(h.contains(10.20));
		for (Object a : h) {
			System.out.println(a);
		}

		Iterator p = h.iterator();
		while (p.hasNext()) {
			System.out.println(p.next());
		}

	}

}
