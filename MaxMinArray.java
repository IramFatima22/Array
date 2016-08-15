package com.medium;

public class MaxMinArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int n=arr.length;
		int midIndex=(n/2)-1;
		int temp=0,prev=0;
		int tempI=0;
		for(int i=0;i<n;i++)
		{
			tempI=i;
			prev=arr[i];
			while(prev>0)
			{
				
				int tempI2=tempI<=midIndex?tempI*2+1:(n-tempI-1)*2;
				temp=arr[tempI2];
				arr[tempI2]=prev*-1;
				prev=temp;
				tempI=tempI2;
			}
		}
		
		for(int i=0; i<n; i++){
			arr[i]=-arr[i];
			System.out.print(arr[i]+", ");
		}

	}

}
