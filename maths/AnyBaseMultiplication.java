package maths;

import java.util.Scanner;

public class AnyBaseMultiplication {
     //multiplication with each digit
	public static long anybasemul(long n1,long d,int base) {
		
		long carry=0,pow=1;
		long ans=0;
		while(n1>0||carry!=0) {
			long d1=n1%10;
			
			long mul=(d1*d)+carry;
			
			//remaider and quotient
			
			long rem=mul%base;
			long quo=mul/base;
			
			//answer calculation
			ans+=(rem*pow);
			
			//updation of variable for next loop
			
			n1/=10;
			carry=quo;
			pow*=10;
			
			
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		long num1=scn.nextLong();
		int base=scn.nextInt();
		scn.close();
		
		//overall calculation
		long result=0;
		int pow=1;
		while(num1>0) {
			long d2=num1%10;
			num1/=10;
			//calculation for each digit
			
			result+=(anybasemul(num,d2,base)*pow);
			
			//other way is
			//result+=anybasemul(num,d2*pow,base);
			pow*=10;
		}
		
		System.out.println(result);
	}

}
