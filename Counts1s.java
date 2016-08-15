package com.medium;

public class Counts1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={1,1,1,1,1};
		System.out.println(binarySearch(arr,0,arr.length-1));

	}

	private static int binarySearch(int[] arr,int start, int end) {
		if(start>end)
			return 0;
		int mid=(start+end)/2;
		if((mid==end || arr[mid+1]==0) && arr[mid]==1)
			return mid+1;
		else if(arr[mid]==0)
			return binarySearch(arr, start, mid-1);
		else
			return binarySearch(arr, mid+1, end);
	}

}
