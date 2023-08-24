package day6;
public class MethodTest8 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		char[] returnValue = getName(true);
		System.out.println(returnValue); //println에서 char형 배열은 참조값들을 출력한다. 
		System.out.println("main() 수행종료");
	}
	static char[] getName(boolean type) {
		char ary[];
		if(type)
			ary = new char[] {'J', 'A', 'V', 'A'};
		else 
			ary = new char[] {'P', 'Y', 'T', 'H', 'O', 'N'};
		return ary;
	}
}
