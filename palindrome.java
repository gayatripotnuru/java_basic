package basic;

public class palindrome {

	public static void main(String[] args) {
		int n=151;
		int m;
		int rev=0;
		m=n;
	    while(n>0) {
	   int  remainder=n%10;
	    rev=rev*10+remainder;
	    n=n/10;
	   }
	    if(m==rev) {
	    	System.out.println("it is a palindrome number");
	    }
	    else {
	    	System.out.println("It is not palindrome number");
	    }

	}

}
