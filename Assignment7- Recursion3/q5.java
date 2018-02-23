package recursionAssignment3;

import java.util.Scanner;

public class q5 {


	public static void removeDuplicates(String input, int begIndex)
	 {  
		
		if(begIndex==input.length()-1)	
		{
			System.out.print(input.charAt(begIndex));
			return;
		}
		
			if(input.charAt(begIndex)!= input.charAt(begIndex+1))
				System.out.print(input.charAt(begIndex));
			removeDuplicates(input, begIndex+1);
						
	 }
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.nextLine();
		int begIndex=0;
		removeDuplicates(input, begIndex);
		
	}

}
