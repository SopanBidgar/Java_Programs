package important;

public class SmallNumberInArray {

	public static void main(String[] args) {

		
		int age[]= {10,20,30,40,50,60,70,80,90,100};
		int min=age[0];                         //10
		for(int i=0;i<age.length;i++) {         //
			if(age[i]<min) {                    //
				min=age[i];                     //
			}
		}
		System.out.println("minimum number is:" +min);

}

}
