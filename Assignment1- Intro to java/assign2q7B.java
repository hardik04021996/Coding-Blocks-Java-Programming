package assignment2;
import java.util.Scanner;

public class assign2q7B {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		int N = s.nextInt();
		int row=1;
		while (row<=N)
		{
			int col=1;
			while(col<=row)
			{
				if(col==1 || col==row)
				 {
				  System.out.print("1");
				 }
				else
					System.out.print("0");
				col++;
			}
			row++;
			System.out.print("\n");
		}
		

	}


}
