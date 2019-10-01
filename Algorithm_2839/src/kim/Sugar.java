package kim;

import java.util.Scanner;

public class Sugar {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int input = sc.nextInt();
		if(input % 5 == 0) {
			int sugar2 = input / 5;
				System.out.println("5KG : " + sugar2);
				if(input % 3 == 0 ) {
					int three1 = input / 3;
					System.out.println("3KG : " + three1);
				if(three1 > sugar2) {
					System.out.println("5KG : " + sugar2);
				}if(three1 < sugar2) {
					System.out.println("3KG : " + three1);
				}
				if(input % 3 == 0) {
					int three3 = input / 3;
					System.out.println("3KG : " + three3);
					}
				}
		}	
		if(input % 5 !=0) {
			int five1 = input / 5;
			if(five1 !=0) {
				int three = five1 / 3;
				System.out.println(five1+ "-" + three);
			}
		}
		
		
		
		
		
		

	}
}
