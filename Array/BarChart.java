package Array;

import java.util.Scanner;

public class BarChart {
	
	//creating bar chart function
	public static void barchart(int []a) {
		
		//finding max value of an array
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) max=a[i];
		}
		
		//traversing array max times
		
		while(max>0) {
			
			//traversing array 1 time to print *
			
			for(int i=0;i<a.length;i++) {
				if(a[i]>=max) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//newline for next iteration
			System.out.println();
			
			//value updation for next line
			max--;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input given
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		int []arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();		
			
		}
		
		barchart(arr);
	}

}
