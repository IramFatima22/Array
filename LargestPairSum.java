package com.easy;

public class LargestPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,34,10,6,40};
		int result=largestPairSum(arr);
		System.out.println(result);
	}
	public static int largestPairSum(int [] arr)
	{
		int lar=Math.max(arr[0], arr[1]);
		int secondlar=Math.min(arr[0], arr[1]);
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>lar)
			{
				secondlar=lar;
				lar=arr[i];
			}
			else if(arr[i]>secondlar)
			{
				secondlar=arr[i];
			}
		}
		return lar+secondlar;
	}

}
