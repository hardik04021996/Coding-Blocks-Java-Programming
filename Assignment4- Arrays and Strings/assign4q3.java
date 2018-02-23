package assignment4;

import java.util.Scanner;



public class assign4q3 {
	
	public static void removeDuplicates(String input)
	 {  
		System.out.print(input.charAt(0));
		for(int i=0; i<input.length()-1;i++)
		 {
			if(input.charAt(i)!= input.charAt(i+1))
				System.out.print(input.charAt(i+1));
		 }
			
	 }
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.nextLine();
		removeDuplicates(input);
		
	}

}
