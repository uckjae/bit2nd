package kim;
/* ��ü ���� ���α׷��� 
  ��ü : ���������� �����ϰų� �߻������� ���� �� �� �ִ� ���߿��� �ڽ��� �Ӽ��� ������ �����鼭 �ĺ� �����Ѱ��� ���մϴ�.
 ��ü �𵨸� : ���� ������ ��ü�� ����Ʈ���� ��ü�� �����ϴ� ��
 
 ���հ��� : ���հ��迡 �ִ� ��ü�� �ϳ��� ��ǰ�̰� �ϳ��� �ϼ�ǰ�� �ش�ȴ�. ex) �ڵ��� (���� , Ÿ�̾� , �ڵ� ��) 
 ������ : ��ü ���� ��ȣ�ۿ��� ���Ѵ�. ex) �ڵ��� - ��� (����� �ڵ����� ����Ѵ�.)
 ��Ӱ��� : ����(�θ�) ��ü�� ������� ����(�ڽ�) ��ü�� �����ϴ� ���踦 ���մϴ�. ex) ��� - �ڵ��� (��� �ȿ� �ڵ����� �ִ�.) 
  
 ���赵 = Ŭ���� 
 �ν��Ͻ� : Ŭ�����κ��� ������� ��ü
 
 ��ü ���� ���α׷��� ���� 
1. Ŭ������ ���� �մϴ�.
2. ����� Ŭ������ ������ ����� ��ü�� �����մϴ�.
3. ������ ��ü�� �̿��մϴ�.

 Ŭ���� ���𿡼� �ĺ��� ��Ģ 
1. �ϳ� �̻��� ���ڷ� �̷���� ex) Car , SportsCar
2. ù ���ڿ��� ���ڰ� ���´� ex) 5Car 5Sports
3. '$' , '_' ���� Ư�� ���ڴ� ��� �Ұ��� ex) @Car , #Car
4. �ڹ� Ű����� ��� �� �� ����. ex) int , for

�ʵ�  : ��ü�� ���� ������, ��ǰ ��ü , ���� ������ �����ϴ� ���Դϴ�.
������ : new �����ڷ� ȣ��Ǵ� Ư���� �߰�ȣ {} ��� �Դϴ�. , ��ü ������ �ʱ�ȭ�� ����Ѵ�.
�޼ҵ� : �ܺηκ��� �Ű����� �޾� ���࿡ �̿��ϰ� , ���� �� ��� ���� �ܺη� ������ ���� �ֽ��ϴ�.

�����ε� : �ϳ��� �̸����� �Ű������� Ÿ�� , ���� �ٸ��� ����

*/
class Student {
	
}

class Car { //�ʵ� ����
	String company = "���� �ڵ���";
	String model ="�׷���";
	String color ="����";
	int MaxSpeed=350;
	int speed;
	
}

class FieldInitValue{ //�ʵ� ���� 
	byte byteField; //byte Ÿ�� -128 ~ 127
	short shortField; //short Ÿ�� �Ǽ� 32.xxx ~ 32.xxx  
	int intField; //-21�� ~ 21��
	long longField; //-999... ~ 999...
	
	boolean booleanField; //~~ ���� Ȯ�� 
	char charField; //�����ڵ� 
	
	float floatField; //�Ǽ� 
	double doubleField; //float ���� double�� ����ϱ� ����
	
	int[] arrField; //�迭 Ÿ��
	String referenceField; //���ڿ� 
}
class Car2 { //�ʵ���� 
	Car2(String color,int cc){ //������ 
		
	}
}

class Korean {//�ʵ� 
	String nation ="���ѹα�";
	String name;
	String ssn;
	
	public Korean(String n,String s) { //������  �Ű����� n , s
		name = n;
		ssn = s;
	}
}

class Car3 {
	String company ="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car3(){ //������ 1
		
	}
	Car3(String model){ //������ 2
		this.model = model;
	}
	Car3(String model,String color){//������ 3
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
		Student s1 = new Student();//��ü ���� 
		System.out.println("s1 ������ Student ��ü�� ���� �մϴ�.");
		
		Student s2 = new Student(); //��ü ���� 
		System.out.println("s2 ������ �� �ٸ� Student ��ü�� ���� �մϴ�.");
		System.out.println();
		
		Car myCar = new Car();//��ü ����
		
		System.out.println("����ȸ�� : " + myCar.company); //�ʵ� �� �б�
		System.out.println("�ڵ��� �� : " + myCar.model); 
		System.out.println("�ڵ��� �� : " + myCar.color); 
		System.out.println("�ְ�ӵ� : " + myCar.MaxSpeed); 
		System.out.println("����ӵ� : " + myCar.speed); 
		
		myCar.speed = 60; //�ʵ� ���� ���� 
		System.out.println("������ �ӵ� : " + myCar.speed); //������ �ʵ尪 �б�
		System.out.println();
		
		FieldInitValue fiv = new FieldInitValue(); //��ü ���� 
		
		System.out.println("Byte : " + fiv.byteField);
		System.out.println("Short : " + fiv.shortField);
		System.out.println("Int : " + fiv.intField);
		System.out.println("Long : " + fiv.longField);
		System.out.println("Boolean : " + fiv.booleanField); //false �������� �Ұ� ���
		System.out.println("Char : " + fiv.charField);
		System.out.println("Float : " + fiv.floatField);
		System.out.println("Double : " + fiv.doubleField);
		System.out.println("int[] : " + fiv.arrField); //�迭�ȿ� �ƹ��͵� ��� null
		System.out.println("String : " + fiv.referenceField); //null : ���ڿ�
		System.out.println();
		
		Car2 myCar2 = new Car2("����",3000); //������ ȣ�� 
		
		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "123456-0157854");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		System.out.println();
		
		Car3 car1 = new Car3(); //������ ���� 1
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("�ڰ���"); //������ ���� 2
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car3 car3 = new Car3("�ڰ���","����"); //������ ���� 3
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("�ý�","��Ȳ",250);// ������ ���� 4
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		
	}
	

}
