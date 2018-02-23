package assignment2A;

import java.util.Scanner;

public class assign2Aq2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter number: ");
		int N= s.nextInt();
		int digit;
		int evensum=0, oddsum=0;
		while(N>0)
		{
			digit=N%10;
			if(digit%2==0)
				{
				evensum=evensum+digit;
				}
			else
		     	{
				oddsum=oddsum+digit;
		     	}
			N=N/10;
		}
		System.out.println("the sum of even digits: "+ evensum);
		System.out.println("the sum of odd digits: "+ oddsum);

	}

}
