package com.medium;

import java.util.Arrays;
import java.util.Comparator;

public class CheckIfIntervalsOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2},{5,6},{3,4},{7,8}};
		System.out.println(checkOverlap(arr));
	}
	public static boolean checkOverlap(int [][] arr)
	{
		Arrays.sort(arr, new Comparator<int[]>() 
		{
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(a[0], b[0]);
		    }
		});
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i][0]<arr[i-1][1])
				return true;
		}
		return false;
	}
	

}
