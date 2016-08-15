package com.hard;

public class MaxSumNoAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,5,10,40,50,35};
		int inc=arr[0];
		int exc=0;
		int incL=0,excL=0;
		for(int i=1;i<arr.length;i++)
		{
			incL=exc+arr[i];
			excL=Math.max(inc, exc);
			inc=incL;
			exc=excL;
		}
		System.out.println(Math.max(incL, excL));

	}

}
