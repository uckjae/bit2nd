package CHOI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {  
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int k=(num/2);
		for(int i=1; i<=k; i++) {
			if(num%i==0) {
				int r=num%i;
				
				System.out.println("미완성입니다.");
				break;
			}else{
				System.out.println("아님");
				break;
			}
		}

	}

}
