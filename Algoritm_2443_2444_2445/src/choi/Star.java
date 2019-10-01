package choi;

import java.util.Scanner;

public class Star {

		public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("입력하시오:");
	       int x =sc.nextInt();
			for (int i = 1; i <= x; i++) {
				for (int j = 1; j <= x; j++) {
					if (!((i > j && i + j > x+1) || (i + j < x+1 && i < j))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		}

	}
