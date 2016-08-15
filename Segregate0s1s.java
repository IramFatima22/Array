package com.medium;

public class Segregate0s1s {

	public static void main(String[] args) {
		int arr[]={0,1,0,1,0,0,1,1,1,0,1};
		segregate(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		

	}

	private static void segregate(int[] arr) {
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			while(arr[l]==0 && l<r)
			{
				l++;
			}
			while(arr[r]==1 && r>l)
			{
				r--;
			}
			if(l<r)
			{
				arr[l++]=0;
				arr[r--]=1;
			}
		}
		
	}

}
