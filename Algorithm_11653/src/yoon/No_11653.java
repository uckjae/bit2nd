package yoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No_11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// input : ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		List<Integer> sosus = new ArrayList<Integer>();

		int divNumber = 2;
		while (true) {
			int mok = inputNum / divNumber;
			int other = inputNum % divNumber;

			if (other == 0) {
				sosus.add(divNumber);
				inputNum = mok;
			} else
				divNumber++;

			if (inputNum < divNumber)
				break;
		}

		// output : N�� ���μ����� ����� �� �ٿ� �ϳ��� ������������ ���
		for (int sosu : sosus)
			System.out.println(sosu);
	}
}
