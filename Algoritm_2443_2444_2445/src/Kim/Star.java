package Kim;

public class Star {

	public static void main(String[] args) {
	for(int a=1;a<=5; a++ ) {
		for(int b=0;b<=5-1; b++) {
			System.out.print(" ");
		}
		for(int c=1;c<=a*2-1;c++) { //���� 1������ 2���� �ø���. 1������ �����ϱ����� -1
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
