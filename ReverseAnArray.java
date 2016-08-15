package com.easy;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={21,3,14,5,18,17,12};
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			int temp=arr[l];
			arr[l++]=arr[r];
			arr[r--]=temp;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
