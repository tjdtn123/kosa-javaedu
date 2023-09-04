package day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput3 { // 한 행을 읽는 코드

	public static void main(String[] args) throws Exception {
		System.out.println("입력 : ");
		String input = new BufferedReader(new InputStreamReader(System.in)).readLine(); //InputStreamReader byteStream을 문자스트림으로 바꾸어주는 bridge(브릿지)이다. 
															//유니코드로 바꿔줌
		
		System.out.println("입력된 데이터 : "+input); // windows 는 기본이 CP949라서 영어는 1byte 한글은 2byte 
														// '가'를 출력한다 했을때 0xBOA1 중에 BO만 읽게된다. 
		
	}
}
