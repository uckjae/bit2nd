package chung;

import java.util.Scanner;

public class Main_chung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		while(num != 1) {
			for(int i=2; i<= num; i++) {
				if(num%i==0) {
					num/=i;
					System.out.println(i);
					break;
				}
			}
		}
	}

}
