package InterfaceExample;

public class Phone implements SmartPhone, SmartTv {

	

	public void camera() {
		System.out.println("camera is good");
	}

	public void ram() {
		System.out.println("ram is 8gb");

	}

	public void screen() {
		System.out.println("screen resolution is good");

	}

	public void display() {
		System.out.println("display is good");

	}

	public void quality() {
		System.out.println("quality is good");

	}

	public void type() {
		System.out.println("TV is LCD");

	}

	public static void main(String[] args) {
		Phone p = new Phone();
		p.quality();
		p.ram();
		p.type();
		p.camera();
		
	}
}
