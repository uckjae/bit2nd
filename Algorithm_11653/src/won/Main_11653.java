package won;
import java.util.Scanner;

public class Main_11653 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int p = 2; // 나눌 수
		
		while(number >= p) { // 입력한 숫자가 1이 아닐때
			if(number % p == 0) { // 나머지가 0이면 
				System.out.println(p);
				number /= p; // 몫을 number에 담아서 반복
				p--; // 2로 다시 나누어질 수 있으니 p--
			}
			p++; // p를 2로 안나누어지면 p++ >> 
		}
	}
}
