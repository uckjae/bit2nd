package lee;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다.
이를 계산하는 프로그램을 작성하라.

입력
첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다.
 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다.
 물론 같은 정수가 두 번 나오는 일은 없다.

출력
입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.

예제 입력 1
8
4
3
6
8
7
5
2
1
예제 출력 1
+
+
+
+
-
-
+
+
-
+
+
-
-
-
-
-
 */
public class Main_lee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Queue<Integer> input = new ArrayDeque<>();
        Stack<Integer> numbers = new Stack<>();
        Stack<Integer> mkStack = new Stack<>();
        Stack<Integer> mkarray = new Stack<>();


        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m =0;
        for(int i=0; i<n;i++){
            m = Integer.parseInt(br.readLine());
            input.add(m);
            numbers.push(n-i);
        }
        br.close();
        while (!(numbers.isEmpty()) && !(mkStack.isEmpty())) {
            int in = input.peek();
            int num = numbers.peek();
            int st = (!mkStack.isEmpty())? mkStack.peek():0;
            int arr =(!mkarray.isEmpty())? mkarray.peek():0;
            if (input.peek() == numbers.peek()) {
                input.poll();
                mkStack.push(numbers.pop());
                answer.append("+\n");
                mkarray.push(mkStack.pop());
                answer.append("-\n");
            } else if (input.peek() > numbers.peek()) {
                mkStack.push(numbers.pop());
                answer.append("+\n");
            } else if (input.peek() < numbers.peek()) {
                if (mkStack.peek() == input.peek()) {
                    input.poll();
                    mkarray.push(mkStack.pop());
                    answer.append("-\n");
                } else if (mkStack.peek() > input.peek()) {
                    mkStack.pop();
                    answer.append("-\n");
                } else {
                    answer.replace(0, answer.length() - 1, "");
                    answer.append("no");
                    break;
                }
            }
        }
        bw.write(answer.toString());
        if(!mkStack.isEmpty()){
            bw.write("\n mkStack:"+mkStack.toString());
        }else {
            bw.write("mkstack 비었음");
        }
        if(!numbers.isEmpty()){
            bw.write("\n numbers:"+numbers.toString());
        }else {
            bw.write("numbers 비었음");
        }
        if(!input.isEmpty()){
            bw.write("\n input:"+input.toString());
        }else {
            bw.write("input 비었음");
        }

        bw.write(mkarray.toString());
        bw.close();




    }
}
