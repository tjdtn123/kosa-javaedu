package day4;

public class ArrayLab2 {

	public static void main(String[] args) {
		int ary []=new int[10];
		int num = 0;
		int sumV =0;
		for(int i=0; i<ary.length; i++) {
			 num=(int)(Math.random()*17)+4;
			 ary[i]=num;
		}
		System.out.print("모든 원소의 값 : ");
		for(int i=0; i<ary.length; i++) {
			sumV += ary[i];
			if(i == ary.length-1) 
				System.out.print(ary[i]+"\n");
			else
			System.out.print(ary[i]+",");
		}		
		System.out.println("모든 원소의 합 : "+sumV);		
	}
}
