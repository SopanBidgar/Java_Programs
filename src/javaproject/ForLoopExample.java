package javaproject;

public abstract class ForLoopExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 5; k++) {
					System.out.println(k);
				}
			}
			System.out.println("==============");

		}

	}
}
