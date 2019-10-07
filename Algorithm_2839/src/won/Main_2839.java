package won;

import java.util.Scanner;

public class Main_2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt(); // 41
		int sugar5kg = 5;
		int sugar3kg = 3;
		int delivery = 0;
		if(sugar % sugar5kg == 0) { // 1 X
			delivery = sugar / sugar5kg; 
			//System.out.println("ÃÖ¼Ò°ª : " + delivery);
			return;
		}else {
			int quotient = sugar / sugar5kg; // ³ª´« ¸ò  // 8
			for(int i = quotient; i > 0; i--) { // i´Â ¸ò // 8 -> 7
				int rest = sugar - (i * 5); // ¸ò*5 = 40 - 41 // ³ª¸ÓÁö 1 - > 6
				if(rest % sugar3kg == 0) { // 1 X // 6 O
					int j = rest / sugar3kg; 
					delivery = i + j; // i(5kg) = 7, j(3kg) = 2 // 7 + 2 
					//System.out.println("ÃÖ¼Ò°ª : " + delivery); // 9
					return;
				}
			}
		}
		if(sugar % sugar3kg == 0) {
			delivery = sugar / sugar3kg;
		}else {
			delivery = -1;
		}
		//System.out.println("ÃÖ¼Ò°ª : " + (delivery));
	}
}