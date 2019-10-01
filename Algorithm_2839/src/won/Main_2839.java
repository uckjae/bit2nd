package won;

import java.util.Scanner;

public class Main_2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt();
		int sugar5kg = 5;
		int sugar3kg = 3;
		int delivery = 0;
		if(sugar % sugar5kg == 0) {
			delivery = sugar / sugar5kg;
			return;
		}else {
			int quotient = sugar / sugar5kg;
			for(int i = quotient; i > 0; i--) {
				int rest = sugar - (i * 5);
				if(rest % sugar3kg == 0) {
					int j = rest / sugar3kg;
					delivery = i + j;
					System.out.println("최소값 : " + delivery);
					return;
				}
			}
		}
		if(sugar % sugar3kg == 0) {
			delivery = sugar / sugar3kg;
			
		}else {
			delivery = -1;
		}
		System.out.println("최소값 : " + (delivery));
	}
}