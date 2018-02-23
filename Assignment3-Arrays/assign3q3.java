package assignment3;
import java.util.Scanner;

public class assign3q3 {
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
	
	public static void addition(int[] input){
		int sumP=0;
		int sumN=0;
	    for(int i=0;i<input.length;i++){
	    	if(input[i]>=0)
		      sumP=sumP+input[i];
	    	else
	    	   sumN=sumN+input[i];	
		
	   }
	    System.out.println("the sum of poitive elements of array is: " + sumP);
	    System.out.println("the sum of negative elements of array is: " + sumN);
	    
	}
	
	public static void main(String[] args) {
		int[] input= takeinput();
		addition(input);
			

	}

}
