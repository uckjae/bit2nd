package lee;

import java.io.*;


public class Main_lee2 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void Factorization(int n) throws IOException {
        int prime = 2;
        while(!(n==1)){
            if(n%prime==0){
                bw.write(Integer.toString(prime));
                bw.newLine();
                n/=prime;
                prime--;
            }
            prime++;
        }
    bw.close();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Factorization(n);
        br.close();
    }
}
