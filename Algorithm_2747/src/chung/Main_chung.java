package chung;

import java.util.Scanner;

public class Main_chung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());		
			System.out.println(fibo(input));
		
	}
	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
			return fibo(n-2)+fibo(n-1);
	}
}
