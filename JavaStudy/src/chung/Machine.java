package chung;

import java.util.Scanner;

class Product {
	String name;
	int price; 
	//coke coke = new coke();
	Product(){}
	Product(String name,int price){
		
	}
}
class coke extends Product{
	coke() {
		super("콜라", 1600);
	}
	
}
class juice extends Product{
	juice() {
		super("주스", 800);
	}
}
class sprite extends Product{
	sprite() {
		super("스프라이트", 1000);
	}	
}
class water extends Product{
	water() {
		super("물", 700);
	}	
}
class vending {
	void menu(Product p) {
		System.out.println("1.콜라(1600원) 2.주스(800원) 3.스프라이트(1000원) 4.물(700원)");
		Scanner sc = new Scanner(System.in);
		int inputnum = Integer.parseInt((sc.nextLine())); //음료 고르기 
		System.out.println("돈을 투입해주세요"); //
		int money = Integer.parseInt((sc.nextLine())); //돈 투입
		int charge = 0;
		switch (inputnum) {
		case 1: charge = money - p.price; break;
		case 2: charge = money - p.price; break;
		case 3: charge = money - p.price; break;
		case 4: charge = money - p.price; break; 
		}
		System.out.println("거스름돈은" + charge + "입니다");
	}
	void drink (Product p) {
	
	}
	
	
}
public class Machine {

}
