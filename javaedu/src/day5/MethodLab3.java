package day5;

public class MethodLab3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 13;
		if(isEven(num1)) {
			System.out.println(num1+"은 짝수입니다.");
		} else
			System.out.println(num1+"은 홀수입니다.");
		
		if(isEven(num2)) {
			System.out.println(num2+"은 짝수입니다.");
		} else
			System.out.println(num2+"은 홀수입니다.");
		
	}
	static boolean isEven(int num) {
		boolean ox = (num % 2 == 0)?true:false;		
		return ox;
	}
}
