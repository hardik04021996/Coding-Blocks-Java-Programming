package recursionAssignment2;

import java.util.Scanner;

public class q3return {
	public static String[] subsequence(String input){
		int size= (int) Math.pow(2, input.length());
		
		if(input.length()==0)
		{
			String[] str= new String[1];
			str[0]="";
			return str;	
		}
		String[] str= new String[size];
		String[] temp= subsequence(input.substring(1));
		for(int i=0; i<temp.length; i++)
		{
			str[i]= temp[i];
		}
		
		for(int i=0, j=temp.length; i<temp.length; i++,j++)
		{
			str[j]= input.charAt(0) + temp[i] ;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string:");
		String input= s.next();
		String[] result= subsequence(input);
		for(int i=0;i<result.length;i++)
		{
		System.out.print(result[i]+ " ");
		}
		
		

	}


}
