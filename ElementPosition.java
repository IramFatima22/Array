package com.hard;
//Element position in a sorted array  of infinite  numbers
public class ElementPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,4,5,6,7,12,14,16,18,21,22,25,27};
		int x=7;
		int start=0;
		int end=1;
		while(x>arr[end])
		{
			start=end;
			end=end*2;
		}
		System.out.println(start+" "+end);
		System.out.println(findPosition(arr,start,end,x));
	}
	public static int findPosition(int[] arr,int start,int end,int x)
	{
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if(x==arr[mid])
			return mid;
		else if(x>arr[mid])
			return findPosition(arr, mid+1, end, x);
		else
			return findPosition(arr, start, mid-1, x);
	}

}
