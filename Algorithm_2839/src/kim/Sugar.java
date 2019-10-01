package kim;

import java.util.Scanner;

public class Sugar {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int input = sc.nextInt();
	    int three = 0; 
	    int five = 0;
	    
	   
	    while(input % 5 !=0 && input >= 0) { //입력한 값이 5로 나눠서 나머지가 0이 아니거나 입력한 값이 0보다 같거나 크면
	      input -=3; // 입력한 값에서 3을 빼준다 
	      three++; //3kg 누적 
	      
	    }
	    
	    five = input < 0 ? -1 : three + input/5; // five가 입력한 값이 0 보다 작을경우 -1로 가고 false면 뒤에 식으로 들어간다.
	    System.out.println(five);
		
	    
		
			}
		}
		
		
		
		
		
		
