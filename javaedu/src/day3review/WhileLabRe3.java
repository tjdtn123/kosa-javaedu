package day3review;

public class WhileLabRe3 {

	public static void main(String[] args) {
		int cnt = 0;
		while(true) {
			int num=(int)(Math.random()*31);
			if(num==0) {
				break;
			}
			else if(num>26) {
				break;
			}
			else {
				int a = num+64;
				System.out.printf("%d-%c, %1$d, 0x%1$x\n", num, (char)a, a);
				cnt++;
			}
			System.out.println("출력횟수는 "+cnt+"번입니다");
		}
	}
}
