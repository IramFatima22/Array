package com.easy;

public class SmallestSecondSmallest {

	public static void main(String[] args) {
		int arr[]={12,6,10,8,15,19,2};
		int a=arr[0];
		int b=arr[1];
		int min=Math.min(a, b);
		int minS=Math.max(a, b);
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				minS=min;
				min=arr[i];
			}
			else if(arr[i]<minS)
			{
				minS=arr[i];
			}
		}
		System.out.println("Min :"+min+" second Min :"+minS);
	}

}
