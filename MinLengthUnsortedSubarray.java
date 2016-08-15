package com.hard;

public class MinLengthUnsortedSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={10,12,20,30,25,40,32,31,35,50,60};
		int arr[]={0,1,15,25,6,7,30,40,50};
		minLength(arr);

	}

	private static void minLength(int[] arr) {
		int n=arr.length;
		int s=0,e=0;
		for(s=0;s<arr.length;s++)
		{
			if(arr[s]>arr[s+1])
				break;
		}
		if(s==n-1)
		{	System.out.println("sorted");
			return;
		}
		for(e=arr.length-1;e>=0;e--)
		{
			if(arr[e]<arr[e-1])
				break;
		}
		int max=arr[s];
		int min=arr[s];
		for(int i=s+1;i<=e;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		for(int i=0;i<s;i++)
		{
			if(arr[i]>min)
			{
				s=i;
				break;
			}
		}
		for(int i=arr.length-1;i>e;i--)
		{
			if(arr[i]<max)
			{
				e=i;
				break;
			}
		}
		System.out.println("start :"+s+" end :"+e);
		
	}

}
