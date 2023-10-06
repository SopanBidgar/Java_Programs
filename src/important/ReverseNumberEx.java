package important;

public class ReverseNumberEx {

	public static void main(String[] args) {
		int number = 123456789, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;                          //9 8 7
		reverse = reverse * 10 + remainder;                   //9 98 987
		number = number/10;                                  //12345678 1234567 
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
	}


