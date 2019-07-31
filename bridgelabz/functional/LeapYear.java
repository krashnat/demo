package com.bridgelabz.functional;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		s.close();
		int yy=s.nextInt();
		if(yy%400==0)
		{
			System.out.println("not leap year");
		}
		else
		{
			if(yy%4==0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("not leap year");
			}
		}

	}

}
