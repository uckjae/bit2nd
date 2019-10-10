package lee;

import java.io.*;


public class Main_lee2 {
    public static int mkFibo(int n ){
        int beforebefore=0;
        int before=1;
        int next = 0;
        if(n==1)next = before;
        for(int i=1; i<=n-1; i++){
            next= before + beforebefore;
            beforebefore = before;
            before = next;
        }
        return next;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(mkFibo(n)));
        br.close();
        bw.close();
    }
}