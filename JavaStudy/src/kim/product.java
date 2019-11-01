package kim;

import kim.product;

public class product {
	public String name;
	public int price;
	public int count;
	
	public product (String name,int price,int count ) {
		this.count = count;
		this.price = price;
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
}

class coke extends product {

	public coke(String name, int price, int count) {
		super("��ī�ݶ�", 1500, 30);
		// TODO Auto-generated constructor stub
	}
	
}
class cider extends product {

	public cider(String name, int price, int count) {
		super("ĥ�� ���̴�", 1300, 30);
		// TODO Auto-generated constructor stub
	}
	
}
class power extends product {

	public power(String name, int price, int count) {
		super("�Ŀ����̵�", 1000, 30);
		// TODO Auto-generated constructor stub
	}




	
}