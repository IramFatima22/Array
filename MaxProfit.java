package com.hard;

import java.util.Arrays;

//Maximum profit by buying and selling stock at most twice
public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price={90,80,70,60,50};
		System.out.println(findMax(price));

	}
	public static int findMax(int[] price)
	{
		int n=price.length;
		int[] profit=new int[n];
		Arrays.fill(profit, 0);
		int max=price[n-1];
		for(int i=n-2;i>=0;i--)
		{
			max=price[i]>max?price[i]:max;
			profit[i]=profit[i+1]>max-price[i]?profit[i+1]:max-price[i];
		}
		int min=price[0];
		for(int i=1;i<n;i++)
		{
			min=price[i]<min?price[i]:min;
			profit[i]=profit[i-1]>(profit[i]+(price[i]-min))?profit[i-1]:(profit[i]+(price[i]-min));
		}
		return profit[n-1];
	}

}
