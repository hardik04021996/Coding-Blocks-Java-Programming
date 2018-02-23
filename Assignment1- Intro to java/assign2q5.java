package assignment2;

import java.util.Scanner;

public class assign2q5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter basic: ");
		float basic= s.nextFloat();
		float hra= (float) (0.20*basic);
		float da= (float) (0.50*basic);
		float pf= (float) (0.11*basic);
		System.out.println("enter grade: ");
		char grade= s.next().charAt(0);
		int allow=0;
		if(grade=='A')
			allow=1700;
		else if(grade=='B')
			allow=1500;
		else if(grade=='C')
			allow=1300;
		else
			{
			System.out.print("invalid grade:");
			return;
			}
		float t_sal= basic+hra+da+allow-pf;
		System.out.print("total salary: "+ t_sal);

	}

}
