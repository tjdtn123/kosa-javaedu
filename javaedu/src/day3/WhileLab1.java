package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random() * 6) + 5;
		int num2 = 1;
		
		System.out.println("[for 결과]");
		for(int i=1; i<=num1; i++) {			
			System.out.println(i + "->" + i*i);
		}
		
		System.out.println("[while 결과]");
		while(num2 <= num1) {
			System.out.println(num2 + "->" + num2*num2);
			num2++;
		}

	}

}
