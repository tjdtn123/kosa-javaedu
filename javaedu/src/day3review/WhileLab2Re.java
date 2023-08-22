package day3review;

public class WhileLab2Re {

	public static void main(String[] args) {
		while(true) {
			int pairNum1 = (int)(Math.random()*6)+1;
			int pairNum2 = (int)(Math.random()*6)+1;
			if(pairNum1>pairNum2) {
				System.out.println("pairNum1이 pairNum2보다 크다");
			}
			else if(pairNum1<pairNum2) {
				System.out.println("pairNum1이pairNum2보다 작다");
			}
			else
				System.out.println("게임끝");
			break;	
		}
	}
}
