package recursionAssignment;

import java.util.Scanner;

public class q7 {
	public static int convertIntoInt(String input,int number,int begIndex){
			if(begIndex>input.length()-1){
				
				return number;
			}
		    
			int digit = input.charAt(begIndex)- '0';
		    number = number*10 + digit; 
		    return convertIntoInt(input, number, begIndex+1);
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		int number=0;
		int begIndex=0;
		int result= convertIntoInt(input,number,begIndex);
		System.out.println(result);
		

	}

}
