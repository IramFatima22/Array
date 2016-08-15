package com.medium;

import java.util.HashMap;

public class ZeroSubArray {

	public static void main(String[] args) {
		int arr[]={1,4,-3,0,7};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(map.containsKey(sum)) 
				System.out.println("Zero SubArray present");
			else
				map.put(sum, i);
		}

	}

}
