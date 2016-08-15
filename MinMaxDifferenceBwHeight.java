package com.arrays;

import java.util.Arrays;

public class MinMaxDifferenceBwHeight {

	public static void main(String[] args) {
		int arr[]={1,10,14,14,14,15};
		int k=6;
		minimizeMaxDiff(arr,k);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

	private static void minimizeMaxDiff(int[] arr, int k) {
		Arrays.sort(arr);
		int n=arr.length-1;
		int diff=arr[n]-arr[0];
		if(diff<=k)
		{
			for(int i=0;i<=n;i++)
			{
				arr[i]+=k;
			}
			return;
		}
		arr[0]+=k;
		arr[n]-=k;
		int min=arr[0]<arr[n]?arr[0]:arr[n];
		int max=arr[0]>arr[n]?arr[0]:arr[n];
		for(int i=1;i<n;i++){
			if(arr[i]<min)
				arr[i]+=k;
			else if(arr[i]>max)
				arr[i]-=k;
			else if(arr[i]-min>max-arr[i])
				arr[i]-=k;
			else
				arr[i]+=k;
		}
		
	}
}
