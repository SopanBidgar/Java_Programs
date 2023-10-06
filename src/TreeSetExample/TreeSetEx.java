package TreeSetExample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("a");
		ts.add("x");
		ts.add("w");
		ts.add("b");
		ts.add("q");
		ts.add("f");
		ts.add("s");
		ts.add("z");



		for (String a : ts) {
			System.out.println(a);
		}

		System.out.println("===================================");
		System.out.println(ts.descendingSet());

		Object aa=ts.clone();
		System.out.println("after clone....");
		System.out.println(aa);

	}

}
