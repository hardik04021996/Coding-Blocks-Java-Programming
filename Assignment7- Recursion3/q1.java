package recursionAssignment3;

import java.util.Scanner;

public class q1 {
	
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
	
	public static int minimum(int[] input, int begIndex, int min){
        
        int endIndex= input.length-1;
        if(begIndex== endIndex )
        {
        	return min;
        }
        
        if(input[begIndex]< min)
       	min= input[begIndex];
        	
        return minimum(input, begIndex+1, min);       
      
	}
	
	
	
	public static void main(String[] args) {
		int[] input= takeinput();
		int begIndex=0;
		int min=input[0];
		int result= minimum(input, begIndex, min);
		System.out.println(result);
	}	

}
