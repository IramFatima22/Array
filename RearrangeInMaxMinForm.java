package com.arrays;

public class RearrangeInMaxMinForm {

	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7};
		rearrange(arr);
	}

	private static void rearrange(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++){
			int val=arr[i];
			while(val>0){
				int newI=i<n/2?(2*i)+1:2*(n-1-i);
				if(i==newI){
					arr[i]=-val;
					break;
				}
				int temp=arr[newI];
				arr[newI]=-1*val;
				val=temp;
				i=newI;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(Math.abs(arr[i])+" ");
		}
	}

}
