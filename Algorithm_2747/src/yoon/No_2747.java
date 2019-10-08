package yoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No_2747 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// input : n번째
		List<Integer> numbers = new ArrayList<>();
		numbers.add(0);
		numbers.add(1);

		int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

		if (number <= 1) {
			System.out.println(numbers.get(number));
			return;
		}

		int sum = 0;
		for (int i = 1; i < number; i++) {
			sum = numbers.get(i - 1) + numbers.get(i);
			numbers.add(sum);
		}

		// output : 숫자
		System.out.println(sum);
	}
}
