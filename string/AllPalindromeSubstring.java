package string;

import java.util.Scanner;

public class AllPalindromeSubstring {

	public static boolean palindrome(String str) {
		//checking first char with last char
		
	   int left=0,right=str.length()-1;
	   while(left<right) {
	   if(str.charAt(left)==str.charAt(right))
	   {
		   left++;
		   right--;
	   }
	   else
		   return false;
	   }
	   
	   return true;
	   
	}
	
	
public static void substr(String str) {
		
		//lopping
		for(int si=0;si<str.length();si++) {
			for(int ei=si;ei<str.length();ei++) {
			  if(palindrome(str.substring(si,ei+1)))
				System.out.println(str.substring(si,ei+1));
			}
				
		}
	}

	public static void main(String[] args) {
		
		 Scanner scn =new Scanner(System.in);
	       String str=scn.nextLine();
	       
	       substr(str);

	}

}
