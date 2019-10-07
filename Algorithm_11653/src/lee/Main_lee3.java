package lee;

import java.io.*;


public class Main_lee3 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(sc.readLine());
        int prime = 2;
        StringBuilder answer = new StringBuilder();
        while(!(n==1)){
            if(n%prime==0){
                answer.append(prime);
                answer.append("\n");
            	n/=prime;
                continue;
            }
            prime++;
        }
        System.out.println(answer);
        sc.close();
        bw.close();
    
    }

}
