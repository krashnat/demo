package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmTest {
	public static void main(String[] args) {
		Sort n = new Sort();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1 = s.nextLine();
		s1 = s1.replace(" ", "");
		char[] c1 = s1.toCharArray();
		char[] c4 = n.sorting(c1);
		System.out.println("Enter the 2nd String");
		String s2 = s.nextLine();
		s2 = s2.replace(" ", "");
		char[] c2 = s2.toCharArray();
		char[] c3 = n.sorting(c2);
		numSame(c3, c4);
	}

	public static void numSame(char[] list1, char[] list2) {
		int same = 0;
		int l1 = list1.length;
		int l2 = list2.length;
		for (int i = 0; i <= list1.length - 1; i++) {
			if (list1[i] == list2[i]) {
				same++;
			}
		}
		if (l1 == l2) {
			if (l1 == same) {
				System.out.println("anagram");
			} else {
				System.out.println(" not anagram");
			}
		} else {
			System.out.println(" not anagram");
		}
	}

}

class Sort {
	public char[] sorting(char[] a) {
		char temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
		return a;
	}
}
