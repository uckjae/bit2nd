package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class Main_lee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> input = new ArrayDeque<>();
        Queue<Integer> source = new ArrayDeque<>();
        Queue<Integer> copy = new ArrayDeque<>();
        Stack<Integer> mystack = new Stack<>();
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            int temp = Integer.parseInt(br.readLine());
            input.add(temp);
            copy.add(temp);
            source.add(i);
        }
        br.close();

        int[] isable = new int[copy.size()];
        for(int j=0;j<isable.length;j++){
            isable[j] = copy.poll();
        }
        int change = 0;
        boolean ascend = (isable[0]<isable[1])?true:false;
        for(int k=0;k<isable.length-1;k++){
            if(ascend){
                if(isable[k]>isable[k+1]){
                    ascend = false;
                    change++;
                }
            }else {
                if(isable[k]<isable[k+1]){
                    ascend = true;
                    change++;
                }
            }
        }


        while(!source.isEmpty()||!mystack.isEmpty()) {
            if (mystack.isEmpty()) {
                mystack.push(source.poll());

                answer.append("+");
            }
            if (input.peek() == mystack.peek()) {
                input.poll();
                mystack.pop();
                answer.append("\n");
                answer.append("-");
            } else if (input.peek() > mystack.peek()) {
                mystack.push(source.poll());
                answer.append("\n");
                answer.append("+");
            } else {
                mystack.pop();
                answer.append("\n");
                answer.append("-");
            }
        }
        if(change>=3){
            answer.delete(0,answer.length()-1);
            answer.append("no");
        }else if(change==2&&ascend){
            answer.delete(0,answer.length()-1);
            answer.append("no");
        }


        System.out.print(answer);
    }
}
