package day2;

public class ForTest2 {
	public static void main(String[] args) {
		 double rand;
		 for(int num=1; num <= 10; num++) { 
			 //double rand = Math.random(); 반복문 안에서 변수 생성 좋지 않다.
			    rand = Math.random();
		 		System.out.println(rand);
		 		System.out.println(rand*6);
		 		System.out.println((int)(rand*6));
		 }
	}
}
