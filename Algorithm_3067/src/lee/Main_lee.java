package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 �츮���� ȭ�����, Ư�� �������� 1��, 5��, 10��, 50��, 100��, 500���� �ִ�. 
 �� ������δ� ��� ������ �ݾ��� ���� �� ������ �� ����� ���� ������ ���� �� �ִ�. 
 ���� ��� 30���� ����� ���ؼ��� 1��¥�� 30�� �Ǵ� 10��¥�� 2���� 5��¥�� 2�� ���� ����� �����ϴ�.

������ ������ �־��� ���� �־��� �ݾ��� ����� ��� ����� ���� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����. 
�� �׽�Ʈ ���̽��� ù ��° �ٿ��� ������ ���� �� N(1 �� N �� 20)�� �־����� �� ��° �ٿ��� N ���� ������ �� �ݾ��� ������������ ���ĵǾ� �־�����. 
�� �ݾ��� �����μ� 1������ 10000������ ���� �� ������ �������� ���еȴ�. �� ��° �ٿ��� �־��� N���� �������� ������ �� �ݾ� M(1 �� M �� 10000)�� �־�����.

���Ǹ� ���� ����� ���� 231 - 1 ���� �۴ٰ� �����ص� �ȴ�.

���
�� �׽�Ʈ ���̽��� ���� �Է����� �־����� N���� �������� �ݾ� M�� ����� ��� ����� ���� �� �ٿ� �ϳ��� ����Ѵ�.

3
2
1 2
1000
3
1 5 10
100
2
5 7
22
 */
public class Main_lee {
	public void counting(int[] coins,int index,int numOfCacul,int howMuch) {
		int[] numOfCoins = new int[coins.length];
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());// �׽�Ʈ ����
		int n = Integer.parseInt(br.readLine());// ������ ������
		int[] coins = new int[n];
		int[] numOfCoins = new int[n];
		String muchOfCoins = br.readLine().replace(" ", "");
		for (int i = 0; i < muchOfCoins.length(); i++) {
			coins[i] = Character.getNumericValue(muchOfCoins.charAt(i));
		}

		int howMuch = Integer.parseInt(br.readLine());
		int numOfCacul = 0;

		numOfCoins[n - 1] = howMuch / coins[n - 1];
		while(!(howMuch==0)) {
			howMuch -= numOfCoins[n-1]*coins[n-1];
			if(howMuch==0) {
				numOfCacul++;
			}else {
				numOfCoins[n-2] = howMuch/coins[n-1]; 
			}
		}

	}
}
