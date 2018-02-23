package assignment3;

import java.util.Scanner;

public class assign3q5 {
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
	
	public static int[] sort(int[] inputArray){
		int size= inputArray.length;
		int temp;
		for(int i=0; i<size-1; i++){
			for(int j=0; j< size-1-i; j++){
				if(inputArray[j]>inputArray[j+1]){
					temp=inputArray[j];
					inputArray[j]=inputArray[j+1];
					inputArray[j+1]= temp;
				}
			}
		}
		return inputArray;
	}
	
	public static void find(int[] A){
		Scanner s = new Scanner(System.in);
		System.out.println("enter x:");
		int x= s.nextInt();
		int left=0, right=A.length-1;
		int flag=0;
		while(left<right){
	    	if(A[left]+A[right]==x){
	    		System.out.println(A[left]+" and "+ A[right]+ " is a pair.");
	    		flag=1;
	    		left++;
	    	//	right--;
	    	}
	    	else if(A[left]+A[right]<x){
	    		left++;
	    	}
	    	else{
	    		right--;
	    	}
	    }
		if(flag==0){
			System.out.println("No pair exists");
		}
	}
	    
	public static void main(String[] args) {
		int[] input= takeinput();
		int[] outputArray= sort(input);
		find(outputArray);
	}	
}
