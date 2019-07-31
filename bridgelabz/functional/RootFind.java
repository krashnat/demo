package com.bridgelabz.functional;

import java.util.Scanner;

public class RootFind {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		System.out.println("Enter the value of c");
		int c=scan.nextInt();
		scan.close();
		int delta=(b*b)-(a*a*c);
	     if(delta>0)
	     {
	    	 int r1=(int) ((-b + Math.sqrt(delta))/(2*a));
	    	 int r2=(int) ((-b -Math.sqrt(delta))/(2*a));
	    	 System.out.println("roots are"+" "+r1+" "+r2);
	    	 
	     }
	     else if(delta==0)
	     {
	    	int r1=-b/(2*a); 
	    	System.out.println("roots  are "+r1);
	     }
	     else
	     {
	    	 System.out.println("roots are   infinity");
	     }

	}

}
