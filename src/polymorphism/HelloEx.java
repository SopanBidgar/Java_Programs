package polymorphism;

public class HelloEx{
      void Display(int a,String b) {
    	  System.out.println("1");
      }
      void show(int a) {
    	  System.out.println("2");

      }
      void set() {
    	  System.out.println("3");

      }
}
class helloExa extends HelloEx {
	 void Display(int a) {
   	  System.out.println("4");
     }
	 void show() {
   	  System.out.println("5");

     }
     void set() {
   	  System.out.println("6");

     }

 	
}