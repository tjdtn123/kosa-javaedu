package day4;
public class LottoMachine1 {
	public static void main(String[] args) {
		int[] ary = new int[6]; // 로또번호를 담을 배열
		int num; 				// 난수를 담을 수
		int index = 0; 			// while문의 제어변수
		boolean ox;				// 중복을 체크할 논리형 변수
		while(index<6) {	
			ox = true;
			num = (int)(Math.random()*45)+1;	
			for(int i=0; i<index; i++) {				
				if(num ==ary[i]) {
					ox = false;					
					break;
				}				
			}
			if(ox) {
				ary[index] = num;
				index++;
			}
		}
		System.out.print("오늘의 로또번호 - ");
		for(int i=0; i<6; i++) {
			System.out.printf("%d%s", ary[i], (i < 5)?",":"\n");
		}
	}
}
