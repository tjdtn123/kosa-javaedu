package day4;

public class ArrayTest_1 {
	/*
	 * for(변수 선언 : 배열객체 또는 걸렉션객체)
	 *     반복문장;
	 * enhanced for문은 무조건 순서대로 하나씩 가져온다.
	 * */

	public static void main(String[] args) {
		int score[] = {100,200,300};		

		for(int elem : score)
			System.out.println(elem);
		
		for(int i=0; i < score.length; i++)
			score[i] = score[i] * 3;
		
		for(int elem : score)
			System.out.println(elem);
	}

}
