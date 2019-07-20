package com.bridgelabz.functional;

import java.util.*;
import java.util.Scanner;

public class CoupanJn {
	public static int genr(int rn) {
		int n = (int) (Math.random() * rn);
		return n;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range");
		int r = s.nextInt();
		int loop = r;
		int count = 0;
		List<Integer> ar = new ArrayList<Integer>();
		while (loop > 0) {

			int rn = genr(r);
			if (!ar.contains(rn))
				;
			{
				ar.add(rn);
				loop--;
				System.out.println("hello");
			}
			count++;
			System.out.println(count);
		}
		System.out.println(count);

	}

}
