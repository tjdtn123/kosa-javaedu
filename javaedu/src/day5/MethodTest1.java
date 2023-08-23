package day5;
public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작"); //단독으로 호출 가능한건 함수, 메서드는 객체 생성을 통해 호출한다.
		printMyName();
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() 수행종료");
	}
	static void printMyName() {
		System.out.println("유니코");	
	}
}
