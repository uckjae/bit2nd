package won;
import java.util.Scanner;

public class Main_11653 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int p = 2; // ���� ��
		
		while(number >= p) { // �Է��� ���ڰ� 1�� �ƴҶ�
			if(number % p == 0) { // �������� 0�̸� 
				System.out.println(p);
				number /= p; // ���� number�� ��Ƽ� �ݺ�
				p--; // 2�� �ٽ� �������� �� ������ p--
			}
			p++; // p�� 2�� �ȳ��������� p++ >> 
		}
	}
}
