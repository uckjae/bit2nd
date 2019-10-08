package won;

import java.util.Scanner;

public class Main_won {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = 1;
		int L = 0;
		int high = 0;
		int low = 0;
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > b) {
			high = a;
			low = b;
		}else {
			low = a;
			high = b;
		}
		
		while(R > 0) {
			R = high%low;
			high = low;
			low = R;
		}
		
		L = (a * b) / high;
		
		System.out.println(high);
		System.out.println(L);
	}
}
