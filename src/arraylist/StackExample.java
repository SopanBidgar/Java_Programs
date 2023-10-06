package arraylist;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		
		stk.push("AKshay");
		stk.push("Vinit");
		stk.push("Ashwin");
		stk.push("Bharti");
		
		
		

		for(String i:stk){
		System.out.println(i);
	
		
	}
		System.out.println(stk.peek());
		System.out.println(stk);
		System.out.println(stk.isEmpty());

}

}
