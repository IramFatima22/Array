package com.arrays;

public class CountMinStepsToGetArray {

	public static void main(String[] args) {
		int [] res_array={16,16,16};
		System.out.println(findMinSteps(res_array));

	}

	private static int findMinSteps(int[] res_array) {
		int count=0;
		int n=0;
		while(true)
		{
			int i;
			for(i=0;i<res_array.length;i++)
			{
				if(res_array[i]%2==1)
					break;
				if(res_array[i]==0)
					n++;
			}
			if(n==res_array.length) return count;
			if(i==res_array.length) 
			{
				for(int j=0;j<res_array.length;j++)
				{
					res_array[j]/=2;
				}
				count++;
			}
			for(int j=0;j<res_array.length;j++)
			{
				if(res_array[j]%2==1)
				{
					res_array[j]--;
					count++;
				}
			}
			
		}
		
	}
}
