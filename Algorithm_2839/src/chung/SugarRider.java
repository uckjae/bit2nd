package chung;

import java.util.Scanner;

public class SugarRider {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int five = 0;
		int three = 0;
		int total = 0;
		
		while(N%5 != 0 && N>=0) {
			N -= 3;
			three++;
		//	System.out.println(N);
		}
		if(N<0) {
			System.out.println(-1);
		} else {
			five = N/5;
			total = three + five;
			System.out.println(total);
		}		
		}	
}
