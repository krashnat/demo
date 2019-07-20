package com.bridgelabz.functional;

public class AddToZero {

	public static void main(String[] args) {
		int a[] = { 3, 2, -5, 2, 4, 5, 6, 7, -8, -5, -3 };
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				for (int k = 0; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					} else {
						System.out.println(a[i] + a[j] + a[k]);
					}
				}
			}

		}

	}

}
