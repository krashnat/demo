package com.bridgelabz.binarysearchtree;

public class BinarySearchTree {
	Node head;
	void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		if(node.data>data)
		{
			while(node.rightnode!=null)
			{
			   	
			}
			node.rightnode=node;
		}
	}

}
