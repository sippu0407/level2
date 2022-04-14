package Array;

import java.util.Scanner;

public class ReverseArray {
	
	//defining reverse function
	public static void reverse(int a[]) {
		int i=0;
		int j=a.length-1;
		
		//reversing an array
		while(i<j) {
			//swapping a[i] with a[j]
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		//taking input 
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr1=new int[n];
		for(int i=0;i<arr1.length;i++)
			    arr1[i]=scn.nextInt();
		
		//calling revese function
		reverse(arr1);
		
		//output the reverse array
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
	}

}
