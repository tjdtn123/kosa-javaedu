package day3review;

public class Whilelab1Re {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		int num2 = 1;
		System.out.println("[for 결과]");
		for(int i=1; i<=num; i++) {
			System.out.printf("%d -> %d\n", i, i*i);			
		}
		System.out.println("[while 결과]");
		while(num2 <= num) {
			System.out.printf("%d -> %d\n", num2, num2*num2);
			num2++;
		}

	}

}
