package yoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		/*
		  X가 3으로 나누어 떨어지면, 3으로 나눈다. 
		  X가 2로 나누어 떨어지면, 2로 나눈다. 
		  1을 뺀다.
		 */
		int count = 0;
		do {
			if (number % 3 == 0)
				number /= 3;
			else if ((number - 1) % 3 == 0)
				number--;
			else if (number % 2 == 0)
				number /= 2;
			else
				number--;

			count++;
		} while (number != 1);

		System.out.print(count);
	}
}
