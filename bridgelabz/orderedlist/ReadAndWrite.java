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
	LinkedList linkedlist=new LinkedList();
	File f=new File("E:\\Programs\\BridgeLabz\\src\\com\\bridgelabz\\orderedlist\\inputinteger");
	FileReader fr=new FileReader(f);
    BufferedReader br=new BufferedReader(fr);
     int num;
     StringBuilder builder=new StringBuilder();
    while(((num=br.read())!=-1))
    	{
    	       builder.append((char)num);
    	}

    String string=builder.toString();
    
    String stringarray[]=string.split(",");
    for(int i=0;i<stringarray.length;i++)
    {
    	 linkedlist.insert(Integer.parseInt(stringarray[i]));
    }
    

    linkedlist.sort();
    linkedlist.display();
    System.out.println("Enter the element you want to search");
   int element=scan.nextInt();
    int position=linkedlist.findPosition(element);
    System.out.println(position);
    linkedlist.display();
    if(position==0)
    {
    	linkedlist.insert(element);
    }
    else
    {
    	linkedlist.delete(position);
    }
   linkedlist.display();
   linkedlist.arrange();
   linkedlist.add();
   
    
	}

}

