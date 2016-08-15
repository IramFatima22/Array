package com.easy;

public class LeadersInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={16,17,4,3,5,2};
		int x=arr[arr.length-1];
		System.out.print(x+" ");
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>x)
			{
				x=arr[i];
				System.out.print(x+" ");
			}
		}

	}

}
