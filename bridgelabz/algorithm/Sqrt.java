package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of x");
		double x=scan.nextInt();
		System.out.println("Enter the value of y");
		double y=scan.nextInt();
		double distance= Math.sqrt(((Math.pow(x, x))+(Math.pow(y, y))));
		System.out.println("Distance betn points are"+" "+distance);
		

	}

}
