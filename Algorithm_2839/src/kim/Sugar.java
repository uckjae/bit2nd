package kim;

import java.util.Scanner;

public class Sugar {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int input = sc.nextInt();
	    int three = 0; 
	    int five = 0;
	    
	   
	    while(input % 5 !=0 && input >= 0) { //�Է��� ���� 5�� ������ �������� 0�� �ƴϰų� �Է��� ���� 0���� ���ų� ũ��
	      input -=3; // �Է��� ������ 3�� ���ش� 
	      three++; //3kg ���� 
	      
	    }
	    
	    five = input < 0 ? -1 : three + input/5; // five�� �Է��� ���� 0 ���� ������� -1�� ���� false�� �ڿ� ������ ����.
	    System.out.println(five);
		
	    
		
			}
		}
		
		
		
		
		
		
