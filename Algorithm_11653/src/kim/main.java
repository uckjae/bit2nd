package kim;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i = 2; i < input; i++) { // ���μ� ���� 2���� ���� �ϰ�
			while(input % i == 0) { // ���ξȿ� �ִ� ������ ���� ���ǿ� ���������� �������� ����.
				System.out.println(i); // ���� ���� ���
				input /= i; // �Է��� ���ڸ� i������ ������ ����
			}
		}
//		if (input > 1) { // while���� ��Ÿ�� ������ ���� ���ڸ� if���� ź��.
//			System.out.println(input);
//		}

	}

}
