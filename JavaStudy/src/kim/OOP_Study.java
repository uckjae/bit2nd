package kim;
/* 객체 지향 프로그래밍 
  객체 : 물리적으로 존재하거나 추상적으로 생각 할 수 있는 것중에서 자신의 속성을 가지고 있으면서 식별 가능한것을 말합니다.
 객체 모델링 : 현실 세계의 객체를 소프트웨어 객체로 설계하는 것
 
 집합관계 : 집합관계에 있는 객체는 하나는 부품이고 하나는 완성품에 해당된다. ex) 자동차 (엔진 , 타이어 , 핸들 등) 
 사용관계 : 객체 간의 상호작용을 말한다. ex) 자동차 - 사람 (사람이 자동차를 사용한다.)
 상속관계 : 상위(부모) 객체를 기반으로 하위(자식) 객체를 생성하는 관계를 말합니다. ex) 기계 - 자동차 (기계 안에 자동차가 있다.) 
  
 설계도 = 클래스 
 인스턴스 : 클래스로부터 만들어진 객체
 
 객체 지향 프로그래밍 순서 
1. 클래스를 설계 합니다.
2. 설계된 클래스를 가지고 사용할 객체를 생성합니다.
3. 생성된 객체를 이용합니다.

 클래스 선언에서 식별자 규칙 
1. 하나 이상의 문자로 이루어짐 ex) Car , SportsCar
2. 첫 글자에는 숫자가 못온다 ex) 5Car 5Sports
3. '$' , '_' 외의 특수 문자는 사용 불가능 ex) @Car , #Car
4. 자바 키워드는 사용 할 수 없다. ex) int , for

필드  : 객체의 고유 데이터, 부품 객체 , 상태 정보를 저장하는 곳입니다.
생성자 : new 연산자로 호출되는 특별한 중괄호 {} 블록 입니다. , 객체 생성시 초기화를 담당한다.
메소드 : 외부로부터 매개값을 받아 실행에 이용하고 , 실행 후 결과 값을 외부로 리턴할 수도 있습니다.

오버로딩 : 하나의 이름으로 매개변수의 타입 , 개수 다르게 선언

*/
class Student {
	
}

class Car { //필드 생성
	String company = "현대 자동차";
	String model ="그랜져";
	String color ="검정";
	int MaxSpeed=350;
	int speed;
	
}

class FieldInitValue{ //필드 생성 
	byte byteField; //byte 타입 -128 ~ 127
	short shortField; //short 타입 실수 32.xxx ~ 32.xxx  
	int intField; //-21억 ~ 21억
	long longField; //-999... ~ 999...
	
	boolean booleanField; //~~ 여부 확인 
	char charField; //유니코드 
	
	float floatField; //실수 
	double doubleField; //float 보다 double을 사용하기 권장
	
	int[] arrField; //배열 타입
	String referenceField; //문자열 
}
class Car2 { //필드생성 
	Car2(String color,int cc){ //생성자 
		
	}
}

class Korean {//필드 
	String nation ="대한민국";
	String name;
	String ssn;
	
	public Korean(String n,String s) { //생성자  매개변수 n , s
		name = n;
		ssn = s;
	}
}

class Car3 {
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car3(){ //생성자 1
		
	}
	Car3(String model){ //생성자 2
		this.model = model;
	}
	Car3(String model,String color){//생성자 3
		this.model = model;
		this.color = color;		
	}
	Car3(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class OOP_Study {	

	

	public static void main(String[] args) {
		Student s1 = new Student();//객체 생성 
		System.out.println("s1 변수가 Student 객체를 참조 합니다.");
		
		Student s2 = new Student(); //객체 생성 
		System.out.println("s2 변수가 또 다른 Student 객체를 참조 합니다.");
		System.out.println();
		
		Car myCar = new Car();//객체 생성
		
		System.out.println("제작회사 : " + myCar.company); //필드 값 읽기
		System.out.println("자동차 모델 : " + myCar.model); 
		System.out.println("자동차 색 : " + myCar.color); 
		System.out.println("최고속도 : " + myCar.MaxSpeed); 
		System.out.println("현재속도 : " + myCar.speed); 
		
		myCar.speed = 60; //필드 값을 변경 
		System.out.println("수정된 속도 : " + myCar.speed); //수정된 필드값 읽기
		System.out.println();
		
		FieldInitValue fiv = new FieldInitValue(); //객체 생성 
		
		System.out.println("Byte : " + fiv.byteField);
		System.out.println("Short : " + fiv.shortField);
		System.out.println("Int : " + fiv.intField);
		System.out.println("Long : " + fiv.longField);
		System.out.println("Boolean : " + fiv.booleanField); //false 진위여부 할게 없어서
		System.out.println("Char : " + fiv.charField);
		System.out.println("Float : " + fiv.floatField);
		System.out.println("Double : " + fiv.doubleField);
		System.out.println("int[] : " + fiv.arrField); //배열안에 아무것도 없어서 null
		System.out.println("String : " + fiv.referenceField); //null : 빈문자열
		System.out.println();
		
		Car2 myCar2 = new Car2("검정",3000); //생생자 호출 
		
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "123456-0157854");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		System.out.println();
		
		Car3 car1 = new Car3(); //생성자 선택 1
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("자가용"); //생성자 선택 2
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car3 car3 = new Car3("자가용","검정"); //생성자 선택 3
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("택시","주황",250);// 생성자 선택 4
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		
	}
	

}
