package Kim;

public class Star {

	public static void main(String[] args) {
	for(int a=1;a<=5; a++ ) {
		for(int b=0;b<=5-1; b++) {
			System.out.print(" ");
		}
		for(int c=1;c<=a*2-1;c++) { //행을 1개에서 2개씩 늘린다. 1개부터 시작하기위해 -1
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
