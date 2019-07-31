package com.bridgelabz.functional;

import java.util.Scanner;

public class Permutation {
	
	public static String swap(String str,int pos1,int pos2)
	{
		char temp;
		char[] str1=str.toCharArray();
		temp=str1[pos1];
		str1[pos1]=str1[pos2];
		str1[pos2]=temp;
	
	return String.valueOf(str1);
}
	
	public static void permutation(String value,int l,int length)
	{
		String s=value;
		if(l==length)
		{
			System.out.println(s);
		}
		else
		{
			for(int i=l;i<s.length();i++)
			{
				 s=swap(s,l,i);
				permutation(s,l+1,length);
				 s=swap(s,l,i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String to find permutation");
		String input=scan.nextLine();
		scan.close();
		int length=input.length()-1;
		permutation(input,0,length);

	}

}
