package won;
import java.util.Scanner;

public class Main_2747 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] seq = new int[input + 1];
		seq[0] = 0;
		seq[1] = 1;
		
		for(int i = 2; i <= input; i++) {
			seq[i] = seq[i-1] + seq[i-2];
		}
		System.out.println(seq[input]);
	}
}
