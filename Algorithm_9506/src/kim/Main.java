package kim;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		String input = null; //���ڸ� ������ 
		ArrayList<Integer> arr = new ArrayList<Integer>(); //����Ʈ ���� 
		
		if(!(input.equals("-1"))) { //input�� �� ���� -1�� �ƴϸ� 
			for(int i=0;i<arr.size();i++) { //arr ����Ʈ�� ���Ƽ�
				arr.add(Integer.parseInt(input)); //����Ʈ�� ����Ÿ������ ����
			}
		}
		StringBuilder sb = new StringBuilder(); //���� �����ϰ� ����ȭ�� �����ʴ� char[] ��ü
		for(Integer arrs : arr) { // ������ for������ ������ ����Ʈ�� Ȯ���ϸ�
		int save=0;
			String etc = ""; //������ �ְ� 
			for(int i=1;i<arrs;i++) { //�������� ���� Ȯ���ϱ����� 1 ���� ����� Ȯ���ϰ�
			if(arrs % i == 0) { //�������� 0�̰� ����� ������ 
				etc += i + " + "; //etc ���ڿ��� ����
					save +=i; //����� ���� ����
				if (save > arrs)  //���� ����Ʈ ���ں��� ũ�� 
					break; //�����.
			}
			
			
		}
		if(save == arrs) { //�հ� ����Ʈ�� �ִ� ���ڿ� ������ 
			sb.append(String.format("%d = %s", arrs,etc.substring(0,etc.length()-3)));
			//StringBuilder�� ������ ��ġ�� ���� �����ؼ� ���ڿ��� �����. etc�� ���ڿ� ���̺��� ���ڿ� ���̿��� -3��°����
		}else { //�հ� ����Ʈ�� ���ڰ� ���� ������  
			sb.append(String.format("%d is NOT perfect.", arrs));
			//���ڿ��� ��� 
		}
		}
	}

	}

