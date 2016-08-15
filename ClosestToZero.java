package com.easy;

import java.util.Arrays;

public class ClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,60,4,70,-80,85};
		Arrays.sort(arr);
		int l=0;
		int r=arr.length-1;
		int diff=Integer.MAX_VALUE;
		//int closest=0;
		int lval=0,rval=0;
		while(l<r)
		{
			int sum=arr[l]+arr[r];
			if(Math.abs(sum)<Math.abs(diff))
			{
				diff=sum;
				lval=arr[l];
				rval=arr[r];
			}
			if(sum>0)
				r--;
			else
				l++;
			
		}
		System.out.println(lval+" : "+rval);

	}

}
