package assignment4;

import java.util.Scanner;

public class assign4q4 {
	
	public static char highestOccuringChar(String input) {
		int count=1;
		int max=0;
		char maxchar=' ';
		for(int i=0;i<input.length()-1;i++) {
			char x= input.charAt(i);
			for(int j=i+1; j<input.length();j++) {
				if(input.charAt(j)==x)
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				maxchar=x;
			}
			count=1;
				
		}
		return maxchar;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.nextLine();
		System.out.println(input.length() + "is the length");
		char answer = highestOccuringChar(input);
		System.out.println(answer + " occurs most of the times.");
		
	}

}
