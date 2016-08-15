package com.medium;

import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,8,2,5,13};
		System.out.println(checkTriplet(arr));

	}
	public static boolean checkTriplet(int [] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
			arr[i]=arr[i]*arr[i];
		Arrays.sort(arr);
		for(int i=n-1;i>1;i--)
		{
			int x=arr[i];
			int l=0;
			int r=i-1;
			while(l<r)
			{
				int sum=arr[l]+arr[r];
				if(sum==x) return true;
				else if(sum<x) l++;
				else	r--;
			}
		}
		return false;
	}

}
