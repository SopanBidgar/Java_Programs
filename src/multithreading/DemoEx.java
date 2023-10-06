package multithreading;

public class DemoEx {

	public static void main(String[] args) {

		MyRunnabeInterface bullet1=new MyRunnabeInterface();
		Thread gun1=new Thread(bullet1);
		MyRunnabeInterface2 bullet2=new MyRunnabeInterface2();
		Thread gun2=new Thread(bullet2);

		gun1.start();
		gun2.start();

	}

}
class MyRunnabeInterface implements Runnable{
	public void run() {
		while(true) {
		System.out.println("i am thread not a threat");
	} 
	}
}
class MyRunnabeInterface2 implements Runnable{
	public void run() {
		while(true) {
		System.out.println("i am thread2 not a threat2");
	}
	}
}