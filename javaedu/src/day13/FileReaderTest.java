package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
			reader = new FileReader("c:/iotest/output.txt"); //파일 생성하는 기능 x
			while (true) {
				int data = reader.read(); // 한글이던 영어던 한 문자씩 읽어줌 더 이상 읽을 것이없어면 -1리턴
				if (data == -1)
					break;
				char ch = (char) data; // 코드값을 char로 변환해야한다
				System.out.print(ch);
			}
		} catch (FileNotFoundException fnfe) { 
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
