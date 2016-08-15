package com.medium;

import java.util.HashMap;

public class DuplicatesWithinKDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		int k=3;
		System.out.println(checkDuplicates(arr,k));
	}
	public static boolean checkDuplicates(int [] arr,int k)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int val=map.get(arr[i]);
				if(i-val<=k)
				{
					return true;
				}
				else
				{
					map.put(arr[i], i);
				}
					
			}
			else
				map.put(arr[i], i);
		}
		return false;
	}

}
