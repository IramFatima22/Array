package com.medium;

public class MaxJIdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={34,8,10,3,2,80,30,33,1};
		int x=maxdifference(arr);
		System.out.println(x);

	}

	private static int maxdifference(int[] arr) {
		int lMin[]=new int[arr.length];
		int rMax[]=new int[arr.length];
		lMin[0]=arr[0];
		int n=arr.length;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<lMin[i-1])
				lMin[i]=arr[i];
			else
				lMin[i]=lMin[i-1];
		}
		rMax[n-1]=arr[n-1];
		for(int j=n-2;j>=0;j--)
		{
			rMax[j]=arr[j]>rMax[j+1]?arr[j]:rMax[j+1];
		}
		int l=0,r=0,diff=0;
		int i1=0,i2=0;
		int maxdiff=Integer.MIN_VALUE;
		while(l<n && r<n)
		{
			if(lMin[l]<rMax[r])
			{	diff=r-l;
				if(diff>maxdiff)
				{
					maxdiff=diff;
					i1=l;
					i2=r;
				}
				
				r++;
			}
			else
			{
				l++;
			}
 
		}
		System.out.println(i1+" :"+i2);
		return maxdiff;
	}

}
