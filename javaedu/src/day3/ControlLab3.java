package day3;

public class ControlLab3 {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*120)+1;
			if(num>100) {
				break;
			}
			if(num>80) {
				continue;
			}
			if(num>=50 && num<=80) {
				System.out.printf("%d : 50 이상 80이하\n%s", num,(num >= 70 && num < 80)?"*턱시팀*\n":"");
				
			}
			else if (num <50){
				System.out.printf("%d : 50미만\n%s",num, (num % 10 == 3)?"*듀크팀*\n":"");
				
			}
		}
	}

}
