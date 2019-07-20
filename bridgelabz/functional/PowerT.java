package com.bridgelabz.functional;

import java.util.Scanner;

public class PowerT {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		double power=1;
		if(num>=0 && num<32)
		{
			for(double i=1;i<=num;i++)
			{
				power=Math.pow(2,i);
			}
			System.out.println(power);
		}
		else
		{
			System.out.println("int overflow");
		}
		
		

	}

}
