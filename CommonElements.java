package com.medium;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={3,5,10,20,30,40,80};
		int[] arr2={5,6,7,20,80,100};
		int[] arr3={1,4,15,20,30,70,80,120};
		findIntersection(arr1,arr2,arr3);
	}

	private static void findIntersection(int[] arr1, int[] arr2, int[] arr3) {
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j] )
				i++;
			else if(arr2[j]<arr3[k] )
				j++;
			else
				k++;		
		}
	}

}
