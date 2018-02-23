package assignment2A;

import java.util.Scanner;

public class assign2Aq8 {
	public static double sqroot(int N, int precision){
		int i=0;
		double sqrt=0;
		double increment=0;
		while(i<=precision)
		{
			increment=Math.pow(10,-precision);
			while((sqrt*sqrt)<=N)
			{
				sqrt=sqrt+increment;
			}
			sqrt=sqrt-increment;
			i++;
		}
		return sqrt;
	}

	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		System.out.print("enter number");
		int N = s.nextInt();
		System.out.print("enter precision");
		int precision = s.nextInt();
		double root= sqroot(N,precision);
       System.out.print(root);
	}


}
