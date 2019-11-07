package kim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto_k {
	Scanner sc = new Scanner(System.in);
	File f = null;
	FileWriter fw = null;
	BufferedWriter bfw = null;
	FileReader fr = null;
	BufferedReader bfr = null;
	List<Integer> list = new ArrayList<>();
	
	
	
	public void Lotto() {
		while (list.size() < 6) {
			int lotto = (int)(Math.random() * 45 + 1);
			list.add(lotto);
		}

	}

	public void LottoFile() {
		String str=" ";
		Lotto();
		try {
			fw = new FileWriter("kim.txt", true); // 경로에 파일 생성하고 , 추가를 허용
			bfw = new BufferedWriter(fw); // 한줄씩 써서 내려감
			bfw.write("★☆★☆★☆★☆★☆");
			bfw.newLine();
			for(int i=0;i<list.size();i++) {
				str += list.get(i) + " ";
				System.out.println(str);
				
			}
			
			bfw.write(str);
			bfw.newLine();
			fw.flush();
			bfw.flush();
			

		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			
		}
	}
	
	public void FileLoad() {
		f = "kim.txt";
		try {
			fr = new FileReader("kim.txt");
			bfr = new BufferedReader(fr);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

	public static void main(String[] args) {
		Lotto_k l = new Lotto_k();
		l.LottoFile();
	}
}
