package com.medium;

public class PrevNextMul {
//Replace Array Element by Multiplication of Previous and Next Element
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,4,5,6};
		int n=arr.length-1;
		int prev=0;
		int next=0;
		int hold=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			prev=hold;	
			if(i==n)
				next=arr[i];
			else
				next=arr[i+1];
			hold=arr[i];
			arr[i]=prev*next;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
