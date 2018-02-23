package recursionAssignment3;

import java.util.Scanner;

public class q4 {
	
	
	public static boolean check(String input, int begIndex, int endIndex) {
		if(begIndex>endIndex)
		{
			return true;
		}
		if(input.charAt(begIndex)=='(' && input.charAt(endIndex)!=')') 
		{
			return false;
		}
		
		if(input.charAt(endIndex)==')' && input.charAt(begIndex)!='(') 
		{
			return false;
		}
		return check(input, begIndex+1, endIndex-1);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int begIndex=0;
		int endIndex=input.length()-1;
		boolean result=check(input, begIndex, endIndex);
		System.out.println(result);
		
	}

}
