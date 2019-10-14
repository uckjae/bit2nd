package won;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_9506 {
	public static void perfectNumber(Integer number) {
		ArrayList<Integer> pmList = new ArrayList<Integer>();
		int perfect = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				pmList.add(i);
			}
		}
		for (Integer p : pmList) {
			perfect += p;
		}
		if (perfect != number) {
			System.out.print(number + " is NOT perfect.");
		} else {
			System.out.print(number + " = ");
			for (Integer p : pmList) {
				System.out.print(p);
				if (p != perfect - p) {
					System.out.print(" + ");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int n;
		do {
			n = scan.nextInt();
			if (n != -1) {
				array.add(n);
			}
		} while (n != -1);
		for (int i = 0; i < array.size(); i++) {
			perfectNumber(array.get(i));
			System.out.println();
		}
	}
}
