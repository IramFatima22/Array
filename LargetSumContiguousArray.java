package com.medium;

public class LargetSumContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-2,-3,-5,-1,-2,-1,-5,-3};
		int max=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum=Math.max(arr[i], arr[i]+sum);
			max=Math.max(sum, max);
		}
		System.out.println(max);

	}

}
