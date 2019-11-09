package chung;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LottoIO {

	public Set<Integer> makeLotto() {
		Set<Integer> lottoset = new HashSet<Integer>();
		
		for(int i = 0; i < 6; i++) {
			int num = (int) (Math.random()*45 +1);
			lottoset.add(num);
		}	
		return lottoset;
	}
	
	public void fileLotto() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//FileOutputStream fos = new FileOutputStream("LottoIO.txt");
			//BufferedInputStream bis = new BufferedInputStream(fis);
			 fw = new FileWriter("LottoIO.txt");
			 bw = new BufferedWriter(fw);
	//		byte[] content = makeLotto();
	//		int data = 0;
	//		while((data = bos.write()) != -1) {
	//			bos.write(b);
	//		}
			bw.write("로또번호");
			bw.newLine();
			bw.write(makeLotto().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
