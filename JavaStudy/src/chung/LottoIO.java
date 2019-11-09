package chung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoIO {

	public List makeLotto() {
		Set lottoset = new HashSet();

		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45 + 1);
			lottoset.add(num);
		}
		List list = new LinkedList(lottoset);
		Collections.sort(list);
		return list;
	}

	public void makeFile() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// FileOutputStream fos = new FileOutputStream("LottoIO.txt");
			// BufferedInputStream bis = new BufferedInputStream(fis);
			fw = new FileWriter("LottoIO_chung.txt");
			bw = new BufferedWriter(fw);
			// byte[] content = makeLotto();
			// int data = 0;
			// while((data = bos.write()) != -1) {
			// bos.write(b);
			// }
			bw.write("로또번호");
			bw.newLine();
			bw.write(makeLotto().toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void readFile() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("LottoIO_chung.txt");
			br = new BufferedReader(fr);

			int data = 0;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
