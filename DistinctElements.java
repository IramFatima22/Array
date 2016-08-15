package com.easy;

import java.util.HashMap;

public class DistinctElements {
	public static void main(String [] args)
	{
		int[] arr={12,10,9,45,2,10,10,4,5};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				continue;
			else
			{
				map.put(arr[i], i);
				System.out.print(arr[i]+" ");
			}
		}
	}

}
