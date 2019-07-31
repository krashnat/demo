package com.bridgelabz.functional;

import java.util.Random;
import java.util.Scanner;

public class TikTokToe {

	public static void main(String[] args) {
		int count = 0, c = -1;

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = c;
				System.out.print(a[i][j] + " ");
				c--;

			} 
			System.out.println();
		}
		while (count < 9) {
			System.out.println("enter the player A's: ");
			int x = s.nextInt();
			int y = s.nextInt();
			while (a[x][y] > 0) {
				System.out.println("Reenter the player A's:");
				x = s.nextInt();
				y = s.nextInt();

			}
			a[x][y] = 1;
			count++;
			if (win(a) == 1) {
				System.out.println("X is Winner: ");
				break;
			}

			if (count < 9) {
				System.out.println("enter the player B's: ");
				x = r.nextInt(3);
				y = r.nextInt(3);
				while (a[x][y] > 0) {
					System.out.println("enter the player B's: ");
					x = r.nextInt(3);
					y = r.nextInt(3);
				}
				a[x][y] = 2;
				count++;
				arr(a);

				if (win(a) == 1) {
					System.out.println("Y is Winner: ");
					break;

				}

			}
		}
		if (win(a) != 1) {
			System.out.println("tie");
		}
		s.close();
	}

	public static void arr(int a[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < 0) {
					System.out.print("? ");
				} else {
					if (a[i][j] == 1)
						System.out.print("x ");
					else
						System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

	public static int win(int[][] a) {
		for (int i = 0; i < 3; i++) {
			if (a[i][0] == a[i][1] && a[i][0] == a[i][2]) {
				return 1;
			}
			if (a[0][i] == a[1][i] && a[0][i] == a[2][i]) {
				return 1;
			}
		}
		if (a[0][0] == a[1][1] && a[0][0] == a[2][2]) {
			return 1;
		}
		if (a[0][2] == a[1][1] && a[0][2] == a[2][0]) {
			return 1;
		}

		return 0;
	}

}
