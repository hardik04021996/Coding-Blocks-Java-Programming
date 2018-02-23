package recursionAssignment;

import java.util.Scanner;

public class q5 {

public static String replacePi(String input, int begIndex,String output1) {
		
		if (begIndex==input.length())
		{
			return output1;
		}
		
	    if(input.charAt(begIndex)=='p' && input.charAt(begIndex+1)=='i')
		{
			output1=output1+ "3.14";
			begIndex=begIndex+1;
		}
		else
		{
			output1=output1+input.charAt(begIndex);
		}	
		return replacePi(input,begIndex+1,output1);
	}
 
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int begIndex=0;
		String output = "";
		String result= replacePi(input, begIndex,output);
		System.out.println(result);
		
	}
}
