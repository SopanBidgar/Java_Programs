package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer,String> hm=new HashMap<>();
		hm.put(101, "Kedar");
		hm.put(102, "Shubham");
		hm.put(103, "Dipak");
		hm.put(104, "Kedar");
		hm.put(105, "Rahul");
		
		HashMap h=new HashMap<>();
		h.put(101, "Kedar");
		h.put(102, "Shubham");
		h.put(103, "Dipak");
		h.put(104, "Kedar");
		h.put(105, "Rahul");
		System.out.println(hm);
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("sopan"));
		System.out.println(hm.equals(h));
		System.out.println(h.size());
		
	
	
	for(Map.Entry s:hm.entrySet()) {
		System.out.println(s.getKey()+"--"+s.getValue());
	}

	}

}
