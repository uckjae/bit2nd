package lee;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
���� (stack)�� �⺻���� �ڷᱸ�� �� �ϳ���, ��ǻ�� ���α׷��� �ۼ��� �� ���� �̿�Ǵ� �����̴�.
������ �ڷḦ �ִ� (push) �Ա��� �ڷḦ �̴� (pop) �Ա��� ���� ���� ���߿� �� �ڷᰡ ���� ���� ������ (LIFO, Last in First out) Ư���� ������ �ִ�.
1���� n������ ���� ���ÿ� �־��ٰ� �̾� �þ�������ν�, �ϳ��� ������ ���� �� �ִ�.
�̶�, ���ÿ� push�ϴ� ������ �ݵ�� ���������� ��Ű���� �Ѵٰ� ����.
������ ������ �־����� �� ������ �̿��� �� ������ ���� �� �ִ��� ������, �ִٸ� � ������ push�� pop ������ �����ؾ� �ϴ����� �˾Ƴ� �� �ִ�.
�̸� ����ϴ� ���α׷��� �ۼ��϶�.

�Է�
ù �ٿ� n (1 �� n �� 100,000)�� �־�����.
 ��° �ٺ��� n���� �ٿ��� ������ �̷�� 1�̻� n������ ������ �ϳ��� ������� �־�����.
 ���� ���� ������ �� �� ������ ���� ����.

���
�Էµ� ������ ����� ���� �ʿ��� ������ �� �ٿ� �� ���� ����Ѵ�. push������ +��, pop ������ -�� ǥ���ϵ��� �Ѵ�. �Ұ����� ��� NO�� ����Ѵ�.

���� �Է� 1
8
4
3
6
8
7
5
2
1
���� ��� 1
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
            bw.write("mkstack �����");
        }
        if(!numbers.isEmpty()){
            bw.write("\n numbers:"+numbers.toString());
        }else {
            bw.write("numbers �����");
        }
        if(!input.isEmpty()){
            bw.write("\n input:"+input.toString());
        }else {
            bw.write("input �����");
        }

        bw.write(mkarray.toString());
        bw.close();




    }
}
