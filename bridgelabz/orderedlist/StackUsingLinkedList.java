package com.bridgelabz.orderedlist;

public class StackUsingLinkedList {
	Noded top;
	
	
	void push(int data)
	{
		
		Noded node= new Noded(data);
		if(top==null)
		{
			
			top=node;
		}
		else
		{
			
			top.next=node;
			node.prev=top;
			top=node;
			
			}
	}
	void display()
	{
	
		while(top!=null)
		{
		System.out.println(top.data);
		top=top.prev;
		}
	}
	

}
