package assignment2;

import java.util.Scanner;

public class assign2q1 {


	public static void main(String[] args) {
		
		String p="abc";
		String t=p;
		
		System.out.println(p==t);
		p=p.concat("fhgh");
		
		System.out.println(p==t);
		//System.out.println("t:+"+t);
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal:");
		int P = s.nextInt();
		System.out.println("enter rate:");
	    float R = s.nextInt();
		System.out.println("enter time:");
		float T = s.nextInt();
		float SI= (P*R*T)/100;
		System.out.print("simple interest: "+ SI);		

	}

}
