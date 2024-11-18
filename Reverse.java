package basic;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to reverse");    //1234
    int number=sc.nextInt();                                            //4321
   
    int rev=0;
    while(number>0) {
   int  remainder=number%10;   // 4,3,2,1
    rev=rev*10+remainder;  //0*10+4=4//4*10+3=43//43*10+2=4321
    number=number/10;// 123//12 //1
   }
    System.out.println("reverse of a number:"+rev);
	}
}
