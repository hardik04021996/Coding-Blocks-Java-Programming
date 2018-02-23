package recursionAssignment;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class q6 {
	
	public static String removeX(String input, int begIndex,String output1) {
		
		
		if (begIndex==input.length())
		{
			
			return output1;
		}
		if(input.charAt(begIndex)!='x')
		{
			output1=output1+input.charAt(begIndex);
			
		}
		return removeX(input,begIndex+1,output1);
	}
 
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int begIndex=0;
		String output = "";
		String result= removeX(input, begIndex,output);
		System.out.println(result);
		
	}
	
}
