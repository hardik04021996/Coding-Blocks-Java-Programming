package assignment4;

import java.util.Scanner;

public class assign4q6 {
	public static void find(String input)
	{   int size=input.length();
		int count=1;
	    int index=0;
	    int min=size;
	    String output= new String(" ");
	   
		for(int i=index; i<size;i++)
		{    
			count=1;
		    for(int j=i; input.charAt(j)!=' ';j++)
		    {   
				count++;
				index++;
		    }	
		 
		  if(count<min)
		   { 
			  min=count;
		   }
		  i=index+2;
		 }
		System.out.println("minimum no. of letters :" +min);
		
	}
		
		
	

	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.nextLine();
		find(input);
	}
}
