package com.bridgelabz.orderedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class HashFunction {
	static LinkedList[] l = new LinkedList[11];

	public static void main(String[] args) throws IOException {
		HashFunction h = new HashFunction();
		int[] retArray = h.fileInput();
		int[] retArray1 = bubbleSort(retArray);
		for (int i = 0; i < retArray.length; i++) {
			System.out.println(retArray1[i]);
		}
		h.hashingMethod(retArray);
		h.show();
		h.findPosition();
		h.show();
		
	}

	public void hashingMethod(int[] array) throws IOException {
		
		for (int i = 0; i < array.length; i++) {
			int rem = array[i] % 11;
			if (l[rem] == null) {
				l[rem] = new LinkedList();
				l[rem].insert(array[i]);
			} else {
				l[rem].insert(array[i]);
			}
		}
		}
	       void show()
	       {
	    	   for (int k = 0; k < 11; k++) {
	   			if (l[k] != null) {

	   				System.out.print(k + " -->"+" ");
	   				l[k].display();
	   			}
	   			}
	       }
	public void findPosition()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no for search");
		int requiredinteger=scan.nextInt();
		int  index=requiredinteger%11;
	    int position=l[index].findPosition(requiredinteger);
		System.out.println(index+" "+position);
		if(position>0)
		{
			l[index].delete(position);
		}
		else
		{
			l[index].insert(requiredinteger);
		}
	}
	
	
	int[] fileInput() throws IOException {

		File f = new File("E:\\Programs\\BridgeLabz\\src\\com\\bridgelabz\\orderedlist\\inputinteger");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int num;
		StringBuilder b = new StringBuilder();
		while (((num = br.read()) != -1)) {
			b.append((char) num);
		}
		br.close();
		String s = b.toString();

		String[] s1= s.split(",");
		int length = s1.length;
		int[] retArray = new int[length];
		for (int i = 0; i < s1.length; i++) {
			retArray[i] = Integer.parseInt(s1[i]);
		}
		return retArray;
	}

	public static int[] bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

}