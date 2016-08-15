package com.arrays;

public class MinMergeToMakePallindrome {

	public static void main(String[] args) {
		int arr[]={11,14,15,29};
		System.out.println(finMinMerges(arr));

	}

	private static int finMinMerges(int[] arr) {
		int count=0;
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			if(arr[l]==arr[r])
			{
				l++;
				r--;
			}
			else if(arr[l]<arr[r])
			{
				arr[l+1]+=arr[l];
				l++;
				count++;
			}
			else if(arr[r]<arr[l])
			{
				arr[r-1]+=arr[r];
				r--;
				count++;
			}
			
		}
		return count;
		
	}

}
