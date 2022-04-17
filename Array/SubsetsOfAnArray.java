package Array;

import java.util.Scanner;

public class SubsetsOfAnArray {
	//creating decimal to binary function
	public static void DTB(int ba[],int dNum) {
		int index=ba.length-1;
		while(dNum>0) {
			int rem=dNum%2;
			dNum/=2;
			ba[index]=rem;
			index--;
		}
	}
	
	
	//subset array function
	public static void subset(int a[]) {
		
		//finding total subset
		int ts=1;
		for(int i=1;i<=a.length;i++)
			ts*=2;
		
		//finding decimal to binary for each 0 to ts-1
		
		int binArr[]=new int[a.length];
		for(int i=0;i<ts;i++) {
	//here i is decimal value which need to converted into binary
			DTB(binArr,i);
			
			//traversing in binary array
			for(int j=0;j<binArr.length;j++) {
				if(binArr[j]==1)
					System.out.print(a[j]+" ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//input an array
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr1=new int[n];
		for(int i=0;i<arr1.length;i++)
			    arr1[i]=scn.nextInt();
		
		subset(arr1);
		
	}

}
