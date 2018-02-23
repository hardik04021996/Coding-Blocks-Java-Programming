package recursionAssignment;

import java.util.Scanner;

public class q9 {
	public static boolean reverse(String input1,String input2, int begindex, int endindex){
		if(begindex>= endindex)
		{
			return true;
		}
		if(input1.charAt(begindex)!=input2.charAt(endindex))
		{
			return false;
		}
		return reverse(input1,input2,begindex+1,endindex-1);
	}
 
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("enter string 1:");
		String input1=s.next();
		System.out.println("enter string 2:");
		String input2=s.next();
		
		int size1=input1.length()-1;
		int size2=input2.length()-1;
		if (size1==size2){
			int begindex=0;
			int endindex=input1.length()-1;
			boolean result= reverse(input1,input2,begindex,endindex);
			if (result==true)
				System.out.println("strings are reverse of each other.");
				else
					System.out.println("strings are not reverse of each other.");
		}
			
			else
				System.out.println("strings are not reverse of each other.");
		
		
	}
}
