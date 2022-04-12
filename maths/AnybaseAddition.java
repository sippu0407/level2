package maths;

import java.util.Scanner;

public class AnybaseAddition {
	
	public static int anyBaseAdd(int num1,int num2,int base) {
		int res=0;
		int carry=0;
		int pow=1;
		
		while(num1>0||num2>0||carry!=0) {
			int d1,d2=0;
			if(num1==0)d1=0;
			if(num2==0)d2=0;
			
			d1=num1%10;
			d2=num2%10;
			
			int add=d1+d2+carry;
			carry=add/base;
			int ans=add%base;
			ans*=pow;
			
			res+=ans;
			
			//changes for next loop
			pow*=10;
			num1/=10;
			num2/=10;
			
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		int base=scn.nextInt();
		
		System.out.println(anyBaseAdd(num1,num2,base));
	}

}
