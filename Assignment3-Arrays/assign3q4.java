package assignment3;

import java.util.Scanner;

public class assign3q4 {
	public static int[] takeinput(){
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter the size of array:");
    	int size=s.nextInt();
    	int input[]= new int[size];
    	
    	System.out.println("enter the elements of array:");
    	for(int i=0;i<size;i++){
    		input[i]=s.nextInt();
    	}
    	return input;
    	
    }
	
	public static void intersect(int[] arr1, int[] arr2){
	    for(int i=0;i<arr1.length;i++){
	    	for(int j=0;j<arr2.length;j++)
	    	{
	    		if(arr1[i]==arr2[j])
	    		{
	    			System.out.println(arr1[i]+ " at index "+i+ " and "+j+ " is an intesection.");
	    		}
	    	}
	    }
	}
	
	public static void main(String[] args) {
		int[] arr1= takeinput();
		int[] arr2= takeinput();
		intersect(arr1, arr2);
	}


}
