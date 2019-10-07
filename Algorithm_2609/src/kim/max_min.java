package kim;

import java.util.Scanner;

public class max_min {

	public static void main(String[] args) {
		int mok = 1;
		int c = 0;
		int d = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력.");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 숫자 입력.");
		int b = Integer.parseInt(sc.nextLine());

		
		
		
		for (int i = 2; i < 100; i++) {// 소인수 분해 처럼 2 부터 증가해서 if문을 탄다
			
			
			while(a % i == 0 && b % i == 0) { // a , b가 i랑 나눠서 나머지가 0이라면
				mok =1*i; 
				break;
			}
		}
		System.out.println("최대 공약수 : " + mok);

		min = (a * b) / mok;
		System.out.println("최소공배수 : " + min);
	}
}
