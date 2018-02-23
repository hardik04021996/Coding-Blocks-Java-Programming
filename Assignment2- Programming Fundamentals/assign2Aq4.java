package assignment2A;

import java.util.Scanner;

public class assign2Aq4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter number: ");
		int N= s.nextInt();
		int digit;
		int rev=0;
		while(N>0)
		{
			digit=N%10;
			rev=rev*10 + digit;
			N=N/10;
		}
        System.out.println("reverse of number is: "+ rev);
	}

}
