package recursionAssignment;

import java.util.Scanner;

public class q1 {
	public static int multiply(int m, int n){
		if(n==1){
			return m;
		}
		if(n==-1){
			return 0-m;
		}
		if(n>0){
			return m+ multiply(m,n-1);
		}
	    if(n<0){
			return 0-m + multiply(m,n+1);
		}
	    else return 0;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the two nos.:");
		int m= s.nextInt();
		int n= s.nextInt();
		System.out.println(multiply(m,n));
	}

}
