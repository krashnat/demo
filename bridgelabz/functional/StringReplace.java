package com.bridgelabz.functional;

import java.util.Scanner;

public class StringReplace
{

	public static void main(String[] args) 
	{
		String n="“Hello <<UserName>>, How are you?”" ;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		String s=scan.nextLine();
		String s1=n.replace("<<UserName>>", s);
		System.out.println(s1);
		
		

	}

}
