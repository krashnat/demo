package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Utility {
	public static Scanner scan = new Scanner(System.in);

	public static String[] sortSTring(String[] s) {

		String temp = "";
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		return s;
	}

	public static void binarySearch(String search, String[] a) {
		String e = search;
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;
		System.out.println(a[mi]);
		while (li <= hi) {
			int res = e.compareTo((a[mi]));
			if (res == 0) {
				System.out.println("Element found at" + " " + mi + " " + "position");
				break;
			}
			if (res > 0) {
				li = mi + 1;
			}
			if (res < 0) {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;

		}

	}

	public static int[] bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static int binarySearchOfInt(int[] a, int reqint) {
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {

			if (a[mi] == reqint) {

				return mi;

			} else if (a[mi] < reqint) {
				li = mi + 1;

			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;

		}
		return 0;

	}
}
