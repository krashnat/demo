package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Mod {

	public static void main(String[] args) 
	{
		String[] day= {"sun","mon","tue","wed","thu","fri","sat"};
		String[] month= {"jan","feb","mar","apr","may","june","jul","aug","sep","oct","nov","dec"};
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the value of month");
         int m=scan.nextInt();
         System.out.println("Enter the value of date");
         int d=scan.nextInt();
         System.out.println("Enter the value of year");
         int y=scan.nextInt();
         int yo = y - (14 - m) / 12;
         System.out.println(yo);
        		 int x = yo + yo/4 - yo/100 + yo/400;
        		 System.out.println(x);
        		 int mo = m + 12 *((14 - m) / 12) - 2;
        		 System.out.println(mo);
        		 System.out.println(month[mo]);
        		 int d0 =Math.floorMod( (d + x + (31*mo) / 12), 7); 
        		 System.out.println(d0);
        		 System.out.println(day[d0]);
        		 

         
	
	
	}

}
