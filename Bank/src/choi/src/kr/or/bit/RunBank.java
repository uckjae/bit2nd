package choi.src.kr.or.bit;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class RunBank {
   Bank b = new Bank();
   
   public void console() {
      System.out.println("1. ���»���");
      System.out.println("2. �����Ա�");
      System.out.println("3. �������");
      System.out.println("4. ����ã��(���¹�ȣ)");
      System.out.println("5. ����ã��(�����ڸ�)");
      System.out.println("6. ���¸��");
      System.out.println("7. �Ѱ��¼�");
      System.out.println("8. �ý�������");
      System.out.println("9. Ʈ����� Ȯ��");
      System.out.println("1~9�����߿� �����ּ���");
   }
   public void run() {
      String s;
      String write;
      String accountNo;
      String name;
      long money;
      Scanner sc = new Scanner(System.in);
      do {
         console();
         s=sc.nextLine();
         switch (s) {
         case "1":
            System.out.println("���¹�ȣ�� �Է����ּ���");
            accountNo = sc.nextLine();
            System.out.println("�̸��� �Է����ּ���");
            name = sc.nextLine();
            b.addAccount(accountNo, name);
            break;
         case "2":
            System.out.println("���¹�ȣ�� �Է����ּ���");
            accountNo = sc.nextLine();
            System.out.println("�Ա��� �ݾ��� �Է����ּ���");
            money = Integer.parseInt(sc.nextLine());
            b.getAccount(accountNo).deposit(money);
            break;
         case "3":
            System.out.println("���¹�ȣ�� �Է����ּ���");
            accountNo = sc.nextLine();
            System.out.println("����� �ݾ��� �Է����ּ���");
            money = Integer.parseInt(sc.nextLine());
            b.getAccount(accountNo).withdraw(money);
            break;
         case "4":
            System.out.println("���¹�ȣ�� �Է����ּ���");
            accountNo = sc.nextLine();
            System.out.println(b.getAccount(accountNo));
            break;
         case "5":
            System.out.println("�̸��� �Է����ּ���");
            name = sc.nextLine();
            System.out.println(b.findAccounts(name));
            break;
         case "6":
            System.out.println("���¸���� ����մϴ�.");
            System.out.println(b.getAccounts());
            break;
         case "7":
            System.out.println("�� ���¼��� ����մϴ�.");
            System.out.println(b.getTotalAccount());
            break;
         case "8":
            System.out.println("�ȳ���������^^");
            System.exit(0);
         case "9":
            System.out.println("���¹�ȣ�� �Է����ּ���");
            accountNo = sc.nextLine();
            System.out.println(b.getAccount(accountNo).getTransactions());
            break;
         default:
            System.out.println("1~9������ �Է��ϼ���...^^");
            break;
         }
      }while(true);
      
   }
}