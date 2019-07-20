package com.bridgelabz.algorithm;

import java.util.Scanner;

public class FindNo {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		
		int n=s.nextInt();
		
		int li=0;
		int hi=n-1;
		
		while(li<=hi)
		{
			int mi=(li+hi)/2;
			if(li==hi){
				System.out.println("Required No is"+hi );
				break;
			}
			System.out.println("("+li+"...."+mi+")false    ("+(mi+1)+"....."+hi+")true");
			boolean srch=s.nextBoolean();
			 if(srch==false)
			{
				hi=mi;
			}
			else if(srch==true)
			{
				li=mi+1;
			}
	}
		

	}

	
}
