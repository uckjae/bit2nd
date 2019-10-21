package lee;

import java.io.*;
import java.util.Stack;

/*

����

������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� �ټ� �����̴�.

    push X: ���� X�� ���ÿ� �ִ� �����̴�.
    pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
    size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
    empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
    top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

�Է�

ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
���

����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
���� �Է� 1

14      2
push 1  2
push 2  0
top     2
size    1
empty   1
pop     -1
pop     0
pop     1
size    -1
empty   0
pop 3
push 3
empty
top


 */
public class Main_lee {
    public static Stack<Integer> mystack = new Stack();
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void stack(String method) throws IOException {
        int input = 0;
        if(method.split(" ").length==2){
            input = Integer.parseInt(method.split(" ")[1]);
            method = method.split(" ")[0];
        }

        if(method.equals("push")){
            mystack.push(input);
        }else if(method.equals("pop")){
            if(!mystack.isEmpty()){
                //System.out.println(mystack.pop());
                bw.write(mystack.pop()+"\n");
            }else{
                //System.out.println(-1);
                bw.write(-1+"\n");
            }
        }else if(method.equals("size")){
            //System.out.println(mystack.size());
            bw.write(mystack.size()+"\n");
        }else if(method.equals("empty")){
            int bool =(mystack.isEmpty())?1:0;
            //System.out.println(bool);
            bw.write(bool+"\n");
        }else if(method.equals("top")){
            if(!mystack.isEmpty()){
                //System.out.println(mystack.peek());
                bw.write(mystack.peek()+"\n");
            }else{
                //System.out.println(-1);
                bw.write(-1+"\n");
            }
        }
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n;i++){
            String method = br.readLine();
            stack(method);

        }
        bw.close();
        br.close();
    }
}
