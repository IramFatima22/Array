package com.hard;

public class MajorityElementCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,2,3,3,3,3,3,10};
		int x=3;
		int res=search(arr,x,0,arr.length-1);
		System.out.println(res);
		if(arr[res+arr.length/2]==x)
			System.out.println("Majority");
		else
			System.out.println("not");
	}

	private static int search(int[] arr, int x, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if((mid==start || arr[mid-1]!=x) && arr[mid]==x)
			return mid;
		else if(x>arr[mid])
			return search(arr,x,mid+1,end);
		else
			return search(arr,x,start,mid-1);
	}

}
