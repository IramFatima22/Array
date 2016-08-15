package com.arrays;

public class FindLostElementFromDuplicatedArray {

	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5};
		int arr2[]={1,2,3,4};
		//int res=findLostElement1(arr1,arr2);
		//System.out.println(res);
		int n1=arr1.length;
		int n2=arr2.length;
		if(n1>n2)
			System.out.println(findLostElement2(arr1, arr2,0,arr1.length-1));
		else
			System.out.println(findLostElement2(arr2, arr1,0,arr2.length-1));
	}

	private static int findLostElement2(int[] arr1, int[] arr2, int start, int end) {
		if(start>end) return -1;
		if(arr1[start]!=arr2[start]) return arr1[start];
		if(start+1==end) return arr1[end];
		int mid=(start+end)/2;
		if(arr1[mid]==arr2[mid])
			return findLostElement2(arr1, arr2, mid, end);
		else
			return findLostElement2(arr1, arr2, start, mid);
	}

	private static int findLostElement1(int[] arr1, int[] arr2) {
		int res=0;
		for(int i=0;i<arr1.length;i++){
			res^=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			res^=arr2[i];
		}
		return res;
	}

}
