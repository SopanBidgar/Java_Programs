package InterfaceExaimpl;

import InterfaceExa.Biology;

public class Science implements Biology {

	public void botany() {
		System.out.println("it is branch of biology");
	}

	public void zoology() {
		System.out.println("it is second branch of biology");

	}

	public void microbiology() {
		System.out.println("it is third branch of biology");
		
	}		
	public static void main(String[] args) {
		Science s=new Science();
		s.botany();
		s.microbiology();
	}
}