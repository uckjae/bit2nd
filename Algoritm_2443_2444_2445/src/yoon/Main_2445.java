package yoon;

import java.util.Scanner;

public class Main_2445 {
	public static void main(String[] args) {
		int inputNum = new Scanner(System.in).nextInt();
		int height = inputNum * 2;
		int width = (height + 1) / 2;
		for (int i = 0; i < width; i++)
			write(width, i);

		for (int i = width - 2; i >= 0; i--)
			write(width, i);
	}

	private static void write(int number, int i) {
		for (int j = 0; j <= i; j++)
			System.out.print("*");

		int blank = 2 * (number - (i + 1));
		for (int k = 0; k < blank; k++)
			System.out.print(" ");

		for (int j = 0; j <= i; j++)
			System.out.print("*");

		System.out.println();
	}
}