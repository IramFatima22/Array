package com.medium;

public class TurnImage90degree {

	public static void main(String[] args) {
		String arr[][]={{"*1","*2","*3"},{"#1","#2","#3"},{"^1","^2","^3"},{"@1","@2","@3"}};
		int row=arr.length;
		int col=arr[0].length;
		String res[][]=new String[col][row];
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				//System.out.println(i+" "+j);
				res[i][j]=arr[row-j-1][i];
			}
		}
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		

	}

}
