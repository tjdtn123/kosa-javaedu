package day3;

public class ForLab5 {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 8) + 3;
		int num2 = (int)(Math.random() * 3) + 1;
		
		switch(num2) {
		case 1 :
			for(int i=1; i <= num1; i++) {
				System.out.print("*");
			}
			break;
		case 2 :
			for(int i=1; i <= num1; i++) {
				System.out.print("$");
			}
			break;
		default :
			for(int i=1; i <= num1; i++) {
				System.out.print("#");
			}							
		}
		

	}

}
// for문을 한번만 사용했으면 더 좋았을 것 같다. 