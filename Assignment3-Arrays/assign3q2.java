package assignment3;
import java.util.Scanner;

public class assign3q2 {

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
	
	public static void addition(int[] input){
		int sum=0;
	    for(int i=0;i<input.length;i++){
		sum=sum+input[i];
		
	   }
	    System.out.println("the sum of elements of array is: " + sum);
	}
	
	public static void main(String[] args) {
	int[] input= takeinput();
	addition(input);
		

	}

}
