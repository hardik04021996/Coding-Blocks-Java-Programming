package assignment3;

import java.util.Scanner;

public class assign3q8 {
	public static int[] takeinput(){
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter the size of array:");
    	int size=s.nextInt();
    	int input[]= new int[size];
    	
    	System.out.print("enter the elements of array: ");
    	for(int i=0;i<size;i++){
    		input[i]=s.nextInt();
    	}
    	return input;
	}
	
	public static void sort(int[] input){
		int temp;
	    for(int i=0;i<input.length-1;i++){
	    	for(int j=0;j<input.length-i-1;j++)
	    	{
	    		if(input[j]>input[j+1])
	    		{
	    			temp= input[j];
	    			input[j]= input[j+1];
	    			input[j+1]= temp;
	    		}
	    	}
	    }
	    System.out.println("sorted array: ");
		for(int i=0; i<input.length; i++)
		{
			System.out.print(input[i] + " ");
			
		}
	}
	public static void main(String[] args) {
		int[] input= takeinput();
		sort(input);
	}	

}
