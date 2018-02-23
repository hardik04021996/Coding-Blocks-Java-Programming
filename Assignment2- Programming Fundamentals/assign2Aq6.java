package assignment2A;

import java.util.Scanner;

public class assign2Aq6 {
	
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter number: ");
	int N= s.nextInt();
	int rem,bin = 0,i=1;
	while(N!=0)
	{
		rem=N%2;
		N=N/2;
		bin=bin+rem*i;
		i=i*10;
	}
	
    System.out.println("binary number is: "+ bin);
  }

}
