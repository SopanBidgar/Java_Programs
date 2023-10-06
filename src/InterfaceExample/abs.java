package InterfaceExample;

interface abs {
   int a=10;
   int b=11;
	public static void main(String[] args) {
		Test t = new Test();
		t.oops();
		t.aups();
		t.shubhs();
		t.display();
		t.display1();
	}

	 void aups();

	void oops();


	void shubhs();
}
interface abcdef {
	
	void display();
	
}
interface abcdefg {
	
	void display1();
	
}


class Test implements abs,abcdef,abcdefg {
	public void aups() {
		System.out.println("apeksha is good girl");
	}

	public void oops() {
		System.out.println("pratiksha is bad girl");

	}

	

	public void shubhs() {
		System.out.println("shubhs is bad boy");

	}
	public  void display() {
		System.out.println("multiple inheritance is not acheived");

	}
	public  void display1() {
		System.out.println("multiple inheritance is not not acheived");

	}
}