package assignment4;
import java.util.Scanner;

public class assignment4q4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string:");
		String input= s.nextLine();
		char answer= maxcount(input);
		System.out.println("' "+ answer + " ' occurs most of the times." );
		

	}

	public static char maxcount(String input)
	{ 
	 char maxchar=' ';
	 char x;
	 int max=0;
	 for(int i=0; i<input.length()-1; i++)
	 {
	  int count=0;
	  if(input.charAt(i)!= '*')
	   {
		x=input.charAt(i);
		for(int j=i; j<input.length()-1; j++)
		{
	     if(input.charAt(j)== x)
	     {
		   count=count+1;
		   char[] inputChars = input.toCharArray();
		   inputChars[j] = '*';
		   input = String.valueOf(inputChars); 
		 }
		}
		 if(count>max)
		 {
			 max=count;
			 maxchar=x;
			 
		 }
		}
	}
	return maxchar;
		
	}

}
