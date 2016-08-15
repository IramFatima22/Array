package com.easy;

import java.util.HashMap;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={10,5,3,4,3,5,6};
		int arr[]={6,10,5,4,9,120,4,6,10};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int rep=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(map.containsKey(arr[i]))
			{
				rep=arr[i];
			}
			else
				map.put(arr[i], i);
		}
		System.out.println(rep);
	}

}
