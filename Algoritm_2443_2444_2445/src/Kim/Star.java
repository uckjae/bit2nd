package Kim;

public class Star {

	public static void main(String[] args) {
	for(int a=1;a<=4; a++ ) { //���� ������ �� 
		for(int b=1;b<=4-a; b++) {//���� ������ �� 
			System.out.print(" ");
		}
		for(int c=1;c<=a*2-1;c++) {// ������ ���� ������ ������ ���� ����
			System.out.print("*");
		}
		System.out.println();
	}
	for(int d = 3;d>=1;d--) { //���� ���� �� 
		for(int e=1;e<=4-d;e++) { //���� ���� �� 
			System.out.print(" ");
		}
		
		for(int f =1;f<=d*2-1;f++) {//������ ��� ������ ������ ���� ���� 
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
