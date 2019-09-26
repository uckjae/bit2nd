package chung;

public class Algo {
	public static void main(String[] args) {
	
			choi(24, 18);
		
		}	



	static int choi(int x,int y) {
		int max =1; 
		int range = Math.min(x, y); 
		for(int i =1;i<= range; i++) {
			if(x%i == 0 && y%i == 0) {
				max = i;	
		}
			
	}
		 System.out.println(max);
	return max;
}
	
}