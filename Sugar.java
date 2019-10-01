/*
상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오. 
*/
import java.util.Scanner;

public class Sugar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt();
		int sugar5kg = 5;
		int sugar3kg = 3;
		int deli = 0;
		int very = 0;
		if(sugar % sugar5kg == 0) {
			System.out.println("첫번째 if");
			deli = sugar / sugar5kg;
			return;
		}else {
			System.out.println("첫번째 if의 else");
			int quotient = sugar / sugar5kg;
			for(int i = quotient; i > 0; i--) {
				System.out.println("for : " + i);
				int rest = sugar - (i * 5);
				if(rest % sugar3kg == 0) {
					System.out.println("for 안에 if");
					int j = rest / sugar3kg;
					deli = i + j;
					return;
				}
			}System.out.println("for문 끝나고");
		}System.out.println("첫번째 if 끝나고");
		if(sugar % sugar3kg == 0) {
			System.out.println("두번째 if");
			very = sugar / sugar3kg;
			return;
		}else {
			System.out.println("두번째 if");
			very = -1;
		}
		System.out.println("최소값 : " + (deli + very));
		System.out.println("대체 어디서 안되는거야?");
	}
}