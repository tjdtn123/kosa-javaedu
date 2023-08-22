package day2;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 32150;
		
		int totalminute = time / 60;
		System.out.println(totalminute);
		
		int hour = totalminute/60;
		int minute = totalminute%60;
		int sec = time%60;	

		
		System.out.println(hour+"시간"+minute+"분"+sec+"초");		
		

	}

}
