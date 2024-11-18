package basic;
// importing scanner class
import java.util.Scanner;
public class numbers {
       // class CLassName 
	public static void main(String[] args) {
	    int a,b;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a first number");
        a=sc.nextInt(); //12
        System.out.println("enter a second number");    
	    b=sc.nextInt(); //12
	    System.out.println("Additon of two numbers:"+(a+b));
	    System.out.println("Substraction of two numbers:"+(a-b));
	    System.out.println("Multiplication of two numbers:"+(a*b));
	    System.out.println("division of two numbers:"+(a/b));
	
	}

}
