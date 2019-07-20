package com.bridgelabz.functional;

import java.util.Scanner;

public class HarmonicNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double n,i;
		System.out.println(" Enter the value of N");
		n=sc.nextDouble();
		for(i=1;i<=n;i++)
		{
		
			if(i==1)
			System.out.print("1/1+ ");
			else if(i==n)
			System.out.print("1/ "+i);
			else
			System.out.print("1/ "+i+"+" );
		}
		System.out.println();
		
	}

}
