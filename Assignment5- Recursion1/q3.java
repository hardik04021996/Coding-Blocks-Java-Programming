package recursionAssignment;

import java.util.Scanner;

public class q3 {
	public static double geometricSeries(int k, double sum) {
		if(k==0)
		{
			return 1;
		}
		double term= (1/Math.pow(2,k));
		sum= sum+ term;
		return term+ geometricSeries(k-1,sum);
	}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter k:");
	int k= s.nextInt();
	double sum=0;
	double result= geometricSeries(k,sum);
	System.out.println(result);
}

}
