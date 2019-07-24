package com.bridgelabz.orderedlist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LinkedList<Integer> {
	Node<Integer> head;
     private int size;
	void insert(int n)
	{
		Node<Integer> node=new Node<Integer>();
		node.data=n;
		node.next=null;
		
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
		while(temp.next!=null)
		{
			position++;
			if(temp.data==data)
			{
				return position;
			}
			temp=temp.next;
			
		}
		return 0 ;
	
	}
	void delete(int position)
	{
		if(position==1)
		{
			head=head.next;
		}
		else
		{
		Node temp=head.next;
		
		for(int i=1;i<=position;i++)
		{
			if(i==position-1)
			{
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
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
