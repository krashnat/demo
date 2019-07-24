package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingAndWriting {

	public static void main(String[] args) throws IOException {
		LinkedList ll = new LinkedList();
		Scanner scan = new Scanner(System.in);
		File f = new File("E:\\Programs\\BridgeLabz\\src\\com\\bridgelabz\\datastructure\\input.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		StringBuilder sb = new StringBuilder();
		ArrayList ar = new ArrayList();
		if ((s = br.readLine()) != null) {

			sb.append(s);
		}
		String data = sb.toString();
		String[] array = data.split(",");
		for (int i = 0; i < array.length; i++) {
			ll.insert(array[i]);

		}
		ll.show();
		System.out.println(".........First List............");
		System.out.println("Enter the name you want to search");//user input
		String search=scan.next();
		int place = (int) ll.findPosition(search);//position of string to delete
		System.out.println(place);
		System.out.println(".........Position.............");
		if(place==0)
		{
			ll.insert(search);//inserting data into file
		}
		else
		{
			ll.delete(place);//deleting data from file
		}
		
		ll.show();//new list
		System.out.println(".......After Delete...............");
		ll.arrange();
		System.out.println("............After Arrange..........");
		
		ll.add();//adding the new list into the file

	}

}
