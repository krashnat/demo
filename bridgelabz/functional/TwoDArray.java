package com.bridgelabz.functional;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no row");
		int r = s.nextInt();
		System.out.println("Enter the col");
		int c = s.nextInt();
		s.close();
		int[][] a = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = s.nextInt();
			}

		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}

}
