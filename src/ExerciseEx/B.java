package ExerciseEx;

public class B extends A {


	public B() {

		super(10);// to call the parent constructor
	}

	public B(int a) {

		super(a);// to call the parent constructor with one params
	}

	public B(int b, int c) {

		super(b, c);// to call the parent constructor with two params
	}

	public static void main(String[] args) {

		B obj = new B();// both constructor will be called
		B obj1 = new B(10);// both constructor will be called
     	B obj2 = new B(10, 20);// both constructor will be called

	}

}
