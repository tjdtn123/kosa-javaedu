package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ImageIOLab {

	public static void main(String[] args) {
		FileOutputStream fos;
		ArrayList<String[]> list = new ArrayList<>();
		URL req;
		try(FileReader reader = new FileReader("list.txt");
				BufferedReader br = new BufferedReader(reader);
				){
			String data;			
			String[] p;			
			while (true) {
				data = br.readLine();
				if(data == null)
					break;
				p = data.split(",");		
				list.add(p);				
			}						
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
		String path = "C:/iotest/myimage";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}	
		
		try {
			for(int i=0; i<list.size(); i++) {
				req = new URL(list.get(i)[1]);
				InputStream is = req.openStream();
				String fileName = list.get(i)[0];
				fos = new FileOutputStream(fileName);
				int input = 0;
				while (true) {
					input = is.read();
					if (input == -1)
						break;
					fos.write(input);
				}
				fos.close();
				System.out.println(fileName+"가 성공적으로 저장되었습니다.");
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application" // Runtime 객체는 getRuntime().exec()메서드를 통해 이미 생성되어있는 객체를 가져온다.
						+ "\\chrome.exe "+fileName);
		
			}
		} catch (MalformedURLException e) {
		System.out.println("URL문자열 오류 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
			
			
			
		
	}

}
