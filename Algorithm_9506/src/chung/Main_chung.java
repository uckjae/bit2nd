package chung;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_chung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			ArrayList<Integer> numarr = new ArrayList<>();
			if (num == -1) {
				return;
			}
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					numarr.add(i);
				}
			}
			int result = 0;
			for (Integer arr : numarr) {
				result += arr;
			}
			if (result != num) {
				System.out.println(num + " is NOT perfect.");
				continue;
			}
			System.out.print(num + " = ");
			for (int i = 0; i < numarr.size(); i++) {
				System.out.print(numarr.get(i));
				if (i + 1 != numarr.size()) {
					System.out.print(" + ");
				}
			}
			System.out.println();
		}
	}
}
