package com.medium;
class Pair
{
	int max;
	int min;
}
public class MaxandMin {

	public static void main(String[] args) {
		int arr[]={5,7,12,8,15,6,21,9,18};
		//findMaxMinMethod1(arr);
		Pair res=findMaxMinMethod2(arr,0,arr.length-1);
		System.out.println(res.max+" : "+res.min);

	}

	public static Pair findMaxMinMethod2(int[] arr,int l,int r) {
		Pair res=new Pair();
		if(l==r)
		{
			
			res.max=arr[l];
			res.min=arr[l];
			return res;
		}
		if(l+1==r)
		{
			
			res.max=Math.max(arr[l], arr[r]);
			res.min=Math.min(arr[l], arr[r]);
		}
		int mid=(l+r)/2;
		Pair resL=findMaxMinMethod2(arr, l, mid);
		Pair resR=findMaxMinMethod2(arr, mid+1, r);
		res.min=Math.min(resL.min, resR.min);
		res.max=Math.max(resL.max, resR.max);
		return res;
		
	}

	private static void findMaxMinMethod1(int[] arr) {
		int a=arr[0];
		int b=arr[1];
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		for(int i=2;i<arr.length;i++)
		{
			max=arr[i]>max?arr[i]:max;
			min=arr[i]<min?arr[i]:min;
		}
		System.out.println("max :"+max+" min :"+min);
		
	}

}
