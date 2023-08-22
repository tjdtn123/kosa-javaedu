package day3;

public class ControlLab1 {

	public static void main(String[] args) {
		int total=0;
		int cntNum=0;		
		while(true) {
			int num = (int)(Math.random()*11)+10;
			if(num % 3 == 0 || num % 5 == 0) {
				for(int i=1; i<=num; i++) {
					total += i;				
				}
				System.out.println(total);
				cntNum++;
			}
			else if(num == 11 || num == 17 || num ==19) {
				break;
			}
			else
				System.out.println("재수행");				
		}		
		System.out.println(cntNum+"회 반복함");

	}

}
