package day9;

import mobile.*;

public class MobileTest {

	public static void main(String[] args) {
		Mobile lt = new Ltab("Ltab",500,"XYZ-20");
		Mobile ot = new Otab("Otab",1000,"ABC-501");
		printTitle();
		printMobile(lt);
		printMobile(ot);
		
		lt.charge(10);
		ot.charge(10);
		System.out.println();
		System.out.println("[10분 충전]");
		printTitle();
		printMobile(lt);
		printMobile(ot);
		
		lt.operate(5);
		ot.operate(5);
		System.out.println();
		System.out.println("[5분 통화]");
		printTitle();
		printMobile(lt);
		printMobile(ot);		

	}
	public static void printMobile(Mobile mobile) {		
		System.out.print(mobile.getMobileName()+"\t ");
		System.out.print(mobile.getBatterySize()+"\t ");
		System.out.println(mobile.getOsType());
	}
	 public static void printTitle() {
		 System.out.println("Mobile    Battery    OS");
			System.out.println("-----------------------------------");
	 } 

}
