package Array;

import java.util.Scanner;

public class RotateBy90 {
	
	//defining rotate inplace method
	public static void rotateInPlaceBy90(int a[][]) {
		
		//code
				//taking transpose
				int n=a.length;
				for(int i=0;i<a.length;i++) {
					 for(int j=i+1;j<n;j++) {
						 //swap
						 int temp=a[i][j];
						 a[i][j]=a[j][i];
						 a[j][i]=temp;
						 
					 }
				   }
				
				System.out.println("h");
				
				//rows reversal
				for(int r=0;r<a.length;r++) {
					
					int lcol=0;
					int rcol=n-1;
					while(lcol<rcol) {
						//swap
						 int temp=a[r][lcol];
						 a[r][lcol]=a[r][rcol];
						 a[r][rcol]=temp;
						 System.out.println("hi");
						 //update
						 lcol++;
						 rcol--;
					   }
				    }
				
				System.out.println("hii");
				
			  //printing output
				
				 for(int i=0;i<n;i++) {
					 for(int j=0;j<n;j++) {
						 System.out.print(a[i][j]);
						}
					 System.out.println();
				   }

			 }


		
		


	public static void main(String[] args) {
		
		//input 2D array
		Scanner scn=new Scanner(System.in);
		
		int row=scn.nextInt();
		int col=scn.nextInt();
		int [][]a=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=scn.nextInt();
				}
		}
		

		
	}	
}
