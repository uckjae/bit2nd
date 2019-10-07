package kim;

import java.util.Scanner;

public class max_min {

	public static void main(String[] args) {
		int mok = 1;
		int c = 0;
		int d = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("큰 값을 입력 해주세요.");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("작은 값을 입력 해주세요.");
		int b = Integer.parseInt(sc.nextLine());

		for (int i = 2; i < 100; i++) { // 소인수 분해 처럼 2 부터 증가해서 if문을 탄다
			while(a % i == 0 && b % i == 0) { // a , b가 i랑 나눠서 나머지가 0이라면
				mok = 1*i; 

			}
		}
		System.out.println("최대 공약수 : " + mok);

		c = a / mok; // 최대공약수로 나눈 몫을 계산
		d = b / mok;

		min = mok * c * d; // 최소공배수 식

		System.out.println("최소공배수 : " + min);
		
		if(a >)
		
	}
}
