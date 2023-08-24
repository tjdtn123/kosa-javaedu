package day5;

public class MethodLab1 {

	public static void main(String[] args) {
		System.out.print("우리의 자바교재명은 <");
		printTitle();
		System.out.println(">입니다.");
		System.out.printf("\t가격은 %,d원입니다.", getPrice());// %,d 100단위마다 ,출력
	}														// 메서드 사용시 현재까지 내용을 어딘가에 저장하고 메서드 실행
															// = 메서드 사용은 비용이 든다.
	
	static void printTitle() {
		System.out.print("이것이 자바다");
	}
	static int getPrice() {
		return 36000;
	}
}
