package assignment3;

import java.util.Scanner;

public class assign3q7 {
	public static int[] takeinput(){
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter the size of array:");
    	int size=s.nextInt();
    	int input[]= new int[size];
    	
    	System.out.print("enter the elements of array: ");
    	for(int i=0;i<size;){
    		input[i]=s.nextInt();
    		i++;
    		if(input[i-1]>size-2)
    		{
    			System.out.println("invalid no.");
    			i--;
    		}
    	}
    	return input;
	}
	
	public static void check(int[] input){
	    int sumOfArray=0;
	    int n= input.length;
	    int sum= ((n-1)*(n-2))/2;
		for(int i=0;i<input.length;i++){
	    	sumOfArray= sumOfArray+ input[i];
	    }
		int duplicate= sumOfArray - sum;
		System.out.println("duplicate element is: "+ duplicate);
	}
	
	public static void main(String[] args) {
		int[] input= takeinput();
		check(input);
	}
}
