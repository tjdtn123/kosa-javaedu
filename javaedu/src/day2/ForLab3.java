package day2;

public class ForLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random() * 10) +1;
		int num2 = (int)(Math.random() * 11) +30;		
		int evenNum = 0;			
			
		for(int i=num1; i <= num2; i++) {			
			if(i % 2 == 0) {			
				evenNum += i;
			}
		}
		
		System.out.println(num1 + " 부터 " + num2 + "까지의 짝수의 합 : " + evenNum);
		
		

	}

}
