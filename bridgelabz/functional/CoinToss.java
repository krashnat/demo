package com.bridgelabz.functional;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of times you want to toss");
		int num=s.nextInt();
		s.close();
		double head=0,tail=0;
		for(int i=0;i<num;i++)
		{
			double d=Math.random();
			if(d<0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		
		}
		System.out.println(head);
		System.out.println(tail);
		double n=tail/head;
		n=n*100;
		System.out.println(n);
		
	}

}
