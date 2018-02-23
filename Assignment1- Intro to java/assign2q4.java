package assignment2;

import java.util.Scanner;

public class assign2q4 {


	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter a character:");
    char ch= s.next().charAt(0);
    if(ch>='a' && ch<='z')
    	System.out.print("lower case");
    else if(ch>='A' && ch<='Z')
    	System.out.print("upper case");
    else
    	System.out.print("special character");
    

	}

}
