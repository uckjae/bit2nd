package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_lee {
    static long[] array = new long[1000000];

    public static long numTyle(int n){
        long result = 0;

        if(n<=2){
            result = n;
        }
        else if(array[n]!=0){
            result = array[n];
        }else{
            array[n] = numTyle(n-1)+ numTyle(n-2);
            result = array[n];
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        long answer = numTyle(n)%15746;
        System.out.println(answer);
    }
}
