package com.hard;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		//int [] arr={4,5,2,25};
		//int arr[]={13,7,6,12};
		int arr[]={11,13,21,3};
		Stack<Integer> s=new Stack<Integer>();
		s.push(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			while(!s.isEmpty() && s.peek()<arr[i])
			{
				System.out.println(s.pop()+"="+arr[i]);
			}
			s.push(arr[i]);
		}
		while(!s.isEmpty())
		{
			System.out.println(s.pop()+"="+-1);
		}

	}

}
