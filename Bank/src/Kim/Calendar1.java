package Kim;
import java.util.Calendar;
import java.util.Date;

import IK.util.Edu_Date;

/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
 * GregorianCalendar
   buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
      �±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
     �� �ν��Ͻ��� ��ȯ�Ѵ�
   GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
   �׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
   �׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
   ������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......   }  }
  API : ������ Protected Calendar() 
 */
//Java API
//��¥ : Date (��) -> Calendar(��)
public class Calendar1 {
	public static void main(String[] args) {
		Date dt = new Date();//������
		System.out.println(dt.toString());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString()); 
		//����� �ʿ��� �ð��� ������ �������� �ٰ� (������ �̾Ƽ� �����)
		System.out.println("�⵵:" + cal.get(cal.YEAR));
		System.out.println("��(0~11):" + (cal.get(cal.MONTH)+1));
		System.out.println("��: " + cal.get(cal.DATE));
		
		System.out.println("�� ���� ��° ��:" + cal.get(cal.WEEK_OF_MONTH));
		System.out.println(cal.get(cal.DAY_OF_MONTH));
		System.out.println(cal.get(cal.DAY_OF_WEEK));
		
		//�� , ��  , ��
		//���� , ���� 
		System.out.println("�� : " + cal.get(cal.HOUR));
		System.out.println("�� : " + cal.get(cal.MINUTE));
		System.out.println("�� : " + cal.get(cal.SECOND));
		
		System.out.println("���� ���� :" + cal.get(cal.AM_PM));
		//���� 0 , ���� 1
		
		//������Ʈ (�п����� ����Ʈ)
		//200�� ... 150�� ������ ��¥ 
		//2019��09��05�� >> ���� >> 2019-09-05  (150�� ����)
		//�ѹ��� ���� ....
		//��¥ ���õ� Ŭ���� : Ư�� �Լ� ȣ�� : ȭ�� ��¥ ���
		//class MyDate { static void todate(){} }
		//Mydate.todate();
		
		 String date =Edu_Date.DateString(cal.getInstance());
		 System.out.println(date);
		 
		 String date3 =Edu_Date.DateString(cal.getInstance(),"-");
		 System.out.println(date3);
		 
		 String date4 = Edu_Date.monthFormat_DateString(cal.getInstance());
		 System.out.println(date4);
	}

	private static Calendar1 getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}



