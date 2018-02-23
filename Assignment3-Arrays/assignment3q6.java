package assignment3;
import java.util.Scanner;

public class assignment3q6{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array1:");
		int size1= s.nextInt();
		int[] input1 = new int[size1];
		System.out.println("enter the elments of array1.:");
		for(int i=0; i<size1; i++){
			input1[i]= s.nextInt();
		}
		System.out.println("enter the size of array2:");
		int size2= s.nextInt();
		int[] input2 = new int[size2];
		System.out.println("enter the elments of array2.:");
		for(int i=0; i<size2; i++){
			input2[i]= s.nextInt();
		}
		int newsize= size1;
		int diff;
		 if(size2>size1){
			 diff= size2-size1;
			 newsize= size1+ diff;
				int[] temp= new int[newsize];
				for(int i=0; i<size1; i++){
					temp[i]=input1[i];
				}
				for(int i=size1; i<newsize; i++){
					temp[i]=0;
				}
				
				input1=temp;
		 }
		 else if(size1>size2){
			 diff= size1-size2;
			 newsize= size2+ diff;
				int[] temp= new int[newsize];
				for(int i=0; i<size2; i++){
					temp[i]=input2[i];
				}
				for(int i=size2; i<newsize; i++){
					temp[i]=0;
				}
				
				input2=temp; 
		 }
			int carry=0;
		 int[] sum_array= new int[newsize];
		 for(int i=newsize-1; i>=0; i--){
			 sum_array[i]= input1[i] + input2[i] + carry;
			 carry=0;
			 if(sum_array[i]>9){
				 carry=sum_array[i]/10;
				 sum_array[i]= sum_array[i]%10;
				 
			 }
		 }
		 
		
		
		System.out.println(" sum_array is");
		for(int i=0; i<sum_array.length; i++){
			System.out.print(" "+sum_array[i]);;
		}
		
		
		
		
		}
		

	}


