package kim;

import java.util.Scanner;



public class Vending {
	product coke = new product("코카콜라", 1500, 1);
	product cider = new product("칠성 사이다", 1300, 30);
	product power = new product("파워 에이디", 1000, 30);
	Scanner sc = new Scanner(System.in);
	int money;
	int outmoney;

	public void list1() { // 콜라보다 높은가격 일때
		System.out.println("1.코카콜라     : $" + coke.price);
		System.out.println("2.칠성 사이다 : $" + cider.price);
		System.out.println("3.파워 에이드 : $" + power.price);
	}

	public void list2() { // 콜라보다 낮고 사이다보다 높을때
		System.out.println("2.칠성 사이다 : $" + cider.price);
		System.out.println("3.파워 에이드 : $" + power.price);
	}

	public void list3() { // 사이다 보다 낮을 때
		System.out.println("3.파워 에이드 : $" + power.price);
	}

	public void list() {
		System.out.println("1.코카콜라     : $" + coke.price);
		System.out.println("2.칠성 사이다 : $" + cider.price);
		System.out.println("3.파워 에이드 : $" + power.price);
		System.out.println("★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("52. 자판기 이용");
		System.out.println("77. 관리자 모드");
		System.out.println("0. 구매 취소");
	}

	public void Start() {
		do {
			list();
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 52:
				Buy();
				break;
			case 77:
				admin();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("없는것을 고르셨습니다.");
				break;
			}
		} while (true);
	}

	public void Buy() {
		System.out.println("돈을 넣어주세요.");
		this.money = Integer.parseInt(sc.nextLine());
		if (this.money >= 1500) {
			list1();
		} else if (this.money >= 1300) {
			list2();
		} else if (this.money >= 1000) {
			list3();
		} else {
			System.out.println("살 수 있는 음료수가 없습니다.");
			System.out.println();
			list();
		}
		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1:
			cokebuy();
			break;
		case 2:
			ciderbuy();
			break;
		case 3:
			powerbuy();
			break;
		default:
			System.out.println("없는것을 고르셨습니다.");
			System.out.println();
			break;
		}
	}

	public void cokebuy() {
		if (coke.count > 0) {
			System.out.println("콜라가 나왔습니다.");
			System.out.println();
			this.money -= coke.price;
			coke.count--;
			outmoney = money;
			System.out.println(outmoney + "원");
			System.out.println();
		} else {
			System.out.println("재고가 떨어졌습니다.");
			outmoney = money;
			System.out.println("그대로 돈이 "+outmoney + "원 나왔습니다.");
			System.out.println();
		}
	}

	public void ciderbuy() {
		if (cider.count > 0) {
			System.out.println("사이다가 나왔습니다.");
			System.out.println();
			this.money -= cider.price;
			cider.count--;
			outmoney = money;
			System.out.println(outmoney + "원");
			System.out.println();
		} else {
			System.out.println("재고가 떨어졌습니다.");
			outmoney = money;
			System.out.println("그대로 돈이 "+outmoney + "원 나왔습니다.");
			System.out.println();
		}
	}

	public void powerbuy() {
		if (power.count > 0) {
			System.out.println("파워에이드가 나왔습니다.");
			this.money -= power.price;
			power.count--;
			outmoney = money;
			System.out.println(outmoney + "원");
		} else {
			System.out.println("재고가 떨어졌습니다.");
			outmoney = money;
			System.out.println("그대로 돈이 "+outmoney + "원 나왔습니다.");
			System.out.println();
		}
	}

	public void admin() {
		System.out.println("비밀번호 입력");
		String pass = sc.nextLine();
		do {
			if (pass.equals("qwer")) {
				System.out.println("1. 재고확인");
				System.out.println("2. 재고추가");
				System.out.println("3. 메뉴로 이동");
				int choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1: countsee();
						break;
				case 2: add();
						break;
				case 3: Start();
						break;
				default : System.out.println("없는것을 고르셨습니다.");		
				}
			} else {
				System.out.println("비밀번호 틀렸습니다.");
			}
		} while (true);

	}
	/*
	 * 무한루프 문제 public void adminmenu() { int choice =
	 * Integer.parseInt(sc.nextLine());
	 * 
	 * 
	 * do { System.out.println("1. 재고확인"); System.out.println("2. 재고추가");
	 * System.out.println("3. 메뉴로 이동"); switch(choice) { case 1: countsee(); break;
	 * case 2: add(); break; case 3: Start(); break; default :
	 * System.out.println("없는것을 고르셨습니다."); break; } }while(true); }
	 */

	public void countsee() {
		System.out.println("코카콜라 : " + coke.count + "개");
		System.out.println("칠성 사이다 : " + cider.count + "개");
		System.out.println("파워 에이드 : " + power.count + "개");
	}

	public void add() {
		int amount;
		System.out.println("넣으실 음료수를 선택하세요.");
		System.out.println("1. 코카콜라");
		System.out.println("2. 칠성 사이다");
		System.out.println("3. 파워 에이드");
		
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1 : System.out.println("몇개 넣으시겠습니까?");
			amount = Integer.parseInt(sc.nextLine());
			coke.count += amount;
			break;
		case 2 : System.out.println("몇개 넣으시겠습니까?");
				amount = Integer.parseInt(sc.nextLine());
				cider.count += amount;
				break;
		case 3 : System.out.println("몇개 넣으시겠습니까?");
					amount = Integer.parseInt(sc.nextLine());
					power.count += amount;
					break;
		default : System.out.println("없는것을 고르셨습니다.");
					break;
		}
		
	}

	public static void main(String[] args) {

		Vending v = new Vending();

		v.Start();

	}
}
