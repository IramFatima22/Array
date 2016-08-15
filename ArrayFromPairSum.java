package com.hard;

public class ArrayFromPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={14,9,10,11,12,7};
		int n=4;
		int res[]=makeOrig(arr,n);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}

	private static int[] makeOrig(int[] arr, int n) {
		int [] res=new int[n];
		res[0]=(arr[0]+arr[1]-arr[n-1])/2;
		for(int i=1;i<n;i++)
		{
			res[i]=arr[i-1]-res[0];
		}
		return res;
	}

}
