package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main_lee {
    public static Queue<Integer> getPrimNumbers(int n) {
        Queue<Integer> primeNumbers = new ArrayDeque<>();
        boolean[] isPrimeNumber = new boolean[n + 1];
        Arrays.fill(isPrimeNumber, true);
        if (n == 2) {
            primeNumbers.add(2);
            return primeNumbers;
        } else if (n == 3) {
            primeNumbers.add(2);
            primeNumbers.add(3);
            return primeNumbers;
        }

        int max = (int) Math.sqrt(n) + 1;
        for (int i = 2; i <= max; i++) {
            if (isPrimeNumber[i]) {
                for (int j = i; j * i <= n; j++) {
                    isPrimeNumber[i * j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }

    public static ArrayList<Integer> Factorization(int n) {

        ArrayList<Integer> factorization = new ArrayList<Integer>();

        Queue<Integer> primeNumbers = getPrimNumbers(n);

        while (n != 1) {
            if (n % primeNumbers.peek() == 0) {
                factorization.add(primeNumbers.peek());
                n /= primeNumbers.peek();
            } else {
                primeNumbers.poll();
            }
        }
        return factorization;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n != 1) {
            ArrayList<Integer> result = Factorization(n);
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }

        }
    }
}
