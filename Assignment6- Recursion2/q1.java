package recursionAssignment2;

import java.util.Scanner;

public class q1 {
	
	

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
	 
	 public static void search(int[] input, int N, int beg, int end)
	 {  
		 int pos=-1;
		 if(beg>end)
		 {
			 System.out.println("element not found");
			 return;
		 }
		 
		 int mid=(beg+end)/2;
	       if(input[mid]==N)
			 {   
				 pos=mid;
				 System.out.println("element found at index:"+ pos);
				 return;
			 }
			 if(input[mid]<N)
			 {
				 search(input,N, mid+1, end);
			 }
			 if(input[mid]>N)
			 {
				 search(input,N, beg, mid-1);
			 }
		 }
		
	 
	 
	 public static void main(String[] args) {
		 int[] input=takeinput();
		 int beg=0;
		 int end= input.length-1;
		 Scanner s= new Scanner(System.in);
	     System.out.println("enter the element to be searched for: ");
	     int N= s.nextInt();
		 search(input,N, beg, end);
	 }

}
