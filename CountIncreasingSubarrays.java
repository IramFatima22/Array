package com.arrays;

public class CountIncreasingSubarrays {

	public static void main(String[] args) {
		int arr[]={1,4,3};
		int count=countSubarrays(arr);
		System.out.println(count);
	}

	private static int countSubarrays(int[] arr) {
		int count=0;
		int sum=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]<arr[i]){
				count++;
			}
			else{
				sum+=(count*(count+1))/2;
				count=0;
			}
		}
		sum+=(count*(count+1))/2;
		return sum;
	}

}
