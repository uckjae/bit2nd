package lee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> input = new Queue();
        Stack<Integer> result = new Stack<>();
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m =0;
        for(int i=0; i<n;i++){
            m = Integer.parseInt(br.readLine());
            input.add(m);
        }

        int target = input.poll();
        for(int i=1;i<=target;i++){
            result.push(i);
            answer.append("+\n");
        }
        answer.append("-\n");
        target = input.poll();
        if(target<result.peek()){
            while(target!=result.peek()){
                result.pop();
                answer.appen
            }
        }

    }
}
