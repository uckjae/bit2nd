package Kim;

import java.text.SimpleDateFormat;
import java.util.Date;

 

public class Date1
{
  public static void main(String[] args) throws Exception
  {
     
    String reqDateStr = "201812121212"; //����ð� 
    Date curDate = new Date(); 
    
    //SimpleDateFormat dateFormat = new SimpleDateFormat("YYYYMMddHHmm"); //��û�ð��� Date�� parsing �� time�������� 
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm"); //��û�ð��� Date�� parsing �� time��������
    System.out.println(dateFormat.format(curDate));
    
    
    
    Date reqDate = dateFormat.parse(reqDateStr); 
    System.out.println("reqDateStr : " + reqDateStr);
    System.out.println("reqDate : " + reqDate);
    
    long reqDateTime = reqDate.getTime(); 
    //����ð��� ��û�ð��� ���·� format �� time �������� 
    
    curDate = dateFormat.parse(dateFormat.format(curDate)); 
    
    long curDateTime = curDate.getTime(); //������ ǥ�� 
    long minute = (curDateTime - reqDateTime) / 60000; 
    System.out.println("��û�ð� : " + reqDate); 
    System.out.println("����ð� : " + curDate); 
    System.out.println(minute+"�� ����");

 
    System.out.println(diffOfDate("20180101", "20180110"));
  }

 

  public static long diffOfDate(String begin, String end) throws Exception
  {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

 

    Date beginDate = formatter.parse(begin);
    Date endDate = formatter.parse(end);
    System.out.println("beginDate : " + beginDate);
 
    long diff = endDate.getTime() - beginDate.getTime();
    long diffDays = diff / (24 * 60 * 60 * 1000);

 

    return diffDays;
  }
}

