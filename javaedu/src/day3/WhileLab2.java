package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			int pairNum1 = (int)(Math.random()*6)+1;
			int pairNum2 = (int)(Math.random()*6)+1;
			
			System.out.println(pairNum1);
			System.out.println(pairNum2);
			if(pairNum1 != pairNum2) {
				if(pairNum1 >pairNum2) {
					System.out.println("pairNum1이 pairNum2보다 크다.");
					break;
				}
				else if(pairNum1 < pairNum2) {
					System.out.println("pairNum1이 pairNum2보다 작다");
					break;
				}
				
			}
			else
				System.out.println("게임 끝");
				break;
					
		}
	}

}
