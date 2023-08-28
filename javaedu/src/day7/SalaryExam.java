package day7;

import java.util.Scanner;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		this(0);
	}
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	int getSalary(int grade){
		if(grade == 1) {
			return bonus + 100;
		}else if(grade == 2) {
			return bonus + 90;
		}else if(grade == 3) {
			return bonus + 80;
		}else
			return bonus + 70;
		
	}
}
public class SalaryExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int grade = sc.nextInt();
		SalaryExpr sal = new SalaryExpr(100);
		System.out.printf("%d월 %d 등급의 월급은 %d입니다.\n",month,grade,(month % 2 == 0)?sal.getSalary(grade):sal.bonus);					
		sc.close();
	}
}
