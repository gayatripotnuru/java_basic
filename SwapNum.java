package basic;
import java.util.Scanner;
public class SwapNum {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number:");
		int a=sc.nextInt(); //10
		System.out.println("enter a second number ");
		int b=sc.nextInt();//20
		System.out.println("before swapping:"+a+"  , "+b);
		 a=a+b; //a=10+20=30
		 b=a-b;//b=30-20=10
		 a=a-b;//a=30-10=20
		System.out.println("After Swapping:"+a+" , "+b);
	}

}
