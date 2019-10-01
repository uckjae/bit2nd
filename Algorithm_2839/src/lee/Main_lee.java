package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_lee {
	public static int minimumBag(int n) {
		int result = 0;
		if(n<3) {
			return -1;
		}
		
		int remain = n;
		int five = n/5;
		int three = 0;
		
		remain -=five*5;
		three = remain/3;
		remain -= three*3;
		result = three+five;
		
		while(!(remain==0)) {
			remain = n;
			five -=1;
			remain-=five*5;
			three = remain/3;
			remain-=three*3;
			result = five+three;
			if(five<0) {
				result =-1;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		
		System.out.println(minimumBag(n));
	}
	
}
