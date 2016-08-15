package com.hard;

public class AraryRotationBlockSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7};
		int d=2;
		arrayRotation(arr,d);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

	private static void arrayRotation(int[] arr, int d) {
		int n=arr.length;
		int a=d;
		int b=n-d;
		while(a!=b)
		{
			if(a<b)
			{
				swap(arr,d-a,d-a+b,a);
				b=b-a;
			}
			else
			{
				swap(arr,d-a,d,b);
				a=a-b;
			}
		}
		swap(arr,d-a,d,a);
		
	}

	private static void swap(int[] arr, int i, int j, int a) {
		// TODO Auto-generated method stub
		for(int x=0;x<a;x++)
		{
			int temp=arr[i];
			arr[i++]=arr[j];
			arr[j++]=temp;
		}
		
	}

}
