package basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();         //153
	    int OriginalNum=num;
	    int sum=0; 
	    while(num>0) {    //153>0
	    	int digit=num%10;  //3 //5  //1
	    	sum+=digit*digit*digit*digit; //27 //152 //153
	    	num=num/10; //15 // 1
	    }
	    if(sum==OriginalNum) {
	    	System.out.println(OriginalNum+" It is a Armstrong number");
	    	}
	    else {
	    	System.out.println(OriginalNum+" It is not a Armstrong Number");
	    }
}
}