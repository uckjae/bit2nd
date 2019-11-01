package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] result = new int[1000000];

    public static int mkOne(int n){
        int num = 0;
        if(n==1){
            num = result[n];
        }else if(n<=3){
            result[n] = 1;
            num = result[n];
        }else if(result[n]!=0){
            num = result[n];
        }else{
            if(n%2==0 && n%3==0){
                if(mkOne(n-1)<=mkOne(n/2) && mkOne(n-1)<=mkOne(n/3)){
                    result[n] = mkOne(n-1)+1;
                }else if(mkOne(n/2)<=mkOne(n-1)&&mkOne(n/2)<=mkOne(n/3)){
                    result[n] = mkOne(n/2)+1;
                }else {
                    result[n] = mkOne(n/3)+1;
                }
            }else if(n%2==0){
                result[n]=(mkOne(n-1)<mkOne(n/2))?result[n-1]+1:result[n/2]+1;
            }else if(n%3==0){
                result[n]=(mkOne(n-1)<mkOne(n/3))?result[n-1]+1:result[n/3]+1;
            }else{
                result[n] = mkOne(n-1)+1;
            }
            num = result[n];
        }
        return num;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = mkOne(n);
        System.out.println(answer);
        br.close();
    }
}
