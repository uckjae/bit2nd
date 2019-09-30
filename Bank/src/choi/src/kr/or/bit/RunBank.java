package kr.or.bit;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class RunBank {
   Bank b = new Bank();
   
   public void console() {
      System.out.println("1. 계좌생성");
      System.out.println("2. 계좌입금");
      System.out.println("3. 계좌출금");
      System.out.println("4. 계좌찾기(계좌번호)");
      System.out.println("5. 계좌찾기(소유자명)");
      System.out.println("6. 계좌목록");
      System.out.println("7. 총계좌수");
      System.out.println("8. 시스템종료");
      System.out.println("9. 트랜잭션 확인");
      System.out.println("1~9까지중에 눌러주세요");
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
            System.out.println("계좌번호를 입력해주세요");
            accountNo = sc.nextLine();
            System.out.println("이름을 입력해주세요");
            name = sc.nextLine();
            b.addAccount(accountNo, name);
            break;
         case "2":
            System.out.println("계좌번호를 입력해주세요");
            accountNo = sc.nextLine();
            System.out.println("입금할 금액을 입력해주세요");
            money = Integer.parseInt(sc.nextLine());
            b.getAccount(accountNo).deposit(money);
            break;
         case "3":
            System.out.println("계좌번호를 입력해주세요");
            accountNo = sc.nextLine();
            System.out.println("출금할 금액을 입력해주세요");
            money = Integer.parseInt(sc.nextLine());
            b.getAccount(accountNo).withdraw(money);
            break;
         case "4":
            System.out.println("계좌번호를 입력해주세요");
            accountNo = sc.nextLine();
            System.out.println(b.getAccount(accountNo));
            break;
         case "5":
            System.out.println("이름을 입력해주세요");
            name = sc.nextLine();
            System.out.println(b.findAccounts(name));
            break;
         case "6":
            System.out.println("계좌목록을 출력합니다.");
            System.out.println(b.getAccounts());
            break;
         case "7":
            System.out.println("총 계좌수를 출력합니다.");
            System.out.println(b.getTotalAccount());
            break;
         case "8":
            System.out.println("안녕히가세요^^");
            System.exit(0);
         case "9":
            System.out.println("계좌번호를 입력해주세요");
            accountNo = sc.nextLine();
            System.out.println(b.getAccount(accountNo).getTransactions());
            break;
         default:
            System.out.println("1~9까지만 입력하세요...^^");
            break;
         }
      }while(true);
      
   }
}