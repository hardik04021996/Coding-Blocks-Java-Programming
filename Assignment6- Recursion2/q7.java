package recursionAssignment2;

import java.util.Scanner;

public class q7 {
	public static int[][] subset(int[] arr,int index)
	{
		if(index >= arr.length)
		{
			int[][] subsets = new int[1][arr.length];
			return subsets;
		}
		int[][] temp = subset(arr, index+1);
		
		int subsets[][] = new int[2*temp.length][arr.length];
		
		for(int i=0 ; i<temp.length ; ++i)
		{
			System.arraycopy(temp[i], 0, subsets[i], 0, temp[i].length);
		}
		for(int i=0 , j=temp.length ; i<temp.length ; ++i,++j)
		{
			int temp1[] = new int[temp[i].length+1];
			temp1[0] = arr[index];
			System.arraycopy(temp[i], 0, temp1, 1, temp[i].length);
			System.arraycopy(temp1, 0, subsets[j], 0, temp1.length-1);
			
		}
		
		return subsets;
	}
	public static int[] enter()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int n = s.nextInt();
		int[] input = new int[n];
		System.out.println("enter array");
		for(int i=0; i<n; ++i)
		{
			input[i] = s.nextInt();
			
		}
		s.close();
		return input;
		
	}
	
	public static void print2DArray(int[][] input){
		int m = input.length;
		int n = input[0].length;

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int[] input = enter();
		print2DArray(subset(input, 0));
	}

}
