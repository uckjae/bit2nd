package yoon;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import com.sun.javafx.image.IntPixelAccessor;

import sun.management.counter.Variability;

public class No_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numbers = new ArrayList<Integer>();

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++)
			numbers.add(Integer.parseInt(br.readLine()));

		StringBuilder result = new StringBuilder();
		TreeSet<Integer> stackArea = new TreeSet<Integer>();
		List<Integer> pushDatas = new ArrayList<Integer>();
		pushDatas.add(numbers.get(0));
		result.append("+");
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(0) > numbers.get(i)) {
				stackArea.add(numbers.get(i));
				pushDatas.add(numbers.get(i));
				result.append("+");
			}
		}
		result.append("-");

		for (int i = 1; i < numbers.size(); i++) {
			int pop = numbers.get(i);
			System.out.println("pop: " + pop);
			if (stackArea.contains(pop)) {
				if (stackArea.last() != pop) {
					result.setLength(0);
					result.append("No");
				} else {
					result.append("-");
					stackArea.remove(pop);
				}
			} else {
				for (int j = i + 1; j < numbers.size(); j++) {
					System.out.println(numbers.get(j));
					if (pushDatas.contains(numbers.get(j)))
						continue;
					if (pop > numbers.get(j)) {
						stackArea.add(numbers.get(j));
						pushDatas.add(numbers.get(j));
						result.append("+");
					}
				}
				result.append("+");
				result.append("-");
			}
		}
		
		System.out.println(result);
	}
}
