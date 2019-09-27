package IK;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;

/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
 * GregorianCalendar
   buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
      태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
     의 인스턴스를 반환한다
   GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
   그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
   그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
   이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      다른 종류의 역법의 사용하는 국가에서 실행하면 변경......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        다른 종류의 역법의 사용하는 국가에서 실행하면 변경......   }  }
  API : 생성자 Protected Calendar() 
 */
//Java API
//날짜 : Date (구) -> Calendar(신)
public class Calendar1 {
	public static void main(String[] args) {
		Date dt = new Date();//구버전
		System.out.println(dt.toString());
		
		Calendar1 cal = Calendar1.getInstance();
		System.out.println(cal.toString()); 
		//당신이 필요한 시간에 정보를 나열시켜 줄게 (정보를 뽑아서 사용해)
		System.out.println("년도:" + cal.get(cal.YEAR));
		System.out.println("월(0~11):" + (cal.get(cal.MONTH)+1));
		System.out.println("일: " + cal.get(cal.DATE));
		
		System.out.println("이 달의 몇째 주:" + cal.get(cal.WEEK_OF_MONTH));
		System.out.println(cal.get(cal.DAY_OF_MONTH));
		System.out.println(cal.get(cal.DAY_OF_WEEK));
		
		//시 , 분  , 초
		//오전 , 오후 
		System.out.println("시 : " + cal.get(cal.HOUR));
		System.out.println("분 : " + cal.get(cal.MINUTE));
		System.out.println("초 : " + cal.get(cal.SECOND));
		
		System.out.println("오전 오후 :" + cal.get(cal.AM_PM));
		//오전 0 , 오후 1
		
		//웹사이트 (학원교육 사이트)
		//200본 ... 150개 페이지 날짜 
		//2019년09월05일 >> 변경 >> 2019-09-05  (150번 수정)
		//한번의 수정 ....
		//날짜 관련된 클래스 : 특정 함수 호출 : 화면 날짜 출력
		//class MyDate { static void todate(){} }
		//Mydate.todate();
		
		 String date =Edu_Date.DateString(cal.getInstance());
		 System.out.println(date);
		 
		 String date3 =Edu_Date.DateString(cal.getInstance(),"-");
		 System.out.println(date3);
		 
		 String date4 = Edu_Date.monthFormat_DateString(cal.getInstance());
		 System.out.println(date4);
	}

}



