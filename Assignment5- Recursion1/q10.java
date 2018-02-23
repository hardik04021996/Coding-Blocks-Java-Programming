package recursionAssignment;

import java.util.Scanner;

public class q10 {

public static String insertStar(String input, int begIndex,String output1) {
		
		if (begIndex==input.length()-1)
		{
			
			return output1 + input.charAt(begIndex);
		}
		
		 if(input.charAt(begIndex)==input.charAt(begIndex+1))
		{
			output1=output1+input.charAt(begIndex);
			output1=output1+ '*';
		}
		else
		{
			output1=output1+input.charAt(begIndex);
		}	
		return insertStar(input,begIndex+1,output1);
	}
 
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int begIndex=0;
		String output = "";
		String result= insertStar(input, begIndex,output);
		System.out.println(result);
		
	}
	
}
