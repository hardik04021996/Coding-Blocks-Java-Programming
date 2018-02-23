package assignment4;

import java.util.Scanner;

public class assign4q7 {

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
	
	public static void print(int[] outputArray){
		for(int i=0; i<outputArray.length; i++){
			System.out.print(outputArray[i] + " ");
		}
	}
	
	public static int[] sort(int[] A){
		int size=A.length;
		int[] sortedArray= new int[size];
		int rightIndex= sortedArray.length-1;
		for(int i=0; i<A.length; i++){
			if(A[i]==1){
				sortedArray[rightIndex]=1;
				rightIndex--;
			}
		}
		return sortedArray;
	}
 	
	public static void main(String[] args) {
		int[] inputArray= takeinput();
		int[] outputArray= sort(inputArray);
		print(outputArray);
	}

}
