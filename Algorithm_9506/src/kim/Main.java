package kim;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		String input = null; //문자를 받을곳 
		ArrayList<Integer> arr = new ArrayList<Integer>(); //리스트 생성 
		
		if(!(input.equals("-1"))) { //input에 들어간 것이 -1이 아니면 
			for(int i=0;i<arr.size();i++) { //arr 리스트를 돌아서
				arr.add(Integer.parseInt(input)); //리스트에 숫자타입으로 저장
			}
		}
		StringBuilder sb = new StringBuilder(); //변경 가능하고 동기화를 하지않는 char[] 객체
		for(Integer arrs : arr) { // 개선된 for문으로 저장한 리스트를 확인하며
		int save=0;
			String etc = ""; //공백을 넣고 
			for(int i=1;i<arrs;i++) { //완전수를 인지 확인하기위해 1 부터 약수를 확인하고
			if(arrs % i == 0) { //나머지가 0이고 약수가 맞으면 
				etc += i + " + "; //etc 문자열에 저장
					save +=i; //약수의 합을 저장
				if (save > arrs)  //합이 리스트 숫자보다 크면 
					break; //멈춘다.
			}
			
			
		}
		if(save == arrs) { //합과 리스트에 있는 숫자와 같으면 
			sb.append(String.format("%d = %s", arrs,etc.substring(0,etc.length()-3)));
			//StringBuilder에 지정된 위치에 값을 대입해서 문자열을 만든다. etc의 문자열 길이부터 문자열 길이에서 -3번째까지
		}else { //합과 리스트에 숫자가 같지 않으면  
			sb.append(String.format("%d is NOT perfect.", arrs));
			//문자열을 출력 
		}
		}
	}

	}

