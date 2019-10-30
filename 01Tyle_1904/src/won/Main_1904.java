package won;
import java.util.Scanner;

/*
1	1

2	00	11

3	100	001	111

4	0011	0000	1001	1100	1111

5	00100	10000	11100	00111	00001	10011	11001	11111

6	001100	000000	100100	110000	111100	
	001001	100001	111001	001111	000011	100111	110011	111111
	
1.1
2.2
3.3
4.5
5.8
6.13
*/
public class Main_1904 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tileNum = scan.nextInt(); // 2
		int[] tileCase;
		if(tileNum == 1) {
			tileCase = new int[tileNum+2]; // [2+1] ..3
		}else {
			tileCase = new int[tileNum+1]; // [2+1] ..3
		}
		tileCase[0] = 0; 
		tileCase[1] = 1; 
		tileCase[2] = 2;
		
		for(int i = 3; i <= tileNum; i++) { // 2
			tileCase[i] = tileCase[i-2] + tileCase[i-1]; // 3번방 = 1 + 2 = 3 ,, 4번방 = 3 + 2 = 5
			//tileCase[tileNum] %= 15746;	
		}
		tileCase[tileNum] %= 15746;
		System.out.println(tileCase[tileNum]);
	}
	
}
