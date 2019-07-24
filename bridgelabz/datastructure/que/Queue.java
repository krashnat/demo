package com.bridgelabz.datastructure.que;

import java.util.Scanner;

public class Queue
{
	int[] queue=new int[10];
	int r=-1;
	int f=0;int size=10;
	int count=0;
	Scanner scan=new Scanner(System.in);
	void enqueue()
	{
		if(count==size-1)
		{
			System.out.println("insertion not Possible");
		}
		else
		{
			System.out.println("Enter the value you want to insert");
			int element=scan.nextInt();
			r=(r+1)%size;
			queue[r]=element;
			count++;
		}
	}
	void dequeue()
	{
		if(count==0)
		{
			System.out.println("Deletion not possible");
		}
		else
		{
			System.out.println("dequed is "+queue[f]);
			f=(f+1)%size;
			count--;
		}
		
	
	}
	void show()
	{
		int f1=f;
		if(count==0)
		{
			System.out.println("display not possible");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				System.out.println(queue[f1]);
				f1=(f1+1)%size;
			}
		}
	}
	
	public void size() {
		System.out.println("the nomber elements in the que are"+count);
		
	}

}
