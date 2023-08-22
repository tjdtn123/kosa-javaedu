package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cntNum = 0;
		while(true) {
			int num = (int)(Math.random()*30);
			if(num == 0) {
				break;
			}
			else if(27<=num && num<=30) {
				break;
			}
			else
			System.out.printf("%d-%c, %d, 0x%x\n", num, num+64, num, num+64);
			cntNum++;
			continue;
		}
		
		System.out.println("출력횟수는 "+cntNum+" 번입니다");
		
		

	}

}
