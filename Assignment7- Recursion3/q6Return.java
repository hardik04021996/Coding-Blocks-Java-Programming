package recursionAssignment3;

import java.util.Scanner;

public class q6Return {

	private static String printParenthesisPart(String input, int begIndex, int flag) {
		if(begIndex>input.length()-1)
		{
			
			return "";
					
		}
		String output = "";
		if(input.charAt(begIndex)=='(')
			{
			flag=1;
			output= input.charAt(begIndex)+ printParenthesisPart(input, begIndex+1, flag);
			return output;
			}
	   if(input.charAt(begIndex)==')')
	    { 
	    	flag=0;
	    	output= input.charAt(begIndex)+ printParenthesisPart(input, begIndex+1, flag) ;
	    	return output;
		}
	    if(flag==1)
		{
			output= input.charAt(begIndex)+ printParenthesisPart(input, begIndex+1, flag);
			return output;
		}
	 //return  printParenthesisPart(input, begIndex+1, flag);
	   // output= input.charAt(begIndex)+ printParenthesisPart(input, begIndex+1, flag);
	    
	  
		  return printParenthesisPart(input, begIndex+1, flag);
	  
	  
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int begIndex=0;
		int flag=0;
		String result =  printParenthesisPart(input, begIndex, flag);
		System.out.println("String insde parenthesis is: " + result);
	}

	
}
