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
		switch(grade) {
			case 1 : bonus += 100;
				break;
			case 2 : bonus += 90;
				break;
			case 3 : bonus += 80;
				break;
			default : bonus += 70;
		}		
		return bonus;
	}
}
public class SalaryExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int grade = sc.nextInt();
		SalaryExpr sal = new SalaryExpr(100);
		if(month % 2 == 0) {
			sal.getSalary(grade);
		}
		System.out.printf("%d월 %d 등급의 월급은 %d입니다.\n",month,grade,sal.bonus);				
		sc.close();
	}
}
