package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountLab {

	public static void main(String[] args) {
		int cnt = 0;
		
		try(FileReader reader = new FileReader("yesterday.txt");
				BufferedReader br = new BufferedReader(reader);
				Scanner sc = new Scanner(br)) {			
			String data;
			while (sc.hasNext()) {
				data = sc.next();				
//				if (data == null)
//					break;
				if (data.contains("yesterday")) // yesterday가 한 행에 2번 있으면 cnt는 1번 증가; equals는 대소문자를 구분해준다.
					cnt++;						// Scanner의 next를 이용해 한 단어씩 읽는게 좋다.; 
			}
			System.out.println("yesterday라는 단어는 "+cnt+"개 있습니다.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}

	}

}
