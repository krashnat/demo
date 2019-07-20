package com.bridgelabz.algorithm;

public class BinarySearchForInt {
	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("Enter the no");
		int d=u.scan.nextInt();
		u.scan.close();
		System.out.println(d);
		int[] a = { 2, 3, 4, 6, 7, 9, 11, 15, 20 };
		int c = u.binarySearchOfInt(a, 11);
		if (c > 0) {
			System.out.println("Element is found at" + " " + c + " " + "position");
		} else {
			System.out.println("Element not found");
		}

	}

}
