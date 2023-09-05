package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class CopyLab {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		String fileDate = "_"+ld.getYear()+"_"+ld.getMonthValue()+"_"+ld.getDayOfMonth();
		try (FileReader reader = new FileReader("sample.txt");
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter("C:/iotest/sample"+fileDate+".txt", true);// 세미콜론은 구분자의 의미; true를 안쓰면 append가 안된다.
				PrintWriter out = new PrintWriter(writer);
				) {
			String data;
			while (true) {
				data = br.readLine();
				if (data == null)
					break;				
				out.printf("%s\n", data);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}catch (IOException e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
		
				
}	
