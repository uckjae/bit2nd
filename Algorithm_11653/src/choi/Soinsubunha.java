package choi;

import java.util.Scanner;

public class Soinsubunha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=0;
		
		while (n != 1) {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					n = n/i;
					num=i;
					System.out.println(num);
					break;
				}
			}
		}
	}
}
