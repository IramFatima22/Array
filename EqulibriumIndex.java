package com.easy;

public class EqulibriumIndex {

	public static void main(String[] args) {
		int arr[]={-7,1,5,2,-4,3,0};
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		int lsum=0;
		int rSum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i>0) lsum+=arr[i-1];
			rSum=sum-lsum-arr[i];
			if(lsum==rSum)
				System.out.print(i+" ");
		}

	}

}
