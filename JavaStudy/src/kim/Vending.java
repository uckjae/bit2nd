package kim;

import java.util.Scanner;



public class Vending { //자판기
	product coke = new product("코카콜라", 1500, 30);
	product cider = new product("칠성 사이다", 1300, 30);
	product power = new product("파워 에이디", 1000, 30);
	Scanner sc = new Scanner(System.in);
	int money;
	int outmoney;
	int total;
	
	
	public void list1() { // 콜라보다 높은가격 일때
		System.out.println("음료수를 골라 주세요.");
		System.out.println("1.코카콜라     : $" + coke.price +"원"+ " / 수량 : " +coke.count );
		System.out.println("2.칠성 사이다 : $" + cider.price +"원"+ " / 수량 : " +cider.count);
		System.out.println("3.파워 에이드 : $" + power.price +"원"+ " / 수량 : " +power.count);		
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

	public void list2() { // 콜라보다 낮고 사이다보다 높을때
		System.out.println("음료수를 골라 주세요.");
		System.out.println("1.칠성 사이다 : $" + cider.price +"원"+ " / 수량 : " +cider.count);
		System.out.println("2.파워 에이드 : $" + power.price +"원"+ " / 수량 : " +power.count);
		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1:
			ciderbuy();
			break;
		case 2:
			powerbuy();
			break;
		default:
			System.out.println("없는것을 고르셨습니다.");
			System.out.println();
			break;
		}
	}

