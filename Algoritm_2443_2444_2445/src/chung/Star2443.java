package chung;

import java.util.Scanner;

public class Star2443 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < num ; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j < 2*(num-i)-1 ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
