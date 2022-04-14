package Array;

import java.util.Scanner;

//constraints 1.values unique
            //2.values range[0,n-1]

public class InverseAnArray {
	
	//defining inverse array function
	public static void inverse(int a[]) {
	
		//creating result array
		int result[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int value=i;
			int index=a[i];
			result[index]=value;
		}
		
		//output printing
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
   
	public static void main(String[] args) {
		
		//taking input 
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr1=new int[n];
		for(int i=0;i<arr1.length;i++)
			    arr1[i]=scn.nextInt();
		
		inverse(arr1);

	}

}
