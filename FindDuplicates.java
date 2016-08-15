package com.hard;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[]={1,2,5,3,7,3,6,9,9,6};
		findDuplicates(arr);
	}

	private static void findDuplicates(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[Math.abs(arr[i])]<0)
				System.out.print(Math.abs(arr[i])+" ");
			else
				arr[Math.abs(arr[i])]=-1*arr[Math.abs(arr[i])];
		}
		
	}

}
