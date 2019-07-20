package com.bridgelabz.functional;

import java.util.Scanner;

public class Power {

	public static void main(String[] args)
	{
		int res=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of power you require");
		int n=s.nextInt();
		if(n>0 &&n<32)
		{
			for	(int i=1;i<=n;i++)
			{
		      res=res*2;       	
		}
		}
	System.out.println(res);

	}

}
