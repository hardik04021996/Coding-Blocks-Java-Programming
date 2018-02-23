package assignment4;

import java.util.Scanner;

public class assign4bonus {
	
	public static void compress(String input)
	 {    int i,count;
	  int len = input.length();
		int j=0;
		for( i=0; i<input.length()-1;i++)
		 { 
			count=1;
			j=i;
			if(input.charAt(i)== input.charAt(i+1))
		    {
			 while(j<input.length()-1 && input.charAt(i)== input.charAt(i+1))
			 {
				 count++;
				 i++;
				 j++;
			 }
		    }
			System.out.print(input.charAt(i));
			System.out.print(count+ " ");
			
		 }
		
		if(input.charAt(len-1)!=input.charAt(len-2))
		{
			System.out.print(input.charAt(len-1));
			System.out.print("1");
			
		}
	}
	 
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.nextLine();
		compress(input);
		
	}

}
