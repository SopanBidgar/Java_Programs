package javaproject;

public class Hello {

	public static void main(String[] args) {
		//Hello ss=new Hello();

	    addNumber(10,45);
		subNumber(10,5);
		int aa = Hello.sopan();
		System.out.println(aa);
	}
	public static int sopan() {
		int a=10;
		int b=54;
		int add=a+b;
		return add;
	}
	
     public static void addNumber(int a,int b) {
    	 int add=a+b;
    	 System.out.println(add);
     }
     public static void subNumber(int a,int b) {
    	 int sub=a-b;
    	 System.out.println(sub);
     }

     }
	


		

