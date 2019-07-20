package com.bridgelabz.algorithm;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		int res=0;
		int[] array= {1,1,1,0,1};
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==1)
			{
				//System.out.println((int)(Math.pow(2, i)));
		   res=res+(int)(Math.pow(2, i));
		
			}
	     }
		System.out.println(res);
	}

}
