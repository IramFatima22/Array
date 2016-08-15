package com.easy;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,6,3,1,4};
		System.out.println(missingMethod1(arr));
		System.out.println(missingMethod2(arr));
	}

	private static int missingMethod2(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<arr.length;i++)
			sum-=arr[i];			
		return sum;
	}

	private static int missingMethod1(int[] arr) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=1;i<=arr.length+1;i++)
		{
			x^=i;
		}
		for(int i=0;i<arr.length;i++)
		{
			x^=arr[i];
		}
		return x;
	}

}
