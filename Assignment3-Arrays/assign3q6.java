package assignment3;

import java.util.Scanner;

public class assign3q6 {
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
 
 public static void addition(int[] arr1, int[] arr2){
	
	 if(arr1.length== arr2.length)
	 {
	   int sizeSum=arr1.length;	 
	   int[] sum= new int[sizeSum];
	   for(int i=0; i< sizeSum; i++)
	    {
		 sum[i]=arr1[i]+arr2[i];
	    }
	 System.out.println("new array is:");
	 for(int i=0; i< sizeSum; i++)
	   {
		 System.out.print(" "+sum[i]);
	   }
	 }
	 else
		 System.out.print("addition not possible");
 }
	public static void main(String[] args) {
		int[] arr1= takeinput();
		int[] arr2= takeinput();
		addition(arr1, arr2);
	}

}
