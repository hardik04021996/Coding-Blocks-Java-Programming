package recursionAssignment3;

import java.util.Scanner;

public class q6Print {
	
	private static void printParenthesisPart(String input, int begIndex, String output, int flag) {
		if(begIndex>input.length()-1)
		{
			System.out.println(output);
			return;
					
		}
		if(input.charAt(begIndex)=='(')
			{
			flag=1;
			}
	   
	    if(input.charAt(begIndex)==')')
	    {
	    	output= output+ input.charAt(begIndex);
	    	flag=0;
		}
	    if(flag==1)
		{
			output= output+ input.charAt(begIndex);
		}
	   printParenthesisPart(input, begIndex+1, output, flag);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int begIndex=0;
		int flag=0;
		String output="";
		//String result = 
	   printParenthesisPart(input, begIndex, output, flag);
		//System.out.println("String insde parenthesis is: " + result);
	}

	
}
