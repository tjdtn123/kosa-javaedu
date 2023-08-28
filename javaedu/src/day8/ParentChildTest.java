package day8;
class Parent {  
	int x = 1, y = 2;
	public String toString() {  
		return "Parent 클래스의 객체 입니당";
	}	
}
class Child extends Parent {
	int x = 10;
	void printInfo() {
		int x = 100;
		System.out.println(x);			//	100
		System.out.println(this.x);		//  10
		System.out.println(super.x);	//	1
		System.out.println(y);			//  2	
		System.out.println(this.y);		//	2
		System.out.println(super.y);	//  2	
		//System.out.println(z);
	}
	public String toString() {
		return "Child 클래스의 객체 입니당";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("출력 1-" + p);
		
		day7.Card c = new day7.Card();
		System.out.println(c.toString());
		System.out.println("출력 2-" + c);
		
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString()); //오버라이딩
		System.out.println("출력 3-" + d);
		
		Child ch = new Child();
		System.out.println("출력 4-" + ch);
		ch.printInfo();
		System.out.println(ch.x);
		System.out.println(ch.y);
	}
}

//String toString() : 객체에 대한 정보를 하나의 문자열로 리턴
//public 누구나 protected 같은 패키지나 자손 private 하나의 클래스 안에서만 default 같은 패키지 안에서 