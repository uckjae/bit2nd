package Kim;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int g = h - 1;
		for (int a = 1; a <= h; a++) { // 열의 공백의 수
			for (int b = 1; b <= h - a; b++) {// 행의 공백의 수
				System.out.print(" ");
			}
			for (int c = 1; c <= a * 2 - 1; c++) {// 공백을 찍은 나머지 공간에 별을 찍음
				System.out.print("*");
			}
			System.out.println();
		}
		for (int d = g; d >= 1; d--) { // 열의 공백 수
			for (int e = 0; e <= g - d; e++) { // 행의 공백 수
				System.out.print(" ");
			}

			for (int f = 1; f <= d * 2 - 1; f++) {// 공백을 찍고 나머지 공간에 별을 찍음
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
