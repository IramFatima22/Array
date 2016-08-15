package com.easy;

public class OccuringOddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,1,4,2,2,1,4,5};
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			x^=arr[i];
		}
		System.out.println(x);

	}

}
