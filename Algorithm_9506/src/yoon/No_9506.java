package yoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class No_9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String data;
		List<Integer> numbers = new ArrayList<Integer>();
		while (!(data = br.readLine()).equals("-1")) {
			numbers.add(Integer.parseInt(data));
		}

		StringBuilder builder = new StringBuilder();
		for (Integer number : numbers) {
			int sum = 0;
			String measure = "";
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					measure += i + " + ";
					sum += i;
					if (sum > number)
						break;
				}
			}

			if (sum == number) {
				builder.append(String.format("%d = %s", number, measure.substring(0, measure.length() - 3)));
			} else {
				builder.append(String.format("%d is NOT perfect.", number));
			}
			builder.append("\n");
		}

		// System.out.println(builder.toString());
		// 완전수 = 자신 제외한 약수의 합이 자기 자신인 것
		// 6 = 1 + 2 + 3
		// 12 is NOT perfect.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(builder.toString());
		bw.close();
	}
}
