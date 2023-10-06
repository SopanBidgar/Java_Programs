package important;

public class FactorialEx {

	public static void main(String[] args) {
		int i;
		int fact = 1;
		int number = 10;// 5*4*3*2*1=120
		for (i = 1; i <= number; i++) {         //
			fact = fact * i;                    //1*1=1*2=2*3=6*4=24*5=120
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
	}

//4=4*3*2*1=24
//5=5*4*3*2*1=120