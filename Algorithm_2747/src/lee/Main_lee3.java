package lee;

import java.io.*;


public class Main_lee3 {

    public static int Fibo(int n){
        if(n<=1) return n;
        return Fibo(n-1) + Fibo(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(Fibo(n)));
        br.close();
        bw.close();
    }
}
