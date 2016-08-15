package com.hard;

public class FloorandCeiling {

	public static void main(String[] args) {
		int arr[]={1,2,8,10,10,12,19};
		int x=11;
		int ceil=searchCeiling(arr,x,0,arr.length-1);
		int floor=searchFloor(arr,x,0,arr.length-1);
		System.out.println("ceil :"+ceil+" & floor :"+floor);
	}

	private static int searchFloor(int[] arr, int x, int start, int end) {
		if(x>=arr[end])
			return arr[end];
		if(x<arr[start])
			return -1;
		int mid=(start+end)/2;
		if(arr[mid]==x) return arr[mid];
		if(x<arr[mid])
		{
			if(mid-1>=start && arr[mid-1]<=x)
				return arr[mid-1];
			else
				return searchFloor(arr, x, start, mid-1);
		}
		else
		{
			if(mid+1<=end && x<arr[mid+1])
				return arr[mid];
			else
				return searchFloor(arr, x, mid+1, end);
		}
	}

	private static int searchCeiling(int[] arr, int x, int start, int end) {
		if(x<=arr[start])
			return arr[start];
		if(x>arr[end])
			return -1;
		int mid=(start+end)/2;
		if(arr[mid]==x) return mid;
		if(x<arr[mid])
		{
			if(mid-1>=start && x>arr[mid-1])
				return arr[mid];
			else
				return searchCeiling(arr, x, start, mid-1);
		}
		else
		{
			if(mid+1<=end && x<=arr[mid+1])
				return arr[mid+1];
			else
				return searchCeiling(arr, x, mid+1, end);
		}
	}

}
