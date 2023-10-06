package multithreading;

public class Demo {

	public static void main(String[] args) {
		Mythtread1 s=new Mythtread1();
		Mythtread2 q=new Mythtread2();
		
		s.start();
		q.start();

	}

}
class Mythtread1 extends Thread{
	public void run() {
		
	while(true) {
		System.out.println("cooking is on");
		System.out.println("i am happy");

	}
		
	}
}
class Mythtread2 extends Thread{
	public void run() {
		
	while(true) {
		System.out.println("chatting is on");
		System.out.println("i am sad");

	}
		
	}
}