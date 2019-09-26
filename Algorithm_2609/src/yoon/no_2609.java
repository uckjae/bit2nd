package yoon;

import java.util.Scanner;

public class no_2609 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);

		// 유클리드 호제법 : 2개의 자연수의 최대공약수를 구하는 알고리즘
		// 					   식 : r을 r'로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수
		// 					  a(두 수중에 큰 값)에 최대공약수가 담긴다.
		// 					  조건 : 1번째 숫자가 큰 수

		if (num2 > num1) {
			int temp = 0;
			temp = num2;
			num2 = num1;
			num1 = temp;
		}

		int r = 1;
		while (r > 0) {
			r = num1 % num2;
			num1 = num2;
			num2 = r;
		}

		// 최소공배수 : num1*num2/최대공약수
		int min = (Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1])) / num1;

		// output : 최대공약수\n 최소공배수
		System.out.println(num1 + "\n" + min);
	}
}
