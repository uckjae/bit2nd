package kim;
/*
 	����Ÿ�� : �޼ҵ尡 �����ϴ� ����� Ÿ���� ǥ��
 	�޼ҵ� �̸� : �޼��� ����� �巯������ �ĺ��� ��Ģ�� �°� �̸��� ���´�.
 	�Ű� ���� ���� : �޼ҵ带 ������ �� �ʿ��� �����͸� �ޱ� ���� ������ ���� �մϴ�.
 	�޼ҵ� ���� ��� : ������ �ڵ带 �ۼ� �մϴ�.
 	
 	�޼ҵ� ��Ģ 
 	- ���ڷ� �����ϸ� �ȵǰ� '$','_'�� ������ Ư������ ��� ����
 	- ���������� �޼ҵ� �̸��� �ҹ��ڷ� �ۼ�
 	- ���� �ٸ��ܾ ȥ�յ� �̸��̶�� �ھ�� ���� �ܾ��� ù���ڴ� �빮�� 
 	
 	�Ű� ���� : �޼ҵ尡 ������ �� �ʿ��� �����͸� �ܺηκ��� �ޱ� ���� ���
 	
 	���� : �޼ҵ� ���� ���� Ÿ���� �ִ� �޼ҵ�� �ݵ�� ���Ϲ��� ����ؼ� ���ϰ��� ����
 	void : ���� ���� ���� �޼ҵ� ���� Ÿ��
 	
 	��ü �ܺο��� ȣ�� 
 	-> �ܺ� Ŭ�������� �޼ҵ带 ȣ���Ϸ��� Ŭ�����κ��� ��ü�� ���� 
 	ex) Ŭ���� �������� = new Ŭ����(�Ű��� , ... );
 	
 	�޼ҵ� �����ε� : Ŭ���� ���� ���� �̸��� �޼ҵ带 ������ �����ϴ� ��
 	* �Ű� ������ Ÿ�� , ���� , ������ �޶����  * 
 	
 	�ν��Ͻ� ��� : ��ü(�ν��Ͻ�)�� ������ �� ����� �� �ִ� �ʵ�� �޼ҵ� 
 	������� : Ŭ������ ��ġ��Ű�� ��ü���� �����ϴ� ���
 	
 	this : ��ü �ܺο��� �ν��Ͻ� ����� �����ϱ� ���� ���� ������ ����ϴ� �Ͱ� ���������� ��ü ���ο����� �ν��Ͻ� ����� �����ϱ� ���� this�� ��� �� �� �ֽ��ϴ�.
 	���� : "������"�̶� �ǹ� �Դϴ�. ��������� Ŭ������ ������ ����μ� ��ü�� �������� �ʰ� ����� �� �ִ� �ʵ�� �޼ҵ带 ���մϴ�.
 	
 	��Ŭ�� : ���α׷����� �� �ϳ��� ��ü�� �����ϵ��� ���� �ؾ��ϴ� ��� �� �ϳ��� �����ϰ� �ϴ°�
 	
 	final : "������" �̶� ���� ������ �ִ�. final �ʵ�� �ʱⰪ�� ����Ǹ� �̰��� �������� ���� �Ǿ ���α׷� ���� ���߿� ���� �� �� ���ٴ� ��
 	��� : �Ϲ������� �Һ��� �� ex) ������ , ������ ���� , �ѷ� 
 	
 	���������� : ������ �����ϱ� ���� ���
 	public : �ܺ� Ŭ������ �����Ӱ� ��밡��
 	protected : ���� ��Ű�� or �ڽ� Ŭ�������� ��밡��
 	private : �������ΰ� , �ܺο��� ��� �Ұ���
 	default : ���� ��Ű���� �Ҽӵ� Ŭ�������� ��� ���� 
 	
 	getter() : private�� Ȯ���ϴ� �۾��� ���
 	setter() : private�� ���� �۾��� ��� 
 	
 	
 */
class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum+= values[i];
		}
		return sum;
	}
	
	int sum2(int[] values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}

}

class Cars {
	
	int gas;
	
	Cars(){
		
	}
	void setGas(int gas) { //�޼ҵ� 
		this.gas = gas; //���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ� ���� ����
	}
	boolean isLeftGas() { //���ϰ���  boolean�� �޼ҵ�� gas �ʵ� ���� 0�̸� false 0�� �ƴϸ� true�� 
		if(gas == 0) {
			System.out.println("������ �����ϴ�.");
			return false;
		}
		System.out.println("������ �ֽ��ϴ�");
		return true;
	}
	void run() { //���ϰ��� ���� �޼ҵ�� gas �ʵ� ���� 0�̸� return������ �޼ҵ带 ���� ���� 
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�. ( Gas �ܷ� : " + gas + ")");
				gas -=1;
			}else {
				System.out.println("����ϴ�. ( Gas�ܷ� : " + gas + ")");
				return; //�޼ҵ� ���� ���� 
			}
		}
	}
}

