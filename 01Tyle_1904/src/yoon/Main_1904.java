package yoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1904 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// input : 타일 사용 갯수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		int[] array = new int[number];
		// 1 ,00 만 이용가능
		for (int i = 0; i < number; i++) {
			if (i == 0) {
				array[i] = 1;
				continue;
			} else if (i == 1) {
				array[i] = 2;
				continue;
			}
			
			array[i] = (array[i - 2] + array[i - 1]) % 15746;
			// 메모리 때문에 마지막에 나누면 넣으면 에러뜸^^;;
		}
	
		// output : 모든 2진 수열의 개수를 15746으로 나눈 나머지를 출력한다.
		System.out.println(array[number - 1]);
	}
}
