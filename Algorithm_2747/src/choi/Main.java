package choi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A=0;
		int B=1;
		int C=0;
		
		for(int i=0; i<num; i++) {
			C=A+B;
			B=A;
			A=C;
		}
		System.out.println(C);
	}
}
