package Array;

import java.util.Scanner;

public class RotateAnArray {
	
	public static void reverse(int a[],int start,int end) {
		int i=start;
		int j=end;
		
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
		
		// k can be -ve as well as +ve
				int k=scn.nextInt();
				
		//for +ve large k
		if(k>=0) k%=n;
		else if(k<0) {
			k*=-1;
			k%=n;
			k=n-k;
		}
		
	  //calling revese function for whole array
				reverse(arr1,0,n-1);
	
	  //calling revese function for first k element
				reverse(arr1,0,k-1);	
				
	//calling revese function for index k to end element
				reverse(arr1,k,n-1);
	   	
		//output the reversed array
				for(int i=0;i<arr1.length;i++)
					System.out.print(arr1[i]+" ");
   }
}


