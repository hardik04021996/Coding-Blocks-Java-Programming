package assignment3;

import java.util.Scanner;

public class assign3q1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter decimal number: ");
		int N= s.nextInt();
		int[] bin= new int[16];
		int index=0;
		while(N>0)
		{
			bin[index]= N%2;
			N=N/2;
			index++;
		}
		
		System.out.println("binary number is: ");
		for(int i=bin.length-1; i>=0; i--)
		{
			System.out.print(bin[i]);
			
		}

	}

}
