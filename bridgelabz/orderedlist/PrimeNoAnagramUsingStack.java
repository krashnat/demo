package com.bridgelabz.orderedlist;

import java.util.ArrayList;

import com.bridgelab.util.Util;

public class PrimeNoAnagramUsingStack {

	public static void main(String[] args) {
		
		StackUsingLinkedList stack=new StackUsingLinkedList();

		
			Util util = new Util();
			ArrayList a = new ArrayList();
			QueUsingLinkedList q = new QueUsingLinkedList();
			for (int i = 0; i < 1000; i++) {
				boolean result = util.primeCheck(i);
				if (result == true) {
					a.add(i);
				}
			}
			for (int i = 0; i < a.size(); i++) {
				int nn = swap(a.get(i));
				boolean d = check(nn, a);
				if (d == true) {

					stack.push((int) a.get(i));

				}

			}

			stack.display();

		}

		public static int swap(Object n) {
			int num = (int) n;
			int reversed = 0;
			while (num != 0) {
				int digit = num % 10;
				reversed = reversed * 10 + digit;
				num = num / 10;
			}
			return reversed;
		}

		public static boolean check(int n, ArrayList a) {
			if (a.contains(n)) {
				return true;
			}
			return false;
			

		}}
