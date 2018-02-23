package recursionAssignment3;

import java.util.Scanner;

public class q3 {

	public static String reverse(String input, int endIndex, String output) {
		if(endIndex<0)
		{
			return output; 	
		}
		output= output+ input.charAt(endIndex);
		return reverse(input, endIndex-1, output);
		
	}
	
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int endIndex=input.length()-1;
		String output="";
		String result= reverse(input, endIndex, output);
		System.out.println(result);
		
		
	}
}
