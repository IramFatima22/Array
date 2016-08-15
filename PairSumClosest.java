package com.easy;

public class PairSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,4,7,10};
		int x=14;
		System.out.println(closestPairSum(arr,x));

	}
	public static int closestPairSum(int[] arr,int x)
	{
		int l=0;
		int r=arr.length-1;
		int diff=Integer.MAX_VALUE;
		int closest=0;
		while(l<r)
		{
			int sum=arr[l]+arr[r];
			if(Math.abs(x-sum)<diff)
			{
				diff=Math.abs(x-sum);
				closest=sum;
			}
			if(sum<x)
				l++;
			else if(sum>x)
				r--;
			else
				return sum;
					
		}
		return closest;
	}

}
