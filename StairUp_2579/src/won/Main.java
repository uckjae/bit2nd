package won;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] maxScore = new int[300];
		int[] stair = new int[300];
		
		for(int i = 0; i < n; i++) {
			stair[i] = scan.nextInt();
		}
		
		maxScore[0] = stair[0];
		maxScore[1] = stair[0] + stair[1];
		maxScore[2] = Math.max(stair[1] + stair[2], stair[0] + stair[2]);
		for(int i = 3; i < n; i++) {
			maxScore[i] = maxScore[i-3] + stair[i-1] > maxScore[i-2] ? 
			maxScore[i] + maxScore[i-3] + stair[i-1] : stair[i] + maxScore[i-2];
			System.out.println("i:" + i + " / " + maxScore[i]);
		}
		System.out.println("MAX °ª : " + maxScore[n-1]);
	}
}
