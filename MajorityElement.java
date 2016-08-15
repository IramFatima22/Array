package com.medium;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,4,1,4,3,4,4,4};
		majorityMethod1(arr);
		majorityMethod2(arr);
	}

	private static void majorityMethod2(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
		int x=arr[n/2];
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
				count++;
		}
		if(count>n/2)  System.out.println(x);
		else	System.out.println("Not present");
		
	}

	private static void majorityMethod1(int[] arr) {
		// TODO Auto-generated method stub
		int count=1;
		int check=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(check==arr[i])
				count++;
			else
			{
				count--;
				if(count==0)
				{
					check=arr[i];
					count=1;
				}
			}
		}
		int count1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==check)
				count1++;
		}
		if(count1>arr.length/2)
			System.out.println(check);
		else
			System.out.println("No majority element");
	}
	

}
