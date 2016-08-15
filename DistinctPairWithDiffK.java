package com.medium;

import java.util.Arrays;
import java.util.HashMap;



public class DistinctPairWithDiffK {

	public static void main(String[] args) {
		int arr[]={1,5,3,4,2};
		int k=3;
		Arrays.sort(arr);
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(search(arr[i]+k,arr,i+1,n-1))
					count++;
		}
		System.out.println(count);
		method2(arr,k);
		method3(arr,k);

	}

	private static void method3(int[] arr, int k) {
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
				map.put(arr[i], i);
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]+k) || map.containsKey(arr[i]-k))
			{
				if(map.containsKey(arr[i]-k)) count++;
				if(map.containsKey(arr[i]+k)) count++;
				map.remove(arr[i]);
			}
		}
		System.out.println("method3 :"+count);
		
	}

	private static void method2(int[] arr,int k) {
		int l=0,r=0;
		int n=arr.length;
		int count=0;
		while(l<n && r<n)
		{
			int diff=arr[r]-arr[l];
			if(diff==k){ count++; r++; l++;}
			else if(diff<k) r++;
			else l++;
		}
		System.out.println("method2 :"+count);
		
	}

	private static boolean search(int x, int[] arr, int start, int end) {
		if(start>end) return false;
		int mid=(start+end)/2;
		if(x==arr[mid]) return true;
		boolean ans=false;
		if(x>arr[mid])
			return ans|| search(x, arr, mid+1, end);
		else
			return ans|| search(x, arr, start, mid-1);
		
	}

	

}
