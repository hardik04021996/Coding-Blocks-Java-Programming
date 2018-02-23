package assignment2;
import java.util.Scanner;

public class assign2q7F {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		int N = s.nextInt();
		int row=1;
		int value=N;
		while (row<=N)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(value);
				col++;
			}
			row++;
			value--;
			System.out.print("\n");
		}
		

	}

}
