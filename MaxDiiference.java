package com.medium;

public class MaxDiiference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={2,3,10,6,4,8,1};
		int arr[]={7,9,5,6,3,2};
		int min=arr[0];
		int maxDiff=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else
			{
				if(arr[i]-min>maxDiff)
					maxDiff=arr[i]-min;
			}
		}
		System.out.println(maxDiff);

	}

}
