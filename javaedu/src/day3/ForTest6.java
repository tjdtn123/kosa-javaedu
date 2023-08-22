package day3;

public class ForTest6 {      

	public static void main(String[] args) {
		final char DECO = '*'; // 상수는 대문자
		int count = (int)(Math.random()*20);
		for(int n=0; n < count; n++) // 제어변수 n 
			System.out.print(DECO);		
	}
}
