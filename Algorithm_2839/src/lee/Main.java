package lee;
import java.io.*;

public class Main {

public static void getResult(int n, int five) {
		
		int three = 0;
		if((n-5*five)%3==0) {
			three = (n-5*five)/3;
			System.out.println(five+three);
		}else {
			five -=1;
			if(five>=0) {
				getResult(n,five);
			}else {
				System.out.println(-1);
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine().trim());
    	
    	int five = n/5;
    	
    	getResult(n, five);
    	
    	
    }

}