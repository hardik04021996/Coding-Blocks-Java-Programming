package assignment2;

import java.util.Scanner;

public class assign2q2 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter subject 1: ");
		String subject1= s.next();
		System.out.println("enter marks in subject1 : ");
		int sub1= s.nextInt();
		System.out.println("enter subject 2: ");
		String subject2= s.next();
		System.out.println("enter marks in subject2 : ");
		int sub2= s.nextInt();
		System.out.println("enter subject 3: ");
		String subject3= s.next();
		System.out.println("enter marks in subject3 : ");
		int sub3= s.nextInt();
		int max1=sub1;
		if(sub2>max1)
		{
			max1=sub2;
		}
	   if(sub3>max1)
		{
			max1=sub3;
		}
	   
	   if(max1==sub1)
	   {
		   System.out.println("best marks are in :" + subject1);
		   sub1=0;
	   }
	   else if(max1==sub2)
	   {
		   System.out.println("best marks are in :" + subject2);
		   sub2=0;
	   }
	   else
	   {
		   System.out.println("best marks are in :" + subject3);
		   sub3=0;
	   }
	   
	   int max2=sub1;
	   if(sub2>max2)
		{
			max2=sub2;
		}
	   if(sub3>max2)
		{
			max2=sub3;
		}
	   int avg= (max1+max2)/2;
	   System.out.print("avg of best 2 marks: "+avg);
	   
		
	}

}
