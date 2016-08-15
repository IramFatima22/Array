package com.easy;
//Element that Occurs Once
public class SingleOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={7,3,5,4,5,3,1,4,7};
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res^=arr[i];
		}
		System.out.println(res);

	}

}
