package day5;

public class MethodLab3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 13;		
		System.out.printf("%d은 %s입니다.\n", num1, (isEven(num1)? "짝수":"홀수"));
		System.out.printf("%d은 %s입니다.", num2, (isEven(num2)? "짝수":"홀수"));		
	}
	static boolean isEven(int num) {
		boolean ox = (num % 2 == 0)?true:false;		
		return ox;
	}
}
