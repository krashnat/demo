package com.bridgelabz.functional;

public class BinarySort {

	public static void main(String[] args) {
		int temp = 0;
		int[]  a= { 2, 5, 3, 4, 5, 6, 7, 4, 9 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}

	}
}
