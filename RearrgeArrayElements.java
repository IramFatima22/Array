package com.medium;

public class RearrgeArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,0,2};
		int res[]=rearrange(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");

	}
	public static int[] rearrange(int []arr)
	{
		
		/*int val = 0;   
		int i = arr[0]; //i=1 
		while (i != 0) //
		{	
			int new_i = arr[i]; //3
			arr[i] = val;		//0
			val = i;			//1
			i = new_i;			//3
		}
		arr[0] = val; 
		return arr;*/
		int n=arr.length;
		int i=0;
		int x=arr[0];
		int val=0;
		while(x!=0)
		{
			val=arr[i];
			int temp=arr[val];
			arr[val]=i;
			i=temp;
			//System.out.print(i+"..");
			x=val;
		}
		return arr;
	}

}
