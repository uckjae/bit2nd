package kim;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i = 2; i < input; i++) { // 소인수 분해 2부터 시작 하고
			while(input % i == 0) { // 가로안에 있는 조건을 보고 조건에 맞을때까지 무한으로 돈다.
				System.out.println(i); // 나눈 숫자 출력
				input /= i; // 입력한 숫자를 i값으로 나눈걸 저장
			}
		}
//		if (input > 1) { // while문을 안타고 나눌수 없는 숫자면 if문을 탄다.
//			System.out.println(input);
//		}

	}

}
