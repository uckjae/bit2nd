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
	FileWriter fw = null;
	BufferedWriter bfw = null;
	FileReader fr = null;
	BufferedReader bfr = null;
	List<Integer> list = new ArrayList<>();
	int str = 0;
	
	
	public void Lotto() {
		while (list.size() < 6) {
			int lotto = (int) (Math.random() * 45 + 1);
			list.add(lotto);
		}

	}

	public void LottoFile() {
		
		Lotto();
		try {
			fw = new FileWriter("kim.txt", true); // 경로에 파일 생성하고 , 추가를 허용
			bfw = new BufferedWriter(fw); // 한줄씩 써서 내려감
			bfw.write("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			for(int i=0;i<=list.size();i++) {
				str = list.get(i);
			}
			bfw.write(str);
			fw.flush();
			bfw.flush();
			

		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				fw.close();
				bfw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void FileLoad() {
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
		FileWriter fw = null;
		BufferedWriter bfw = null;
		FileReader fr = null;
		BufferedReader bfr = null;
		List<Integer> list = new ArrayList<>();
		int str = 0;
		while (list.size() < 6) {
			int lotto = (int) (Math.random() * 45 + 1);
			list.add(lotto);
		}
		try {
		fw = new FileWriter("kim.txt", true); // 경로에 파일 생성하고 , 추가를 허용
		bfw = new BufferedWriter(fw); // 한줄씩 써서 내려감
		bfw.write("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		for(int i=0;i<=list.size();i++) {
			str = list.get(i);
		}
		bfw.write(str);
		fw.flush();
		bfw.flush();
		

	} catch (IOException e) {

		e.printStackTrace();
	}finally {
		try {
			fw.close();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
