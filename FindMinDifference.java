package com.arrays;

import java.util.Arrays;

public class FindMinDifference {

	public static void main(String[] args) {
		int [] arr={1,5,8,19,14,25};
		int diff=findMinDiff(arr);
		System.out.println(diff);
	}

	private static int findMinDiff(int[] arr) {
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++){
			if((arr[i]-arr[i-1])<min){
				min=arr[i]-arr[i-1];
			}
		}
		return min;
	}

}
