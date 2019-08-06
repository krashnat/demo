package com.bridgelabz.datastructure;
import java.util.Scanner;

import  com.bridgelab.util.*;
public class Calander {

	public static void main(String[] args) {
		String[] day= {"sun","mon","tue","wed","thu","fri","sat"};
		String[] months= {"jan","feb","mar","apr","may","june","jul","aug","sep","oct","nov","dec"};
		int[] maxday= {31,28,31,30,31,30,31,31,30,31,30,31};
		Util u=new Util();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of  year");
		int year=scan.nextInt();
		System.out.println("Enter the value of month");
		int month=scan.nextInt();
		scan.close();
		int  firstday=u.checkStartDay(1, year, month);
		int maximumdays = 0;
		boolean result=u.isLeapYear(2019);
		if(result==true)
		{
			if(month==2)
			{
				maximumdays=29;
			}
			
		}
		else
		{
			 maximumdays=maxday[month-1];
		}
		for(int i=0;i<day.length;i++)
		{
			System.out.print(day[i]+" ");
		}
		System.out.println();
		for(int i=0;i<firstday;i++)
		{
			System.out.print("  ");
		}
		     
	    for(int i=1;i<=maximumdays;i++)
	    {
	    	System.out.print(i+" ");
	    	if((i+firstday)%7==0)
	    	{
	    		System.out.println();
	    	}
	    }
		

	}

}
