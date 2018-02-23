package assignment2A;

import java.util.Scanner;

public class assign2Aq1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter number: ");
		int N= s.nextInt();
		System.out.println("enter your choice: \n 1.sum \t 2.product");
		int choice= s.nextInt();
		if(choice==1)
		{
			int i=1,sum=0;
			while(i<=N){
				sum=sum+i;
				i++;
			}
			System.out.println("sum is: "+ sum);
		}
        
		else if(choice==2)
		{
			int i=1, product=1;
			while(i<=N){
				product=product*i;
				i++;
			}
			System.out.println("product is: "+product);
		}
		
		else
			System.out.println("invalid choice");
			
	}

}
