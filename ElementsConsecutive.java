package com.medium;

import com.hard.FindDuplicates;

public class ElementsConsecutive {

	public static void main(String[] args) {
		int arr[]={-1,2,3,1,0};
		//int arr[]={7,6,5,5,3,4};
		Pair p=MaxandMin.findMaxMinMethod2(arr, 0, arr.length-1);
		int max=p.max;
		int min=p.min;
		int n=arr.length;
		boolean temp[]=new boolean[n];
		if(max-min+1==n)
		{
			for(int i=0;i<n;i++)
			{
				if(!temp[arr[i]-min])
				{
					temp[arr[i]-min]=true;
				}
				else
				{
					System.out.println("Not consecutive");
					return;
				}
			}
			System.out.println("consecutive");
			return;
		}
		System.out.println("Not consecutive");
	}

}