	public void list3() { // 사이다 보다 낮을 때
		System.out.println("음료수를 골라 주세요.");
		System.out.println("1.파워 에이드 : $" + power.price +"원"+ " / 수량 : " +power.count);
		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1:
			powerbuy();
			break;
		default:
			System.out.println("없는것을 고르셨습니다.");
			System.out.println();
			break;
		}
	}

	public void list() { //메뉴구성 
		System.out.println("1.코카콜라     : $" + coke.price +"원"+ " / 수량 : " +coke.count );
		System.out.println("2.칠성 사이다 : $" + cider.price +"원"+ " / 수량 : " +cider.count );
		System.out.println("3.파워 에이드 : $" + power.price +"원"+ " / 수량 : " +power.count );
		System.out.println("★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("52. 자판기 이용");
		System.out.println("77. 관리자 모드");
		System.out.println("0. 구매 취소");
	}

	public void Start() { //자판기 사용 함수 
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

	public void Buy() { //자판기 이용 함수 
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
		
	}

	public void cokebuy() { //콜라 구매 함수 
		System.out.println("몇개 구입하시겠습니까?");
		int amount =  Integer.parseInt(sc.nextLine());
		if (coke.count >= 0 && this.money >= coke.price) {				
			if(this.money >= coke.price * amount && amount <= coke.count) {
				System.out.println(amount + "개 " + "콜라가 나왔습니다.");
				System.out.println();	
				this.money -= coke.price * amount;
				total += coke.price * amount;
				coke.count-= amount;
				System.out.println("남은 돈 : $ " + this.money + "원");
				addQ();
			}else {
				System.out.println("돈이 적거나 음료수 수량이 부족합니다");
				list();
			}
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1: addBuy();
					break;
			case 2: outmoney = money;
					System.out.println("잔돈 : $ " + outmoney + "원");
					System.out.println();	
					System.exit(0);
			case 3: list();
					break;
			}
		} else {
			System.out.println("재고가 떨어졌습니다.");
			outmoney = money;
			System.out.println("그대로 돈이 "+outmoney + "원 나왔습니다.");
			System.out.println();
		}
	}

	public void ciderbuy() { //사이다 구매 함수 
		System.out.println("몇개 구입하시겠습니까?");
		int amount = Integer.parseInt(sc.nextLine());
		if (cider.count > 0 && this.money >= cider.price) {
			if(this.money >= cider.price * amount && amount <= cider.count) {
				System.out.println(amount + "개 " + "사이다가 나왔습니다.");
				System.out.println();	
				this.money -= cider.price * amount;
				total += cider.price * amount;
				cider.count-= amount;
				System.out.println("남은 돈 : $ " + this.money + "원");
				addQ();
			}else {
				System.out.println("돈이 적거나 음료수 수량이 부족합니다");
				list();
			}
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1: addBuy();
					break;
			case 2: outmoney = money;
					System.out.println("잔돈 : $ " + outmoney + "원");
					System.out.println();	
					System.exit(0);
			case 3: list();
					break;
			}
			
		} else {
			System.out.println("재고가 떨어졌습니다.");
			outmoney = money;
			System.out.println("그대로 돈이 "+outmoney + "원 나왔습니다.");
			System.out.println();
		}
	}

	public void powerbuy() { //파워에이드 구매 함수 
		System.out.println("몇개 구입하시겠습니까?");
		int amount = Integer.parseInt(sc.nextLine());
		if (cider.count > 0 && this.money >= cider.price) {
			if(this.money >= power.price * amount && amount <= power.count) {
				System.out.println(amount + "개 " + "파워에이드가 나왔습니다.");
				System.out.println();	
				this.money -= power.price * amount;
				total += power.price * amount;
				power.count-= amount;
				System.out.println("남은 돈 : $ " + this.money + "원");
				addQ();
			}else {
				System.out.println("돈이 적거나 음료수 수량이 부족합니다");
				list();
			}
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1: addBuy();
					break;
			case 2: outmoney = money;
					System.out.println("잔돈 : $ " + outmoney + "원");
					System.out.println();	
					System.exit(0);
			case 3: list();
					break;
			}
		} else {
			System.out.println("재고가 떨어졌습니다.");
			outmoney = money;
			System.out.println("그대로 돈이 "+outmoney + "원 나왔습니다.");
			System.out.println();
		}
	}

	public void admin() { //관리자 메뉴 
		System.out.println("비밀번호 입력");
		String pass = sc.nextLine();
		do {
			if (pass.equals("qwer")) {
				System.out.println("1. 재고확인");
				System.out.println("2. 재고추가");
				System.out.println("3. 재고빼기");
				System.out.println("4. 총 매출 확인");
				System.out.println("5. 메뉴로 이동");
				int choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1: countsee();
						break;
				case 2: add();
						break;
				case 3: minus();
						break;
				case 4: sales();
						break;
				case 5: Start();
						break;
				default : System.out.println("없는것을 고르셨습니다.");		
				}
			} else {
				System.out.println("비밀번호 틀렸습니다.");
				admin();
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

	public void countsee() { //재고 확인 함수 
		System.out.println("코카콜라 : " + coke.count + "개");
		System.out.println("칠성 사이다 : " + cider.count + "개");
		System.out.println("파워 에이드 : " + power.count + "개");
	}

	public void add() { //재고 추가 함수 
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
	
	public void minus() {
		int amount;
		System.out.println("빼실 음료수를 선택하세요.");
		System.out.println("1. 코카콜라 / " + "수량 : " + coke.count);
		System.out.println("2. 칠성 사이다  / " + "수량 : " + cider.count);
		System.out.println("3. 파워 에이드 / " + "수량 : " + power.count);
		System.out.println("0. 목록가기");
		
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1 : System.out.println("몇개 빼시겠습니까?");
				amount = Integer.parseInt(sc.nextLine());
				if(coke.count >= amount) {
					coke.count -= amount;
					minus();
				}else {
					System.out.println("수량보다 많이 빼셨습니다.");
					minus();
				}
				break;
		case 2 : System.out.println("몇개 빼시겠습니까?");
				amount = Integer.parseInt(sc.nextLine());
				if(cider.count >= amount) {
					cider.count -= amount;
					minus();
				}else {
					System.out.println("수량보다 많이 빼셨습니다.");
					minus();
				}
				break;
		case 3 : System.out.println("몇개 빼시겠습니까?");
					amount = Integer.parseInt(sc.nextLine());
					if(cider.count >= amount) {
						cider.count -= amount;
						minus();
					}else {
						System.out.println("수량보다 많이 빼셨습니다.");
						minus();
					}
					break;
		case 0 : admin();
				 break;
		default : System.out.println("없는것을 고르셨습니다.");
					break;
		}
	}
	
	public void addQ() {
		System.out.println("더 구매 하시겠습니까?");
		System.out.println("1. 추가 구매");
		System.out.println("2. 구매 취소");
		System.out.println("3. 메뉴로 이동");
	}
	
	public void sales() {
		System.out.println("총 매출 확인 : $ " + total + "원");
		
		System.out.println("0.목록가기");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		case 0: admin();
				break;
		default: System.out.println("없는 메뉴 입니다.");
				break;
		
		}
		
	}
	
	public void addBuy() {
		if(this.money < power.price) {
			System.out.println("돈을 더 넣어주세요.");
			money += Integer.parseInt(sc.nextLine());
			if (this.money >= 1500) {
				list1();
			} else if (this.money >= 1300) {
				list2();
			} else if (this.money >= 1000) {
				list3();
			} else if(this.money < 900){
				System.out.println("살 수 있는 음료수가 없습니다.");
				System.out.println();
				list();
			}else {
				if (this.money >= coke.price) {
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
			}
				
			
		
		
	}
	}
	public static void main(String[] args) {

		Vending v = new Vending();

		v.Start();

	}
}
