package choi;
import java.util.Scanner;

public class Algorithm_CKY {

	public static void main(String[] args) {
		//최대공약수,최소공배수
				//위 방법은 유클리드 호제법을 사용했다.
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�1:");
		int x =sc.nextInt();
		System.out.println("�Է�2:");
		int y=sc.nextInt();
		int high;
		int low;
		int mod=1;
		int l=0;
		
		
		if(x>y) {
			high=x; low=y;
		}else {            //변수를 설정해서 낮은수, 높은수를 변경해 계산을 할 수 있게 해준다.
			low=x; high=y;
		}
		while(mod>0) {
			mod=high%low;
			high=low;
			low=mod;
		}System.out.println("�ִ�����:"+high); //최대공약수
		 l=(x*y)/high; 
		 System.out.println("�ּҰ����"+l); //최소공배수
	}

}
