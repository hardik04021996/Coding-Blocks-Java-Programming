package assignment2A;

public class assign2Aq5 {

	public static void main(String[] args) {
		int count=1,n=1;
		int num=0;
		while(count<=20)
		{
		 num=(3*n) +2;
		 if(num % 4 !=0)
		 {
			 System.out.print(num + " ");
			 count++;
		 }
		 n++;
		}
	}

}
