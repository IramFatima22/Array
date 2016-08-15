package com.hard;

public class CheckPallindromeInAStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="aabaaca";
		char[] stream={'a','b','c','b','a'};
		boolean[] result=checkPallin(stream);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");

	}
	public static boolean[] checkPallin(char[] stream)
	{
		int n=stream.length;
		boolean[] result=new boolean[n];
		result[0]=true;
		StringBuffer firstR=new StringBuffer();
		StringBuffer second=new StringBuffer();
		for(int i=1;i<n;i++)
		{
			if(i%2==1)
			{
				firstR.insert(0, stream[i/2]);
				second.append(stream[i]);
			}
			else
			{
				second.deleteCharAt(0);
				second.append(stream[i]);
			}
			System.out.println(firstR+"  "+second);
			int check=0;
			for(int j=0;j<firstR.length();j++)
			{
				if(firstR.charAt(j)!=second.charAt(j))
				{
					check=1;
					result[i]=false;
					break;
				}
			}
			if(check==0)
				result[i]=true;
		}
		return result;
	}

}
