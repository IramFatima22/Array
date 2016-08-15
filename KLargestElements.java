package com.hard;

import com.ds.MaxHeap;
import com.ds.MinHeap;

public class KLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,23,12,90,30,2,5};
		int k=3;
		//kLargestMethod1(arr,k);
		kLargestMethod2(arr,k);
		kLargestMethod3(arr, k);
	}

	private static void kLargestMethod3(int[] arr, int k) {
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int n=arr.length-1;
		int i=0;
		System.out.print("Bubble sort method :");
		while(i<k)
		{
			System.out.print(arr[n--]+" ");
			i++;
		}
		
	}

	private static void kLargestMethod2(int[] arr, int k) {
		MaxHeap mh=new MaxHeap(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			mh.insert(arr[i]);
		}
		//mh.print();
		for(int i=0;i<k;i++)
			System.out.println(mh.remove());
	}

	private static void kLargestMethod1(int[] arr, int k) {
		
		MinHeap mh=new MinHeap(k);
		for(int i=0;i<k;i++)
		{
			mh.insert(arr[i]);
		}
		
		int root=mh.root();
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]>root)
			{
				mh.updateRoot(arr[i]);
				root=arr[i];
			}
		}
		mh.print();
		
	}

}
