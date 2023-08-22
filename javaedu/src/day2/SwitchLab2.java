package day2;

public class SwitchLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random() * 5) + 1;
		int b = 0;
		
		switch(a) {
			case 1 : 
				b = 300 + 50;
				break;
			case 2 :
				b = 300 - 50;
				break;
			case 3 :
				b = 300 * 50;
				break;
			case 4 :
				b = 300 / 50;
				break;
			case 5 : //default로 하는게 나음
				b = 300 % 50;
				//break;
				
		}	
		System.out.println("결과값 : " + b); // 한번은 사용하는게 좋다
		

	}

}
