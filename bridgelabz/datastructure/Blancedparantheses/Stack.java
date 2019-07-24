package com.bridgelabz.datastructure.Blancedparantheses;

public class Stack
{
	char stack[]=new char[20];
	 int top=-1;
     void push(char value)
     {
    	 top++;
    	stack[top]=value;
    	
    	
     }
	void pop()
	{
		top--;
	}
	
	int  show()
	{
		
		return top;
	}
	void isEmpty()
	{
		if(top==-1) 
		{
			System.out.println("parantheses are balanced");
		}
		else
		{
			System.out.println("parnthesys are not balnced");
		}
		
	}
	

}
