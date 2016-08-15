package com.easy;

public class DeleteElementInOneTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,1,2,5,90};
		int x=7;
		int result=delete(arr,x);
		for(int i=0;i<result;i++)
			System.out.print(arr[i]+" ");
	}
	public static int delete(int[] arr,int x)
	{
		int n=arr.length;
		int hold=arr[n-1];
		if(hold==x) return n-1;
		int i=n-2;
		for(i=n-2;i>=0;i--)
		{
			int temp=arr[i];
			arr[i]=hold;
			hold=temp;
			if(temp==x) break;
		}
		return n-1 ;
	}

}
