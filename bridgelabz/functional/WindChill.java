package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double t=0;
		double v=0;
		System.out.println("Enter the value of temperature");
        double temp=scan.nextInt();
        if(temp<50)
        {
        	 t=temp;	
        }
        else
        {
        	System.out.println("temperature is to high");
        }
        
        System.out.println("Enter the wind speed");
        double vind=scan.nextInt();
        if(vind<120 && vind>3)
        {
        	 v=vind;
        	
        	
        }
        double wind=35.74+0.6215+((0.4275*t)-35.75)*Math.pow(v, 0.16);
        System.out.println(wind);
     
		
	}

}
