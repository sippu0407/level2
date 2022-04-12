package maths;

import java.util.Scanner;

public class AnybaseSubtraction {
	
	public static int anyBaseSub(int num1,int num2,int base) {
		
		int borrow=0,ans=0;
		int pow=1;
		while(num1>0) {
			
			
			int d1=num1%10;
			int d2=num2%10;
			int diff=0;
					//subtraction
					if(d1<d2) {
							d1+=base;
							diff=d1-borrow-d2;	
							borrow=1;	
					   }
					else {
						diff=d1-borrow-d2;	
						borrow=0; //borrow
					}
					  
						
			ans+=(diff*pow);

			//variables updation
			num1/=10;
			num2/=10;
			pow*=10;
			
			
			
			
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		int base=scn.nextInt();
		
		System.out.println(anyBaseSub(num1,num2,base));
	}

}
