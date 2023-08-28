package day8;

class A {
	A() {
		System.out.println("A 클래스의 객체 생성~~");
	}
}

class B extends A {
	B(int num) {
		System.out.println("B 클래스의 객체 생성~~");
	}
}

class C extends B{  
	C() {
		super(10);
		System.out.println("C 클래스의 객체 생성~~");
	}
}
	
public class ABCTest {
	public static void main(String[] args) {
		new C();
	}

}

//this()가 없으면 컴파일러는 아규먼트가 없는 super()를 넣어줌 / super()매서드는 조상 호출
//this()와 super()은 둘 다 생성자 매서드의 첫 줄에 오기때문에 둘중 하나만 사용 가능
