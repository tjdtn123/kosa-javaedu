package day13;

public class StandardInput {

	public static void main(String[] args) throws Exception {
		System.out.println("입력 : ");
		int input = System.in.read();
		System.out.println("입력된 데이터 : "+(char)input); // windows 는 기본이 CP949라서 영어는 1byte 한글은 2byte 
														// '가'를 출력한다 했을때 0xBOA1 중에 BO만 읽게된다. 
		
	}
}
