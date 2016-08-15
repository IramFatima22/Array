package com.easy;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {

	public static void main(String[] args) {
		int arr[]={5,12,3,14,9,10,8};
		int x=14;
		System.out.println(pairSumMethod1(arr,x));
		System.out.println(pairSumMethod2(arr, x));
	}

	private static boolean pairSumMethod2(int[] arr, int x) {
		Arrays.sort(arr);
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			if(arr[l]+arr[r]==x)
				return true;
			else if(arr[l]+arr[r]<x)
				l++;
			else
				r--;
		}
		return false;
	}

	private static boolean pairSumMethod1(int[] arr, int x) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(x-arr[i]))
			{
				return true;
			}
			else
				map.put(arr[i], i);
		}
		return false;
	}

}
