package yoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// input : 그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int count = 0;

		while (true) {
			if (input % 5 == 0) {
				count += input / 5;
				break;
			} else {
				if (input >= 3) {
					input -= 3;
					count++;
				} else {
					count = -1;
					break;
				}
			}
		}

		// output : 봉지 갯수
		System.out.println(count);
	}
}