package day9;

public class PolyTest {

	public static void main(String[] args) {
		printObjInfo(new Object());
		printObjInfo("가나다");
		printObjInfo(new String("abc"));
		printObjInfo(new java.util.Date());
		printObjInfo(new java.io.File("c:\\"));
		printObjInfo(new int[10]);
		printObjInfo(new double[5]);
		printObjInfo(Integer.valueOf(100));
		printObjInfo(10); // int으로 인식
	}
	static void printObjInfo(Object o) {
		if (o instanceof String) {
			System.out.println("문자열 객체가 전달됨 : "+
						o.toString()+"-"+((String)o).length() ); // . 연산자는 우선순위가 제일 높다
			String s = (String)o;
		} else
			System.out.println("전달된 객체의 클래스명(타입) : " + o.getClass().getName());
	}
}
