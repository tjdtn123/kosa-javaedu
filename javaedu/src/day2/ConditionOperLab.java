package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random() * 5) + 1;
		int b = 0;
		
		System.out.println(a);
		
		if(a == 1) {
			b = 300 + 50;
		}
		
		else if(a == 2) {
			b = 300 - 50;
		}
		else if(a == 3) {
			b = 300 * 50;
		}
		else if(a == 4) {
			b = 300 / 50;
		}
		else if (a == 5) {
			b = 300 % 50;
		}
		
		System.out.println("결과값 : " + b); // 한번은 사용하는게 좋다
		

	}

}
