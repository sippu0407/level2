package Array;

import java.util.Scanner;

public class MatrixMul {
	
	//function
	public static void matrixMul(int a[][],int [][]b) {
		//creating matrix
		int [][] mulmatrix=new int[a.length][b[0].length];
		
		//oprations
		if(a[0].length==b.length) {
			int bc=0;
			while(bc<b[0].length) {
				for(int ra=0;ra<a.length;ra++) {
					int ans=0;
					for(int j=0;j<b.length;j++) {
						ans+=(a[ra][j]*b[j][bc]);
			//System.out.println(a[ra][j]+"*"+b[j][bc]);
					
					}
				//	System.out.println(ans);
					mulmatrix[ra][bc]=ans;
				}
				bc++;
			}
			
			//output
			for(int ra=0;ra<a.length;ra++) {
				for(int j=0;j<b[0].length;j++) {
					System.out.print(mulmatrix[ra][j]);
					
				}
				System.out.println();
			}
			
			return;
			
		}
		else
			System.out.print("matrix can't be multiplied");
	}

	public static void main(String[] args) {
	
        //given 2 matrix a and b
Scanner scn=new Scanner(System.in);
		//input a
		int an=scn.nextInt();
		int am=scn.nextInt();
		int a[][]=new int[an][am];
		for(int i=0;i<an;i++) {
			for(int j=0;j<am;j++) {
				a[i][j]=scn.nextInt();
			  }
		   }
		
		//input b
		int bn=scn.nextInt();
		int bm=scn.nextInt();
		int b[][]=new int[bn][bm];
		
		for(int i=0;i<bn;i++) {
			for(int j=0;j<bm;j++) {
				b[i][j]=scn.nextInt();
			   }
		    }
		
		//fuction calling
		matrixMul(a,b);
		
	}

}
