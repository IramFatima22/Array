package com.medium;

import java.util.Arrays;

public class UnionandIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={7,1,5,2,3,6};
		int arr2[]={3,8,6,20,7};
		int union[]=findUnion(arr1,arr2);
		for(int i=0;i<union.length;i++)
			System.out.print(union[i]+" ");
		int intersection[]=findIntersection(arr1, arr2);
		System.out.println();
		for(int i=0;i<intersection.length;i++)
			System.out.print(intersection[i]+" ");
		
	}
	public static int[] findUnion(int[] arr1,int[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n1=arr1.length;
		int n2=arr2.length;
		int i=0;
		int j=0;
		int union[]=new int[n1+n2];
		int k=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				union[k]=arr1[i];
				i++;
				k++;
			}
			else if(arr1[i]>arr2[j])
			{
				union[k]=arr2[j];
				j++;
				k++;
			}
			else
			{
				union[k]=arr2[j];
				j++;
				k++;
				i++;
			}
		}
		while(i<n1)
		{
			union[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			union[k]=arr2[j];
			j++;
			k++;
		}
		return union;
		
	}
	public static int[] findIntersection(int[] arr1,int[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n1=arr1.length;
		int n2=arr2.length;
		int i=0;
		int j=0;
		int min=n1<n2?n1:n2;
		int intersection[]=new int[min];
		int k=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j]) i++;
			else if(arr1[i]>arr2[j]) j++;
			else
			{
				intersection[k]=arr2[j];
				j++;
				k++;
				i++;
			}
		}
		return intersection;
		
	}


}
