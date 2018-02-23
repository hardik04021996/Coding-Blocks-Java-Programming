package assignment2;

import java.util.Scanner;

public class assign2q6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("a: ");
		int a= s.nextInt();
		System.out.print("b :");
		int b=s.nextInt();
		System.out.print("c: ");
		int c=s.nextInt();
		float d= (b*b)-(4*a*c);
		if(d<0)
		{System.out.println("unreal roots");
		 return;
		}
		float d1= (float) Math.pow(d, 0.5);
		float x1= ((-1*b)+d1)/(2*a);
		float x2= ((-1*b)-d1)/(2*a);
		System.out.println("the roots are: " +x1 +"\t" + x2);
		
		

	}

}
