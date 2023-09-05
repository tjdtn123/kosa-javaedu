package day14;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class FileOutLab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "c:/Temp";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String fileName = sc.next();	
		sc.close();
		try (FileWriter writer = new FileWriter(path+"/"+fileName);
				PrintWriter out = new PrintWriter(writer);){
			LocalDate d1 = LocalDate.of(2023,10,3);
			LocalDate d2 = LocalDate.of(2023,12,25);
			DayOfWeek day1 = d1.getDayOfWeek();
			DayOfWeek day2 = d2.getDayOfWeek();
			String korday1 = day1.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			String korday2 = day2.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			
			out.printf("%d년 %d월 %d일은 %s입니다.\r\n",d1.getYear() , d1.getMonthValue(), d1.getDayOfMonth(),korday1);
			out.printf("%d년 %d월 %d일은 %s입니다.\r\n",d2.getYear() , d2.getMonthValue(), d2.getDayOfMonth(),korday2);
			
			System.out.println("저장이 완료되었습니다");
		}catch (Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}

}
