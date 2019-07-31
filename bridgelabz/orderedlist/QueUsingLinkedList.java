package com.bridgelabz.orderedlist;

public class QueUsingLinkedList
{
	Node rear=null; Node front=null;
	void insert(int data)
	{
		Node node=new Node(data);
		if(rear==null)
		{
			rear=front=node;
			
		}
		else
		{
			rear.next=node;
			rear=node;
		}
	}
	void display()
	{
		Node temp=front;
		while(temp!=null)
		{
			
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
