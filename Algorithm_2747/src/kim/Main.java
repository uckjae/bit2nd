package kim;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for(int i=0;i<num; i++) { // 입력한 숫자만큼 반복 작업
			
			sum = a+b; //a + b를 sum에 넣고 
			b = a; //a에 있는 값을 b로 넘기고 
			a = sum; //sum에 있는 값을 a로 넘긴다.
			
		}
		System.out.print(sum);
	}

}
