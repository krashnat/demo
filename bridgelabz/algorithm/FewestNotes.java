package com.bridgelabz.algorithm;

import java.util.Scanner;

public class FewestNotes {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=s.nextInt();
		s.close();
	    int[] notes= {1000,500,100,50,10,5,2,1};
	    FewestNotes c=new FewestNotes();
	    c.ncheck(amount,notes);

	}
 
	 void ncheck(int amount,int[] notes)
	 {
		 
		if(amount<=0)
		{
			System.out.println("Enter amount correctly");
		    
		}
		for(int i=0;i<notes.length;i++)
		{
			if(amount>=notes[i])
			{
				int total = amount/notes[i];
				System.out.println("reruired notes of"+notes[i]+" "+total);
				amount=amount%notes[i];
				{
					if(amount==0)
					{
						System.exit(0);
					}
				}
			      ncheck(amount,notes);
			}
			
            			
		}
		
		
		
		
	}

}
