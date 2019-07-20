package com.bridgelabz.algorithm;
	
import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value");
		long st=System.currentTimeMillis();

		int n=s.nextInt();
		System.out.println("Enter the second no");
		int n1=s.nextInt();
		long et=System.currentTimeMillis();
		System.out.println("Elapsed time is"+" "+(et-st));
		
		

	}

}
