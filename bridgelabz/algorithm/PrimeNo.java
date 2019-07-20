package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{
		
		String primeNum=" ";
		ArrayList a=new ArrayList();
		
		Scanner s=new Scanner(System.in);
		
		//System.out.println("Enter the range for Prime No");
		//int r=s.nextInt();
		for(int i=0;i<1000;i++)
		{
			int count=0;
			for(int n=i;n>0;n--)
			{
				if(i%n==0)
				{
					count++;
				}
			}
					if(count==2)
					{
						a.add(i);
					}

		 }
		//System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			int nn=swap(a.get(i));
			boolean d=check(nn, a);
			if(d==true)
			{
				
				int c=swap((a.get(i)));
				if(c==(int)(a.get(i)))
				{
					System.out.println(c);
				}
				
				
			}
			
		}
		
	}
	
	
	public static int swap(Object n)
	{
		int num = (int) n;
		int reversed = 0;
        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num =num/ 10;
	     }
        return  reversed;
	}
	
	public static boolean check(int n,ArrayList a)
	{
		if(a.contains(n))
		{
			return true;
		}
		return false;
	}
	
		
}

