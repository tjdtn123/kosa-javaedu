package day2;

public class ForTest1 {
	public static void main(String[] args) {
		 for(int num=1; num <= 10; num++)
		        System.out.println(num);
		 System.out.println();
		 for(int num=1; num <= 10; num+=2)
		        System.out.println(num);
		 for(int num=1; num <= 30; num+=2)
		        System.out.println(num);
		 //System.out.println(num); num변수는 for문 안에서만 쓰이고 사라진다.
	}
}
