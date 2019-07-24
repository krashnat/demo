package com.bridgelabz.datastructure.que;

import java.util.Scanner;

public class QueueOperation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Queue q=new Queue();
		System.out.println("Enter 1.Deposite");
		System.out.println("Enter 2.Withdraw");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:q.enqueue();
			break;
			case 2:q.dequeue();
			break;
		
		
	}
		
		
	}

}
