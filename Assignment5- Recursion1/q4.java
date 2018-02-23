package recursionAssignment;

import java.util.Scanner;

public class q4 {
	
	public static boolean palindrome(String input, int beg, int end){
		if(beg>=end)
		{
			return true;
		}
		if(input.charAt(beg)!=input.charAt(end))
		{
			return false;
		}
		return palindrome(input,beg+1,end-1);
	}
 
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input=s.next();
		int beg=0;
		int end=input.length()-1;
		boolean result= palindrome(input,beg,end);
		if (result==true)
		System.out.println("the string is a palindrome.");
		else
			System.out.println("the string is not palindrome.");
	}
}
