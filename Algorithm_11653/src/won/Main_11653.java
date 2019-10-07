package won;
import java.util.Scanner;

public class Main_11653 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int p = 2;
		
		while(number >= p) {
			if(number % p == 0) {
				System.out.println(p);
				number /= p;
				p--;
			}
			p++;
		}
	}
}
