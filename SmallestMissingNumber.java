package com.hard;

public class SmallestMissingNumber {

	public static void main(String[] args) {
		int [] arr={0,1,2,3,6,9};
		int n=arr.length;
		int m=10;
		if(arr[0]==0)
		{
			int x=search(arr,0,n-1);
			System.out.println(x);
			return;
		}
		System.out.println("0");
		
		
	}

	private static int search(int[] arr, int start, int end) {
		if(start>end)
			return end+1;
		if(start!=arr[start])
			return start;
		int mid=(start+end)/2;
		if(arr[mid]>mid)
			return search(arr,start,mid-1);
		else
			return search(arr,mid+1,end);
		
	}

}
