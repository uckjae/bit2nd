package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_2445 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n<1) return;
		for(int i=1; i<=2*n-1;i++) {
			if(i<n) {
				for(int j=1; j<=i;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=(n-i)*2;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i==n) {
				for(int j=1; j<=2*n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=i;j<2*n;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=(i-n)*2;j++) {
					System.out.print(" ");
				}
				for(int j=i;j<2*n;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		

	}

}
