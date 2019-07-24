package com.bridgelabz.orderedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
		
	Scanner scan=new Scanner(System.in);	
	LinkedList<Integer> ll=new LinkedList<Integer>();
	File f=new File("E:\\Programs\\BridgeLabz\\src\\com\\bridgelabz\\orderedlist\\inputinteger");
	FileReader fr=new FileReader(f);
    BufferedReader br=new BufferedReader(fr);
     int num;
     StringBuilder b=new StringBuilder();
    while(((num=br.read())!=-1))
    	{
    	       b.append((char)num);
    	}

    String s=b.toString();
    
    String s1[]=s.split(",");
    for(int i=0;i<s1.length;i++)
    {
    	 ll.insert(Integer.parseInt(s1[i]));
    }
    

    ll.sort();
    ll.display();
    System.out.println("Enter the element you want to search");
   int element=scan.nextInt();
    int position=ll.findPosition(element);
    System.out.println(position);
    ll.display();
    if(position==0)
    {
    	ll.insert(element);
    }
    else
    {
    	ll.delete(position);
    }
   ll.display();
   ll.arrange();
   ll.add();
   
    
	}

}

