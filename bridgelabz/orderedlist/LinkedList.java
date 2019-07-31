package com.bridgelabz.orderedlist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LinkedList {
	Node head;
     private int size;	
     void insert(int n)
	{
		Node node=new Node(n);
		
		if(head==null)
		{
			head=node;
			
		}
		else
		{
			
			Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
			
		}
		size++;
		
	
	}
	void sort()
	{
		if(size>1)
		{
			
			for(int i=0;i<size;i++)
			{
				Node currentnode=head;
				Node next=head.next;
				
				for(int j=0;j<size-1;j++)
				{
					if(currentnode.data > next.data)
					{
						int temp=currentnode.data ;
						currentnode.data=next.data;
						next.data=temp;
					}
					currentnode=next;
					next=next.next;
					
				}
				
				
			 }
		}
	}
	
	void display()
	{
		Node node=head;
		if(head==null) {
			System.out.println("Underflow");
		}
		else
		while(node!=null) 
		{
		System.out.println(node.data);
		node=node.next;
		}
		}
	
	int findPosition(int data)
	{
		Node temp=head;
		int position=0;
	if(temp.data!=0)
	{
		while(temp.data!=0)
		{
			position++;
			if(temp.data==data)
			{
				
				return position;
			}
			if(temp.next!=null)
			{
			temp=temp.next;
			}
			else
			{
				return 0;
			}
		}
	}
	else
	{
		if(temp.data==data)
		{
			return position+1;
		}
		else
		{
			return 0;
		}
	}
		return 0 ;
	
	}
	
	public void delete(int position)
	{
		Node temp=head;
		if(position == 1)
		{
			head=temp.next;
		}
		else
		{
			while(position-2 > 0)
			{
				temp=temp.next;
				position--;
			}
		temp.next=temp.next.next;
		}
	}
	void arrange()
	{
		ArrayList al=new ArrayList();
		Node temp=head;
		while(temp.next!=null)
		{
			al.add(temp.data);
			temp=temp.next;
		}
		al.add(temp.data);
		System.out.println(al);
	}
	void add() throws IOException
	{
		
		FileWriter fw=new FileWriter("E:\\Programs\\BridgeLabz\\src\\com\\bridgelabz\\orderedlist\\output");
		BufferedWriter bw=new BufferedWriter(fw);
		Node temp=head;
		while(temp.next!=null)
		{
			bw.write(temp.data+" ");
			bw.flush();
			temp=temp.next;
		}
		bw.write(String.valueOf(temp.data));
		bw.flush();
		
	}
	

}
