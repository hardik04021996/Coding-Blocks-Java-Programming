package assignment2A;

import java.util.Scanner;

public class assign2Aq3 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter x: ");
		int x= s.nextInt();
		
		System.out.println("enter n: ");
		int n= s.nextInt();
		
		double answer=  Math.pow(x,n);
		System.out.println("the answer is: "+answer);
		
        s.close();
	}

}
