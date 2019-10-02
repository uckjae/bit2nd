package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main_lee {
    public static Queue<Integer> getPrimNumbers(int n){
        Queue<Integer> primeNumbers = new ArrayDeque<>();
        boolean[] isPrimeNumber = new boolean[n];
        Arrays.fill(isPrimeNumber,true);
        int max = (int)Math.sqrt(n);
        for(int i=2;i<=max;i++){
            if(isPrimeNumber[i]){
                for(int j=i;j*i<max;j++){
                    isPrimeNumber[i*j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(isPrimeNumber[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }

    public static ArrayList<Integer> Factorization(int n){
        ArrayList<Integer> factorizaion = null;
        Queue<Integer> primeNumbers = getPrimNumbers(n);
        while(n!=1){
            if(n%primeNumbers.peek()==0){
                factorizaion.add(primeNumbers.peek());
            }else{
                primeNumbers.poll();
            }
        }
        return factorizaion;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> result = Factorization(n);
        System.out.println(result.toString());
    }
}
