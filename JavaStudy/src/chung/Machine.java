package chung;

import java.util.Scanner;

class Drink {
	String name;
	int price; 

	Drink(String name,int price){
		this.name= name;
		this.price=price;
	}
}
class Coke extends Drink{
	Coke() {
		super("콜라", 1600);
	}
}
class Juice extends Drink {
	Juice() {
		super("주스", 800);
	}
}
class Sprite extends Drink {
	Sprite() {
		super("스프라이트", 1000);
	}
}
class Water extends Drink {
	Water() {
		super("물",700);
	}
}

class Vending {
	Drink[] drink = {new Coke(),new Juice(), new Sprite(), new Water()};
	int money = 0;
	int charge = 0;
	
	
	void menu() {
		do {
		System.out.println("1.콜라(1600원) 2.주스(800원) 3.스프라이트(1000원) 4.물(700원) 5.종료하기");
		Scanner sc = new Scanner(System.in);
		int inputnum = Integer.parseInt((sc.nextLine())); //음료 고르기 
		if(inputnum == 5) {
			System.exit(0);			
		} else {
			System.out.println("돈을 투입해주세요");
		}
		money = Integer.parseInt((sc.nextLine())); //돈 투입
		
		
		switch (inputnum) {
		case 1:
			buy(0);
			break;
		case 2: 
			buy(1);
			break;
		case 3: 
			buy(2);
			break;
		case 4:
			buy(3);
			break;
		default : System.out.println("해당 번호가 존재하지 않습니다"); break;
		}
		System.out.println("거스름돈은" + charge + "원 입니다");
		} while (true);
	}

	void buy (int num) {		
		if(money < drink[num].price) {
			System.out.println("잔액이 부족합니다");
			charge=money;
			return;
		} else {
			charge = money - drink[num].price ; 
		}
	}

}

public class Machine {

	
}
