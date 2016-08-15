package com.medium;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,-1,7,-1,-1,10,-1};
		int arr2[]={5,8,12,14};
		merge(arr1,arr2,3,4);
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
	}

	private static void merge(int[] arr1, int[] arr2,int m,int n) {
		// TODO Auto-generated method stub
		int pointer=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=-1)
				arr1[pointer++]=arr1[i];
		}
		int x=arr1.length-1;
		while(m>0 && n>0)
		{
			if(arr1[m-1]>arr2[n-1])
			{
				arr1[x--]=arr1[m-1];
				m--;
			}
			else
			{
				arr1[x--]=arr2[n-1];
				n--;
			}			
		}
		while(n>0)
		{
			arr1[x--]=arr2[n-1];
			n--;
		}
	}

}
