package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_lee_9506 {

    public static String PerfectNum(int n){
        int index = 1;
        int sum = 0;
        boolean isStarted = false;
        StringBuilder answer = new StringBuilder();
        answer.append(n);
        while(index!=n){
            if(n%index==0){
                if(!isStarted){
                    isStarted=true;
                    answer.append(" = ");
                }else{
                    answer.append(" + ");
                }
                sum+=index;
                answer.append(index);
            }
            index++;
        }
        if(!isStarted||n!=sum){
            answer.delete(String.valueOf(n).length(),answer.length());
            answer.append(" is NOT perfect.");
        }
        return answer.toString();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> input = new ArrayList<>();
        int n=0;
        do{
            input.add(n);
            n = Integer.parseInt(br.readLine());
        }while(n!=-1);
        br.close();
        for(int i = 1; i<input.size();i++){
            System.out.println(PerfectNum(input.get(i)));
        }


    }
}
