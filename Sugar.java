/*
����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. 
�������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. 
���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
*/
import java.util.Scanner;

public class Sugar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt();
		int sugar5kg = 5;
		int sugar3kg = 3;
		int deli = 0;
		int very = 0;
		if(sugar % sugar5kg == 0) {
			System.out.println("ù��° if");
			deli = sugar / sugar5kg;
			return;
		}else {
			System.out.println("ù��° if�� else");
			int quotient = sugar / sugar5kg;
			for(int i = quotient; i > 0; i--) {
				System.out.println("for : " + i);
				int rest = sugar - (i * 5);
				if(rest % sugar3kg == 0) {
					System.out.println("for �ȿ� if");
					int j = rest / sugar3kg;
					deli = i + j;
					return;
				}
			}System.out.println("for�� ������");
		}System.out.println("ù��° if ������");
		if(sugar % sugar3kg == 0) {
			System.out.println("�ι�° if");
			very = sugar / sugar3kg;
			return;
		}else {
			System.out.println("�ι�° if");
			very = -1;
		}
		System.out.println("�ּҰ� : " + (deli + very));
		System.out.println("��ü ��� �ȵǴ°ž�?");
	}
}