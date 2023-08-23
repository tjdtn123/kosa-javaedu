package day5;

public class MethodLab4 {

	public static void main(String[] args) {
		int num1;
		int num2;
		for(int i=1; i<=5; i++) {
			num1=(int)(Math.random()*30)+1;
			num2=(int)(Math.random()*30)+1;
			System.out.printf("%d 와 %d 의 차는 %d 입니다.\n", num1, num2, subtraction(num1,num2));
		}
	}
	static int subtraction(int a, int b) {
		if(a>b) {
			return a-b;
		}
		else if(a<b) {
			return b-a;
		}
		else
			return 0;
	}

}
