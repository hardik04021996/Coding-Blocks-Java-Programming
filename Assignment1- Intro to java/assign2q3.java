package assignment2;

import java.util.Scanner;

public class assign2q3 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no.: ");
		int num1= s.nextInt();
		System.out.println("enter second no.: ");
		int num2= s.nextInt();
		System.out.println("enter your choice ");
        char choice= s.next().charAt(0);
        int operate=0;
        switch (choice) {
        case '+' : 
        	operate=num1+num2;
        	 System.out.println(operate);   
        	break;
        case '-' : 
        	operate=num1-num2;
        	 System.out.println(operate);   
        	break;
        case '*' : 
        	operate=num1*num2;
        	 System.out.println(operate);   
        	break;
        case '/' : 
        	operate=num1/num2;
        	 System.out.println(operate);   
        	break;
        case '%' : 
        	operate=num1%num2;
        	 System.out.println(operate);   
        	break;	
        default:
        	System.out.print("invalid choice:");
        }
          
	}

}
