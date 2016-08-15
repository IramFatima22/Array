package com.medium;

public class ArrayRotataionUsingReversal {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int d=2;
		rotate(arr,d);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

	private static void rotate(int[] arr, int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end)
		{
			int temp=arr[start];
			arr[start++]=arr[end];
			arr[end--]=temp;
		}
		
	}

}
