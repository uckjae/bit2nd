package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main_lee {
	
	public static void commonFandM(int a, int b) {
		ArrayList<Integer> decimal = new ArrayList<Integer>();//�Ҽ��� ���� ArrayList
		int big = (a>b)?a:b; //�Էµ� �� ���� ū�� 
		decimal.add(2);
		for(int i = 3; i<big; i++) {//ū �� ���� �ִ� �Ҽ��� ���Ͽ� ArrayList�� add
			for(int j=2; j<i; j++) {
				if(j!=i-1 && i%j==0) {
					break;
				}else if(j==i-1 && i%j!=0) {
					decimal.add(i);
					break;
				}
			}
		}
		int max = 1;//�ִ�����
		int min = 1;//�ּҰ����
		int n = a;
		int m = b;
		boolean end = false;
		int i = 0;
		while(!end) {
			if(n%decimal.get(i)==0 && m%decimal.get(i)==0 ) {// a b �� ���� ���μ����
				max*=decimal.get(i);//�ִ������� ���� ���μ��� ��
				n/=decimal.get(i);//���μ�����
				m/=decimal.get(i);
				continue;
			}else if(n<=decimal.get(i) || m<=decimal.get(i)){//�Ҽ��� ũ�⺸�� ������ ���� ���� �۴ٸ� ���μ����� stop
				end = true;//stop
				min = max*n*m;//�ּҰ����=�ִ�����*������μ�
				continue;
			}else {
				i++;//������μ��� �ƴ϶�� ���� �Ҽ��� Ȯ��
			}
		}
		
		
		
		System.out.println(max + "\n" + min);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		int a = Integer.parseInt(s.split(" ")[0]);
		int b = Integer.parseInt(s.split(" ")[1]);
		commonFandM(a, b);
		br.close();
	}
}
