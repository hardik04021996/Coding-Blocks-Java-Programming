package assignment4;

import java.util.Scanner;

public class assign4q1 {
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
		for(int j=1; j< input.length;j++)
		{
			int key=input[j];
			int i=j-1;
			while( (i>-1) && input[i]>key)
			{
				input[i+1]=input[i];
				i--;
			}
			input[i+1]=key;
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
