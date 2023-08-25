package day7;

import java.util.Scanner;

import day6.MethodLab7;

class GradeExpr{
	int [] jumsu;
	
	GradeExpr(int [] ary){
		this.jumsu = ary;
	}
	double getAverage() {
		double sum=0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum/jumsu.length;
	}
	int getTotal() {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}
	int getGoodScore() {
		int goodScore = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i] > goodScore)
				goodScore = jumsu[i];			
		}
		return goodScore;
	}
	int getBadScore() {
		int badScore = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i] < badScore)
				badScore = jumsu[i];			
		}
		return badScore;		
	}
}
public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] ary = new int[num];
		for(int i=0; i<ary.length; i++) {
			ary[i] = sc.nextInt();
		}
		GradeExpr gradeExpr = new GradeExpr(ary);
		
		MethodLab7.printArray(ary);	
		System.out.printf("총점 : %d\n", gradeExpr.getTotal());
		System.out.printf("평균 : %f\n", gradeExpr.getAverage());
		System.out.printf("최고 점수 : %d\n", gradeExpr.getGoodScore());
		System.out.printf("최저 점수 : %d\n", gradeExpr.getBadScore());
		
	}
}
