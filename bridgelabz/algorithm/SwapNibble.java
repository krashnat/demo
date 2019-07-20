package com.bridgelabz.algorithm;

public class SwapNibble {

	public static void main(String[] args)
	{
		int[] a= {0,1,1,0,0,1,0,0};
		int li=0;
		int hi=a.length;
		
		int mi=((li+hi)/2)-1;
	
		int[] b=new int[hi/2];
		
		int[] c=new int[hi/2];
		int res=0;
		System.out.println(c.length);
		for(int i=0;i<=mi;i++)
		{
			b[i]=a[i];
		}
		int k=0;
		for(int i=mi+1;i<hi;i++)
		{
			c[k]=a[i];
			k++;
		}
		
		System.out.println();
		for(int j=0;j<b.length;j++)
		{
			a[j]=c[j];
		}
		
		for(int i=0;i<c.length;i++)
		{
			a[i+4]=b[i];
		}
		System.out.println("after nibble swapping value of a");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=a.length-1;i>0;i--)
		{
			if(a[i]==1)
			{
				 res=res+(int)(Math.pow(2, (a.length-1)-i));
			}
		}
		System.out.println("new Decimal value"+" "+res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
