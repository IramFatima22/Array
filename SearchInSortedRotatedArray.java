package com.medium;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,7,9,12,23,2,3,4};
		int x=10;
		System.out.println(search(arr,x,0,arr.length-1));

	}

	private static int search(int[] arr, int x, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if(x==arr[mid]) return mid;
		if(arr[start]<=arr[mid])
		{
			if(x>=arr[start] && x<arr[mid])
				return search(arr,x,start,mid-1);
			else
				return search(arr,x,mid+1,end);
		}
		else if(arr[end]>=arr[mid])
		{
			if(x>arr[mid] && x<=arr[end])
				return search(arr,x,mid+1,end);
			else
				return search(arr,x,start,mid-1);
		}	
		return -1;
	}

}
