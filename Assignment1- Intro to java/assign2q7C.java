package assignment2;
import java.util.Scanner;

public class assign2q7C {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int row=1, col;
		int value=1;
		System.out.println("enter the no. of rows:");
		int N= s.nextInt();
		while(row<=N)
		{
			col=1;
			while(col<=row)
			{
             if(col==1)
            	 {
            	  value=1;
            	  System.out.print(value+" ");
            	 }
             else
                {
            	 value=(value*(row-col+1)/(col-1));
            	 System.out.print(value+" ");
                }
              col++;
			}
			row++;
			System.out.print("\n");
		}
		
	}

}
