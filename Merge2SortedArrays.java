package com.hard;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int arr1[]={1,5,9,10,15,20};
		int arr2[]={2,3,8,23};
		int n1=arr1.length-1;
		for(int i=arr2.length-1;i>=0;i--)
		{
			int check=arr2[i];
			int last=arr1[n1];
			if(check<last)
			{
				int j=n1-1;
				while(check<arr1[j] && j>=0)
				{
					arr1[j+1]=arr1[j];
					j--;
				}
				arr1[j+1]=check;
				arr2[i]=last;
			}
		}
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		System.out.println();
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");


	}

}
