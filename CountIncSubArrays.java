package com.medium;

public class CountIncSubArrays {

	public static void main(String[] args) {
		int arr[]={1,2,2,4};
		int start=0;
		int res=0;
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(i==arr.length-1 || arr[i]>=arr[i+1])
			{
				int len=(i-start)+1;
				res+=(len*(len-1)/2);
				start=i+1;
			}
		}
		System.out.println(res);

	}

}
