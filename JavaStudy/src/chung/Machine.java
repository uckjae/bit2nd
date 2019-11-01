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

class Vending {
	Drink[] drink = {new Drink("콜라",1600),new Drink("주스",800),new Drink("스프라이트",1000),new Drink("물",700)};
	
	void menu() {
		do {
		System.out.println("1.콜라(1600원) 2.주스(800원) 3.스프라이트(1000원) 4.물(700원)");
		Scanner sc = new Scanner(System.in);
		int inputnum = Integer.parseInt((sc.nextLine())); //음료 고르기 
		System.out.println("돈을 투입해주세요"); //
		int money = Integer.parseInt((sc.nextLine())); //돈 투입
		int charge = 0;
		
		switch (inputnum) {
		case 1:
			if(money < drink[0].price) {
				System.out.println("잔액이 부족합니다");
				return;
			} else {
				charge = money - drink[0].price ; break;
			}			
		case 2: if(money < drink[1].price) {
			System.out.println("잔액이 부족합니다");
			return;
		} else {
			charge = money - drink[1].price ; break;
		}
		case 3: if(money < drink[2].price) {
			System.out.println("잔액이 부족합니다");
			return;
		} else {
			charge = money - drink[2].price ; break;
		}
		case 4: if(money < drink[3].price) {
			System.out.println("잔액이 부족합니다");
			return;
		} else {
			charge = money - drink[3].price ; break;
		}
		default : System.out.println("해당 번호가 존재하지 않습니다"); break;
		}
		System.out.println("거스름돈은" + charge + "원 입니다");
		} while (true);
	}

	
}
public class Machine {

}
