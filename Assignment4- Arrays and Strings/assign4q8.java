package assignment4;

import java.util.Scanner;

public class assign4q8 {

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
		for(int i=0; i<size; i++){
		    sortedArray[i]=1;
		}
		int rightIndex= sortedArray.length-1;
		int leftIndex=0;
		for(int i=0; i<size; i++){
			if(A[i]==0){
			    sortedArray[leftIndex]=0;
			    leftIndex++;
			}
	     	else if(A[i]==2){
				sortedArray[rightIndex]=2;
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
