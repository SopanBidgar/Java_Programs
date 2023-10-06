package HashsetEx;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet <Integer> hs = new HashSet <Integer>();
		hs.add(4);
		hs.add(2);
		hs.add(6);
		
		System.out.println(hs);
		HashSet <Integer> h = new HashSet <Integer>();
		h.addAll(hs);
		h.add(10);
		System.out.println(h);
	}

}
