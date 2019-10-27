package kim;
/*
 	리턴타입 : 메소드가 리턴하는 결과의 타입을 표시
 	메소드 이름 : 메소의 기능이 드러나도록 식별자 규칙에 맞게 이름을 짓는다.
 	매개 변수 선언 : 메소드를 실행할 때 필요한 데이터를 받기 위한 변수를 선언 합니다.
 	메소드 실행 블록 : 실행할 코드를 작성 합니다.
 	
 	메소드 규칙 
 	- 숫자로 시작하면 안되고 '$','_'를 제외한 특수문자 사용 금지
 	- 관례적으로 메소드 이름은 소문자로 작성
 	- 서로 다른단어가 혼합된 이름이라면 뒤어오 오는 단어의 첫글자는 대문자 
 	
 	매개 변수 : 메소드가 실행할 때 필요한 데이터를 외부로부터 받기 위해 사용
 	
 	리턴 : 메소드 선언에 리턴 타입이 있는 메소드는 반드신 리턴문을 사용해서 리턴값을 지정
 	void : 리턴 값이 없는 메소드 리턴 타입
 	
 	객체 외부에서 호출 
 	-> 외부 클래스에서 메소드를 호출하려면 클래스로부터 객체를 생성 
 	ex) 클래스 참조변수 = new 클래스(매개값 , ... );
 	
 	메소드 오버로딩 : 클래스 내에 같은 이름의 메소드를 여러개 선언하는 것
 	* 매개 변수의 타입 , 개수 , 순서가 달라야함  * 
 	
 	인스턴스 멤버 : 객체(인스턴스)를 생성한 후 사용할 수 있는 필드와 메소드 
 	정적멤버 : 클래스에 위치시키고 객체들이 공유하는 멤버
 	
 	this : 객체 외부에서 인스턴스 멤버에 접근하기 위해 참조 변수를 사용하는 것과 마찬가지로 객체 내부에서도 인스턴스 멤버에 접근하기 위해 this를 사용 할 수 있습니다.
 	정적 : "고정된"이란 의미 입니다. 정적멤버는 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말합니다.
 	
 	싱클톤 : 프로그램에서 단 하나의 객체만 생성하도록 보장 해야하는 경우 단 하나만 생성하게 하는것
 	
 	final : "최종적" 이란 뜻을 가지고 있다. final 필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정 할 수 없다는 것
 	상수 : 일반적으로 불변의 값 ex) 원주율 , 지구의 무게 , 둘레 
 	
 	접근제한자 : 접근을 제한하기 위해 사용
 	public : 외부 클래스가 자유롭게 사용가능
 	protected : 같은 패키지 or 자식 클래스에서 사용가능
 	private : 개인적인것 , 외부에서 사용 불가능
 	default : 같은 패키지에 소속된 클래스에서 사용 가능 
 	
 	getter() : private을 확인하는 작업을 허용
 	setter() : private을 수정 작업을 허용 
 	
 	
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
	void setGas(int gas) { //메소드 
		this.gas = gas; //리턴값이 없는 메소드로 매개값을 받아서 gas 필드 값을 변경
	}
	boolean isLeftGas() { //리턴값이  boolean인 메소드로 gas 필드 값이 0이면 false 0이 아니면 true값 
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다");
		return true;
	}
	void run() { //리턴값이 없는 메소드로 gas 필드 값이 0이면 return문으로 메소드를 강제 종료 
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. ( Gas 잔량 : " + gas + ")");
				gas -=1;
			}else {
				System.out.println("멈춥니다. ( Gas잔량 : " + gas + ")");
				return; //메소드 실행 종료 
			}
		}
	}
}

class Calculator2 {
	int plus(int x, int y) { //2번
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { //1번 
		double sum = plus(x,y);
		double result = sum / 2; //2번 호출 
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); //1번 호출 
		println("실행결과 : " + result); //3번 호출
	}
	void println(String message) { //3번 
		System.out.println(message);
	}
}

class Car6 {
	int speed; //필드 
	
	Car6() {
		//생성자
	}
	
	int getSpeed() { //메소드
		return speed;
	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i <= 50; i+=10) {
			speed = i;
			System.out.println("시속 : " + speed + "km/h");
		}
	}
	
}

class Calculator3 {
	//정사각형의 넓이
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
			System.out.println(this.model + "가 달립니다. (시속  : " + this.speed + "km/h)");
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
		//a.field3 = 1; private 필드 접근 불가능 
		
		a.method1();
		a.method2();
 		//a.method3(); private 메소드 접근 불가
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
		
		c.setGas(5); //Car의 setGas() 메소드 호출 
		
		boolean gasState = c.isLeftGas(); //Car의 isLeftGas() 호출 
		if(gasState) {
			System.out.println("출발 합니다");
			c.run(); //Car의 run 메소드 호출
		}
		if(c.isLeftGas()) {//Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입 하세요.");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////////
		
		Calculator2 cal2 = new Calculator2();
		
		cal2.execute(); // Calculator2 의 메소드 호출 
		System.out.println();
		
		/////////////////////////////////////////////////////////////
		
		Car6 car6 = new Car6();
		car6.keyTurnOn();
		car6.run();
		int speed = car6.getSpeed();
		System.out.println("현재 시속 : " + speed + "km/h");
		System.out.println();
		
		////////////////////////////////////////////////////////////
		
		Calculator3 cal3 = new Calculator3();
		
		double result6 = cal3.area(10); //정사각형
		double result5 = cal3.area(10, 20); //직사각형
		
		System.out.println("정사각형 넓이 = " + result6);
		System.out.println("직사각형 넓이 = " + result5);
	
		////////////////////////////////////////////////////////////
		
		Car4 myCar = new Car4("페라리");
		Car4 youCar = new Car4("벤틀리");
		
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
				System.out.println("같은 Singleton 객체입니다.");
			}else {
				System.out.println("다른 Singleton 객체입니다.");
			}
			
			System.out.println();
		///////////////////////////////////////////////////////////
			
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation1);
		System.out.println(p1.ssn7);
		System.out.println(p1.name7);
		System.out.println();
		//p1.nation1 = U.S.A;
		//p1.ssn7 = 456789-1234567;
		p1.name7 = "김유신"; 
		
		////////////////////////////////////////////////////////////////
		
		System.out.println(" 지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println(" 지구의 표면적 : " + Earth.EARTH_AREA + "km^2");
		System.out.println();
		
		///////////////////////////////////////////////////////////////
		
		Car10 car10 = new Car10();
		
		car10.setSpeed(-50);
		
		System.out.println("현재 속도 : " + car10.getSpeed());
		
		//올바른 속도 변경 
		car10.setSpeed(60);
		
		
		//멈춤 
		if(!car10.isStop()) {
			car10.setStop(true);
		}
		System.out.println("현재속도 : " + car10.getSpeed());
	}
	
}
