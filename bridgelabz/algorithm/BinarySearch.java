package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a[]= {1,2,5,6,7,8,11,13,14,15,17,19};
		System.out.println("Enter the Element you want to srch ");
		int srch=scan.nextInt();
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
			if(a[mi]==srch)
			{
				System.out.println("Element found at"+" "+mi+" "+"Position");
				break;
			}
			else if(a[mi]<srch)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
	   }
	}
}
