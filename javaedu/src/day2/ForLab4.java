package day2;

public class ForLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenNum = 0, oddNum = 0;
		
		for(int i=1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenNum += i;
			}else
				oddNum += i;
		}
		
		System.out.println("1부터 100까지의 숫자들 중에서 \n짝수의 합은 " + evenNum + "이고\n홀수의 합은 " + oddNum + "이다.");

	}

}
