package StarPatternEx;

public class ThirdEx {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {                          //i=4
			for(int j=1;j<=i;j++) {                        //j=3
				System.out.print(" ");                       //****	
                                                             //***
		}                                                    //**
			System.out.println();                           //*

	}
		
		
		
	     	for(int i=1;i<=4;i++) {                          //i=4
			for(int j=3;j>=i;j--) {                        //j=3
				System.out.print("*");                       //****	
                                                             //***
		}                                                    //**
			System.out.println();                           //*

	}

}
}
