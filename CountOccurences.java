package com.easy;

public class CountOccurences {

	public static void main(String[] args) {
		int arr[]={1,1,2,2,2,2,3};
		int x=3;
		int s=searchStart(arr,x,0,arr.length-1);
		int e=searchEnd(arr,x,0,arr.length-1);
		System.out.println(s+","+e);

	}

	private static int searchStart(int[] arr, int x, int start, int end) {
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if((mid==start || arr[mid-1]!=x)&& arr[mid]==x)
			return mid;
		else if(arr[mid]<x)
			return searchStart(arr, x, mid+1, end);
		else
			return searchStart(arr, x, start, mid-1);
		
	}

	private static int searchEnd(int[] arr, int x, int start, int end) {
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if((mid==end || arr[mid+1]!=x) && arr[mid]==x)
			return mid;
		else if(x<arr[mid])
			return searchEnd(arr, x, start, mid-1);
		else
			return searchEnd(arr, x, mid+1, end);
		
	}

}
