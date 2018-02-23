package recursionAssignment3;

import java.util.Scanner;

public class q2 {

	public static int gcd(int num1, int num2, int divisor, int answer) {
		if (divisor>num1 || divisor>num2) {
			return answer;
		}
		
		if(num1%divisor==0 && num2%divisor==0){
			answer = divisor;
		}
			return gcd(num1, num2, divisor+1, answer);
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no.:");
		int num1 = s.nextInt();
		System.out.println("enter second no.:");
		int num2 = s.nextInt();
		int divisor=1;
		int answer=1;
		int result= gcd(num1, num2, divisor, answer);
		System.out.println(result);
		
		
	}
}
