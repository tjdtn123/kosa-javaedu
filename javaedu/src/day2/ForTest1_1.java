package day2;

public class ForTest1_1 {
	public static void main(String[] args) {
		int num;
		for(num=1; num <= 10; num++) //num=1;은 제어변수
		   System.out.println(num);
		System.out.println();
		for(num=1; num <= 10; num+=2)
		   System.out.println(num);
		System.out.println(num);
	}
}
