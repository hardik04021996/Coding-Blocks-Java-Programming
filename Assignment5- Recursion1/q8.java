package recursionAssignment;

import java.util.Scanner;

public class q8 {
	public static int sumOfDigits(int N, int sum)
	{
		
		if(N==0)
		{
			return sum;	
		}
		int digit= N%10;
		sum=sum+digit;
		return sumOfDigits(N/10, sum);
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number: ");
		int N= s.nextInt();
		int sum=0;
		int result= sumOfDigits(N,sum);
		System.out.println("sum of digits is: "+ result);
	}
}
