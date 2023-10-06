package javaproject;

public class HelloClass {

	public static void Kedar(String s) {
		for (String word : s.split(" ")) {
			if (word.length() % 2 == 1) {
				System.out.println(word);
			}
		}
	}

	public static void main(String[] args) {
		String s = "Hello my name is ";
		Kedar(s);
	}
}
