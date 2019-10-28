package won;
import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		int count = 1;
		boolean exit = true; 
		int stMax = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < stMax; i++) {
			int target = scan.nextInt();
			
			exit = true;
			while(exit) {
				if(stack.isEmpty()) {
					stack.push(++count);
					sb.append("+\n");
				}
				if (stack.peek() != target) {
					stack.push(++count);
					sb.append("+\n");
				}
				else if (stack.peek() == target) {
					stack.pop();
					sb.append("-\n");
					exit = false;
				}
			}
		}
		System.out.println(sb.toString());
	}
}
