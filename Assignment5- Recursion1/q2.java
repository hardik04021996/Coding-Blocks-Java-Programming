package recursionAssignment;

import java.util.Scanner;

public class q2 {
	
	
	public static int countZeroes(int N, int count)
	{
		
		if(N==0)
		{
			return count;	
		}
		int digit= N%10;
		if(digit==0)
		{
			count++;
		}
		return countZeroes(N/10, count);
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number: ");
		int N= s.nextInt();
		int count=0;
		int result= countZeroes(N,count);
		System.out.println("no. of zeroes: "+ result);
	}
}
	
	
