package day4;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] score = new int[5];
		System.out.println(score);
		System.out.println(score.length);
//		System.out.println(score[0]);
//		System.out.println(score[4]);
		
		for(int i=0; i < score.length; i++)
			System.out.println(score[i]);
	
		score = new int[] {100,200,300};
		System.out.println(score);
		System.out.println(score.length);
		System.out.println(score[0]);
		System.out.println(score[2]);
		
		for(int i=0; i < score.length; i++)
			System.out.println(score[i]);
		
		for(int i=0; i < score.length; i++)
			score[i] = score[i] * 3;
		
		for(int i=0; i < score.length; i++)
			System.out.println(score[i]);
	}

}