class Calculator2 {
	int plus(int x, int y) { //2��
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { //1�� 
		double sum = plus(x,y);
		double result = sum / 2; //2�� ȣ�� 
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); //1�� ȣ�� 
		println("������ : " + result); //3�� ȣ��
	}
	void println(String message) { //3�� 
		System.out.println(message);
	}
}

class Car6 {
	int speed; //�ʵ� 
	
	Car6() {
		//������
	}
	
	int getSpeed() { //�޼ҵ�
		return speed;
	}
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; i <= 50; i+=10) {
			speed = i;
			System.out.println("�ü� : " + speed + "km/h");
		}
	}
	
}

class Calculator3 {
	//���簢���� ����
	double area(double width) {
		return width * width;
	}
	double area(double width, double height) {
		return width * height;
	}
}

class Car4 {
	
	String model;
	int speed;
	Car4(String model){
		this.model = model;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10;i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�. (�ü�  : " + this.speed + "km/h)");
		}
	}
	
}

class Calculator7 {
	static double pi = 3.14159;
	
	static int plus(int x,int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}

class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}

class Person {
	final String nation1 = "Korean";
	final String ssn7;
	String name7;
	public Person(String ssn7, String name7) {
		this.ssn7 = ssn7;
		this.name7 = name7;
	}
	
}

class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}

class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	 void method2() {}
	private void method3() {}
	
}

class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; private �ʵ� ���� �Ұ��� 
		
		a.method1();
		a.method2();
 		//a.method3(); private �޼ҵ� ���� �Ұ�
	}
}

class Car10 {
	private int speed;
	private boolean stop;
	
	public Car10(){
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}

public class OOP2_Study {	
	public static void main(String[] args) {
		
		Computer com = new Computer();
		int[] value1 = {1,2,3};
		int result1 = com.sum1(value1);
		System.out.println("result1 : " + result1);
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : " + result2);
		
		int result3 = com.sum2(new int[] {1,2,3});
		System.out.println("result3 : " + result3);
		
		int result4 = com.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4 : " + result4);
		System.out.println();
 
		/////////////////////////////////////////////////////////
		
		Cars c = new Cars();
		
		c.setGas(5); //Car�� setGas() �޼ҵ� ȣ�� 
		
		boolean gasState = c.isLeftGas(); //Car�� isLeftGas() ȣ�� 
		if(gasState) {
			System.out.println("��� �մϴ�");
			c.run(); //Car�� run �޼ҵ� ȣ��
		}
		if(c.isLeftGas()) {//Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� ���� �ϼ���.");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////////
		
		Calculator2 cal2 = new Calculator2();
		
		cal2.execute(); // Calculator2 �� �޼ҵ� ȣ�� 
		System.out.println();
		
		/////////////////////////////////////////////////////////////
		
		Car6 car6 = new Car6();
		car6.keyTurnOn();
		car6.run();
		int speed = car6.getSpeed();
		System.out.println("���� �ü� : " + speed + "km/h");
		System.out.println();
		
		////////////////////////////////////////////////////////////
		
		Calculator3 cal3 = new Calculator3();
		
		double result6 = cal3.area(10); //���簢��
		double result5 = cal3.area(10, 20); //���簢��
		
		System.out.println("���簢�� ���� = " + result6);
		System.out.println("���簢�� ���� = " + result5);
	
		////////////////////////////////////////////////////////////
		
		Car4 myCar = new Car4("���");
		Car4 youCar = new Car4("��Ʋ��");
		
		myCar.run();
		System.out.println();
		youCar.run();
		System.out.println();
		
		///////////////////////////////////////////////////////////
		
		double result8 = 10 * 10 * Calculator7.pi;
		int result9 = Calculator7.plus(10, 5);
		int result10 = Calculator7.minus(10, 5);		
	
		System.out.println("result8 : " + result8);
		System.out.println("result9 : " + result9);
		System.out.println("result10 : " + result10);
		System.out.println();
		
		/////////////////////////////////////////////////////////////
		
			Singleton obj1 = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();
			
			if(obj1 == obj2) {
				System.out.println("���� Singleton ��ü�Դϴ�.");
			}else {
				System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
			}
			
			System.out.println();
		///////////////////////////////////////////////////////////
			
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		
		System.out.println(p1.nation1);
		System.out.println(p1.ssn7);
		System.out.println(p1.name7);
		System.out.println();
		//p1.nation1 = U.S.A;
		//p1.ssn7 = 456789-1234567;
		p1.name7 = "������"; 
		
		////////////////////////////////////////////////////////////////
		
		System.out.println(" ������ ������ : " + Earth.EARTH_RADIUS + "km");
		System.out.println(" ������ ǥ���� : " + Earth.EARTH_AREA + "km^2");
		System.out.println();
		
		///////////////////////////////////////////////////////////////
		
		Car10 car10 = new Car10();
		
		car10.setSpeed(-50);
		
		System.out.println("���� �ӵ� : " + car10.getSpeed());
		
		//�ùٸ� �ӵ� ���� 
		car10.setSpeed(60);
		
		
		//���� 
		if(!car10.isStop()) {
			car10.setStop(true);
		}
		System.out.println("����ӵ� : " + car10.getSpeed());
	}
	
}
