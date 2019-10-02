package choi;
import java.util.Scanner;
public class Al2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//int y=n/5;
		int num=0;
		while(true) {
			if(n%5==0) {
			  System.out.println(n/5+num);
			  break;
			}else if(n<=0){
				System.out.println("-1");
				break;
			}
			n=n-3;
			num=num+1;
		}

	}

}
