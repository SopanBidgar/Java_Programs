package OOPSCONCEPT;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 50;
		int count;

		for (int i = 2; i <= n; i++) { // Start from 2, since 1 is not a prime number
			count = 0;

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
					break; // No need to continue checking once a divisor is found
				}
			}
 
			if (count == 0) {
				System.out.println(i + " ");
			}
		}
	}
}


