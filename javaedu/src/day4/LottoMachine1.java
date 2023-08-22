package day4;

public class LottoMachine1 {

	public static void main(String[] args) {
		int[] ary = new int[6];
		

		System.out.print("오늘의 로또번호 - ");
		for(int i=0; i<ary.length; i++) {
			if(i == ary.length-1) {
				System.out.println(ary[i]);
			}
			else
				System.out.print(ary[i]+",");		
			
		}
	}
}
