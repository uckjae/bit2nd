package Kim;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int g = h - 1;
		for (int a = 1; a <= h; a++) { // ���� ������ ��
			for (int b = 1; b <= h - a; b++) {// ���� ������ ��
				System.out.print(" ");
			}
			for (int c = 1; c <= a * 2 - 1; c++) {// ������ ���� ������ ������ ���� ����
				System.out.print("*");
			}
			System.out.println();
		}
		for (int d = g; d >= 1; d--) { // ���� ���� ��
			for (int e = 0; e <= g - d; e++) { // ���� ���� ��
				System.out.print(" ");
			}

			for (int f = 1; f <= d * 2 - 1; f++) {// ������ ��� ������ ������ ���� ����
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
