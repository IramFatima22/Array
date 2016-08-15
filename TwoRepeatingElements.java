package com.hard;

public class TwoRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,2,4,5,2,3,1};
		int n=arr.length-2;
		int x=0;
		int y=0;
		int xor=0;
		for(int i=0;i<arr.length;i++)
			xor^=arr[i];
		for(int i=1;i<=n;i++)
			xor^=i;
		int set_bit_no=xor & ~(xor-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]+":");
			System.out.print(arr[i] & set_bit_no);
			if((arr[i] & set_bit_no)==0)
				x^=arr[i];
			else
				y^=arr[i];
			//System.out.println("loop x :"+x+" y: "+y);
		}
		System.out.println(" out x :"+x+" y: "+y);
		for(int i=1;i<=n;i++)
		{
			if((i & set_bit_no)==0)
				x^=i;
			else
				y^=i;
			//System.out.println("loop  1 x :"+x+" y: "+y);
		}
		System.out.println("x :"+x+" y: "+y);

	}

}
