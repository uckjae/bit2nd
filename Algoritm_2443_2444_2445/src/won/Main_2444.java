package won;

import java.util.Scanner;

public class Main_2444 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.print("출력할 줄 수를 입력하세요 : ");
		int line = scan.nextInt();
		for(int i = 1; i <= 2 * line - 1; i++) {
			if(i <= line) {
				for(int j = 1; j <= line - i; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= i * 2 -1; j++) {
					System.out.print("*");
				}
			}else {
				int down = i - line + 1;
				for(int j = 1; j <= down - 1; j++) {
					System.out.print(" ");
				}
				for(int j = down; j <= 2 * line - down; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
