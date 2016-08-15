package com.hard;

public class Sort0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,1,1,0,1,2,1,2,0,0,0,1};
		sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void sort(int[] arr) {
		int i=0;
		int lo=0;
		int mid=0;
		int hi=arr.length-1;
		while(mid<=hi)
		{
			if(arr[mid]==0)
			{	//swap(arr[lo],arr[mid]);
				int temp=arr[mid];
				arr[mid]=arr[lo];
				arr[lo]=temp;
				lo++;
				mid++;
			}
			else if(arr[mid]==1)
				mid++;
			else if(arr[mid]==2)
			{
				int temp=arr[mid];
				arr[mid]=arr[hi];
				arr[hi]=temp;
				//swap(arr[mid],arr[hi]);
				hi--;
			}
		}
		
	}

	private static void swap(int val1, int val2) {
		int temp=val1;
		val1=val2;
		val2=temp;
	}

}
