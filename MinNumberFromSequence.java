package com.hard;

public class MinNumberFromSequence {

	public static void main(String[] args) {
		String s1="IID";
		//formMinNumber(s1);
		String res="";
		int index=-1;
		int baseVal = 1;
		while(res.length()<s1.length()+1)
		{
			String temp=formMinNumberRec(s1,index,baseVal);
			int max=Integer.parseInt(temp.charAt(0)+"");
			res=res+temp;
			index=res.length()-1;
			baseVal = max+1;	
		}
		System.out.println(res);
	}

	

	private static String formMinNumberRec(String s1, int index, int prevVal) {
		if(index+1==s1.length() || s1.charAt(index+1)=='I' ) return ""+prevVal;
		String res="";
		res=formMinNumberRec(s1, index+1, prevVal+1);
		res=res+prevVal;
		return res;
	}



	private static void formMinNumber(String s1) {
		int res=0;
		int prev=0,val=0;
		for(int i=0;i<s1.length();i++)
		{
			
			//System.out.println(prev);
			//prev=val;
			val=0;
			char ch=s1.charAt(i);
			if(ch=='D')
			{
				int count=findNextDs(s1,i+1);
				//System.out.println(count+"..");
				if(i==0){ 
					val=count+2;
					res=res*10+val;
					prev=val-1;
					res=res*10+(val-1);
				}
				else
				{	val=prev-1;
					res=res*10+val;
					prev=val;
				}	
			}
		}
		System.out.println(res);
		
	}

	private static int findNextDs(String s1, int index) {
		int count=0;
		while(index<s1.length() && s1.charAt(index)=='D')
		{
			index++;
			count++;
		}
		return count;
	}

}
