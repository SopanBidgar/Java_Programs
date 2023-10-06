package important;

public class PalindromeEx {

	public static void main(String[] args) {
		 int r,sum=0,temp;    
		  int n=1414141444;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  r=44
		   sum=(sum*10)+r;   // sum=441410141
		   n=n/10;  //n=  14141414
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	

    
	}
	
