package Easy;

public class IsPalindrome_9 {

	 public static boolean isPalindrome(int x) {
	      
		 if (x<0)
			 return false;
		 
		 int number =x;
		 int reversed =0;
		 
		 //123
		 while (x!=0) {
			 reversed = x%10 + reversed*10;
			 x=x/10;
			 
		 }
		 
		 return reversed ==number?true:false;
		
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(isPalindrome(-121));
		
	}
	 
}
