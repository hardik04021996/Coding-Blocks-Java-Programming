package recursionAssignment2;

import java.util.Scanner;

public class q2 {
	
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
	
	
	public static int[] merge(int[] arr1, int[] arr2)
	{
		int size=arr1.length+ arr2.length;
		int[] array= new int[size];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]< arr2[j])
			{
				array[k]= arr1[i];
				i++;
				k++;
			}
			else
			{
				array[k]= arr2[j];
				j++;
				k++;
			}
			
			
				
		}
		if(arr1.length<arr2.length)
		{
			while(j<arr2.length)
			{
				array[k]=arr2[j];
				j++;
				k++;
			}
		}
		
		else
		{

			while(i<arr1.length)
			{
				array[k]=arr1[i];
				i++;
				k++;
			}
		}
		
		return array;
	}
	
	
	public static void mergesort(int[] input) {
		
		if(input.length<=1) {
			return;
		}
		int beg=0;
		int end=input.length-1;
		int mid= (beg+end)/2;
		int[] first = new int[mid+1];
		for(int i=0; i<mid+1; i++)
		{
			first[i]= input[i];
		}
		int[] second = new int[end-mid];
		for(int i=mid+1, k=0; i<=end; i++,k++)
		{
			second[k]= input[i];
		}
		mergesort(first);
		mergesort(second);
		int[] temp= merge(first, second);
		for(int i= 0; i<temp.length; i++)
		{
			input[i]=temp[i];
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] input=takeinput();
		int end= input.length-1;
		mergesort(input);
		int size=input.length;
		for(int i= 0; i<size; i++)
		{
			System.out.print(input[i]+ " ");
		}
	}


}
