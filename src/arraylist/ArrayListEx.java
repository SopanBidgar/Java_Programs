package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
        List dd =new ArrayList();
		ArrayList<String> qq = new ArrayList<String>();
	    //	ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList <Integer>al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(1011);
		al.add(500);
		System.out.println(al);
			Iterator itr=al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			for(Integer a:al) {
				System.out.println(a);
			}
		}
	}


