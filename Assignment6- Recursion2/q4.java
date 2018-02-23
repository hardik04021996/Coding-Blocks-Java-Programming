package recursionAssignment2;

import java.util.Scanner;

public class q4 {
	
	public static String[] permute(String str)
	{
		if(str.length()<=0)
		{
			String[] strs = new String[1];
			strs[0] = "";
			return strs;
		}
		String[] temp = permute(str.substring(1));
		int n = str.substring(1).length()+1;
		String[] strs = new String[n*temp.length];
		int k=0;
		for(int i=0 ; i<temp.length ;++i)
		{	
			for(int j=0 ; j<n ; ++j)
			{
				strs[k] = temp[i].substring(0, j) + str.charAt(0) + temp[i].substring(j);
				++k;
			}
		}
		
		
		return strs;
	}
	
//	public static String helper (String temp , String str)
//	{
//		String str2 = "";
//		for(int i=0 ; i<str.length() ; ++i)
//		{
//			for(int j=0 ; j<temp.length() ; ++j)
//			{
//				if(str.charAt(i) == temp.charAt(j))
//					continue;
//				str2 = str2 + str.charAt(i);
//			}
//			
//		}
//		return str2;
//	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String strs[] = permute(str);
		for(int i=0 ; i<strs.length ; ++i)
		{
			System.out.println(strs[i]);
		}
		s.close();
	}
	
	
}
