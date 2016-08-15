package com.hard;

public class CannotBeRepresentedBySubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,5,10,20,40};
		int val=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>val)
				break;
			else
			{
				val=val+arr[i];
			}
		}
		System.out.println(val);

	}

}
