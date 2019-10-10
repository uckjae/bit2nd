package kim;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int save =0;
		
		if(n == -1)  {
			return;
		}		
		
		System.out.print(n + "=");
		for(int i=1;i<n;i++) {
			if(n % i == 0) {
				save +=i;
				System.out.print(i + " + ");
				//System.out.print("+");	
			}
			
			
		}
		if(n < save) {
			System.out.println(n + "is NOT Perfect");
		}
		
		
	}

	}

