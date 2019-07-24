package com.bridgelabz.datastructure;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LinkedList {
	Node head;

	void insert(String data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
//new node created
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			//linking the new node with old node
		}
	}

	
	//position finding
	int findPosition(String data) {
		int found = 0;
		String find = data;
		int position = 0;
		Node temp = head;
		while (temp != null) {
			position++;
			if (temp.data.equals(data)) 
			{
				return position;

			}

			temp = temp.next;
		}
		return 0;

	}
//deleting string from the list
	void delete(int pos) {
		String s = "";
		Node temp;
		temp = head;
		for (int i = 1; i < pos; i++) {

			if (i == pos - 1) {
				temp.next = temp.next.next;
			}
			temp = temp.next;

		}

	}

	void arrange() {
		Node temp = head;
		ArrayList al = new ArrayList();
		;
		while (temp.next != null) {
			al.add(temp.data);
			temp = temp.next;
		}al.add(temp.data);
		
		System.out.println(al);
	}
//writing into the file
	void add() throws IOException {
		FileWriter fw = new FileWriter("E:\\Programs\\BridgeLabz\\src\\com\\bridgelabz\\datastructure\\output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		Node temp = head;

		while (temp.next != null) {
			bw.write(temp.data + " ");
			bw.flush();
			temp = temp.next;
		}
		bw.write(temp.data + " ");
		bw.flush();
		
	}
//disply the element from the list
	void show() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}
