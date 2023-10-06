package StarPatternEx;

public class FourthEx {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) 
			{                                                //i=3
				
				System.out.print(" ");                       //j=1
			}                                                //k=2
			for(int k=4;k>=i;k--)  
			{
				System.out.print("*");
			}
			for(int l=3;l>=i;l--)  
			{
				System.out.print("*");
			}
			System.out.println();

		}
		
		

	}

}
