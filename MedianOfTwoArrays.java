package com.hard;

public class MedianOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={23,24,25,100}; 
		int arr2[]={10,11,12,13};
		System.out.println(medianMethod1(arr1,arr2));
		System.out.println(medianMethod2(arr1,arr2)); //same size arrays
	}

	private static double medianMethod2(int[] arr1, int[] arr2) {
		int s1=0;
		int e1=arr1.length-1;
		int s2=0;
		int e2=arr2.length-1;
		while(e1-s1!=1 && e2-s2!=1)
		{
			double m1=0;
			double m2=0;
			if((e1-s1)%2==0)		//odd
			{
				m1=arr1[((e1+s1)/2)];
				m2=arr2[(e2+s2)/2];
			}
			else					//even
			{
				m1=(arr1[(e1+s1)/2]+arr1[(e1+s1+1)/2])/2.0;
				m2=(arr2[(e2+s2)/2]+arr2[(e2+s2+1)/2])/2.0;
			}
			if(m1==m2)
			{
				return m1;
			}
			else if(m1>m2)
			{
				if((e1-s1)%2==0)		//odd
				{
					e1=(e1+s1)/2;
					s2=(e2+s2)/2;
				}
				else
				{
					e1=(e1+s1)/2;
					s2=(e2+s2+1)/2;
				}
				
			}
			else if(m2>m1)
			{
				if((e1-s1)%2==0)		//odd
				{
					s1=(e1+s1)/2;
					e2=(e2+s2)/2;
				}
				else
				{
					s1=(e1+s1+1)/2;
					e2=(e2+s2)/2;
				}
				
			}
		}
		return (Math.max(arr1[s1], arr2[s2])+Math.min(arr1[e1], arr2[e2]))/2.0;
	}

	private static double medianMethod1(int[] arr1, int[] arr2) {
		int n1=arr1.length-1;
		int n2=arr2.length-1;
		while(true)
		{
			int l1=n1==-1?Integer.MIN_VALUE:arr1[n1>>1];
			int r1=n1==((arr1.length*2)-1)?Integer.MAX_VALUE:arr1[(n1+1)>>1];
			int l2=n2==-1?Integer.MIN_VALUE:arr2[n2>>1];
			int r2=n2==((arr2.length*2)-1)?Integer.MAX_VALUE:arr2[(n2+1)>>1];
			if(l2>r1)
			{
				n1++;
				n2--;
			}
			else if(r2<l1)
			{
				n2++;
				n1--;
			}
			else
			{
				return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
			}
		}
	}

}
