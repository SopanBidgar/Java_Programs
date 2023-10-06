package Priorityq;

import java.util.PriorityQueue;
import OOPSCONCEPT.Bank;

public class PriorityQueueExample {

	public static void main(String[] args) {

		

		PriorityQueue<Bank> ts = new PriorityQueue<>();
		
		ts.add(new Bank(1212,"SBI","Manmad",1210120));
		ts.add(new Bank(54,"HDFC","PUNE",545454));
		ts.add(new Bank(544,"LOTAK","JALGAON",2121212));
		ts.add(new Bank(87878,"MBI","DHULE",87878));
		ts.add(new Bank(1212,"MAHINDRA","WASHIM",656565));

		
		for(Bank aa:ts) {
			System.out.println(aa);
		}

			}

}
