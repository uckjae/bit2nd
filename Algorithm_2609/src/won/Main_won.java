package won;

import java.util.Scanner;

public class Main_won {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = 1;
		int L = 0;
		int high = 0;
		int low = 0;
		System.out.print("첫번째 수 : ");
		int a = scan.nextInt();
		scan.nextLine();
		System.out.print("두번째 수 : "); 
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
		System.out.println("high값 : "+high);
		
		L = (a * b) / high;
		
		System.out.println("최대공약수 : " + L + "\t 최대공약수 : " + high);
	}
}
