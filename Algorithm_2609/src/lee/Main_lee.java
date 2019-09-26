package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main_lee {
	
	public static void commonFandM(int a, int b) {
		ArrayList<Integer> decimal = new ArrayList<Integer>();//소수를 담을 ArrayList
		int big = (a>b)?a:b; //입력된 두 수중 큰수 
		decimal.add(2);
		for(int i = 3; i<big; i++) {//큰 수 까지 있는 소수를 구하여 ArrayList에 add
			for(int j=2; j<i; j++) {
				if(j!=i-1 && i%j==0) {
					break;
				}else if(j==i-1 && i%j!=0) {
					decimal.add(i);
					break;
				}
			}
		}
		int max = 1;//최대공약수
		int min = 1;//최소공배수
		int n = a;
		int m = b;
		boolean end = false;
		int i = 0;
		while(!end) {
			if(n%decimal.get(i)==0 && m%decimal.get(i)==0 ) {// a b 의 공통 소인수라면
				max*=decimal.get(i);//최대공약수는 공통 소인수의 곱
				n/=decimal.get(i);//소인수분해
				m/=decimal.get(i);
				continue;
			}else if(n<=decimal.get(i) || m<=decimal.get(i)){//소수의 크기보다 나눠질 수의 값이 작다면 소인수분해 stop
				end = true;//stop
				min = max*n*m;//최소공배수=최대공약수*공통소인수
				continue;
			}else {
				i++;//공통소인수가 아니라면 다음 소수로 확인
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
