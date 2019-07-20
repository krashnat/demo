package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		binaryConversion(n);

	}

	static void binaryConversion(int num) {
		int a[] = new int[100];
		int i = 0;
		while (num >= 1) {
			a[i] = num % 2;
			num = num / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(a[j]);
		}

	}
}
