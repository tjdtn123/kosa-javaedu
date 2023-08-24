package day6;

public class MethodLab7 {

	public static void main(String[] args) {
		printArray(powerArray(2));
		printArray(powerArray(3));
		printArray(powerArray(4));		
	}
	static int[] powerArray(int num) {
		int [] ary = new int[10];
		for(int i=1; i<=10; i++) {
			ary[i-1]=i;
		}
		
		for(int i=0; i<10; i++) {
			ary[i]*=num;
		}		
		return ary;
	}	
	static void printArray(int[] ary) {
		for(int elem : ary){
			System.out.printf("%d%s",elem,(elem==ary[ary.length-1])?"\n":",");
		}
	}
}
