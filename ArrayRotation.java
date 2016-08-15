package com.hard;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={1,2,3,4,5,6,7,8,9};
		int d=2;
		//rotateMethod1(arr,d);
		System.out.println();
		rotateMethod2(arr,d);
	}

	

	private static void rotateMethod2(int[] arr, int d) {
		int n=arr.length;
		int gcd=findGcd(n,d);
		for(int i=0;i<gcd;i++)
		{
			int j=i;
			int temp=arr[i];
			while(true)
			{
				int k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;	
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}



	private static int findGcd(int n, int d) {
		if(d==0)
			return n;
		return findGcd(d, n%d);
	}



	private static void rotateMethod1(int[] arr,int d) {
		for(int i=0;i<d;i++)
		{
			int temp=arr[0];
			int j=0;
			for(j=1;j<arr.length;j++)
				arr[j-1]=arr[j];
			arr[j-1]=temp;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
