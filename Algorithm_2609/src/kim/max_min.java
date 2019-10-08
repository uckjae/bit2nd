package kim;

import java.util.Scanner;

public class max_min {

	public static void main(String[] args) {
		int mok = 1;
		int min = 0;
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] strs = input.split(" ");
		a = Integer.parseInt(strs[0]);
		b = Integer.parseInt(strs[1]);

		for (int i = 2; i < a * b; i++) {// 소인수 분해 처럼 2 부터 증가해서 if문을 탄다

			while (a % i == 0 && b % i == 0) { // a , b가 i랑 나눠서 나머지가 0이라면
				mok = 1 * i;
				break;
			}
		}
		System.out.println(mok);

		min = (a * b) / mok;
		System.out.println(min);
	}
}
