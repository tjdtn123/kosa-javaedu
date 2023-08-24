package day6;

public class MethodLab10 {

	public static void main(String[] args) {
		int a1[] = new int[] {1,2,3,4,5};
		MethodLab7.printArray(a1);
		powerArray(a1,3);
		MethodLab7.printArray(a1);

		int a2[] = new int[] {10,20,30,40,50,60};
		MethodLab7.printArray(a2);
		powerArray(a2, 10);
		MethodLab7.printArray(a2);
	}
	static void powerArray(int[] ary, int num) { //static만 붙이면 같은 패키지 안에서만 사용가능 public까지 붙이면 다른 패키지에서도 사용가능
		if(num>=2 && num<=5)
		for(int i=0; i<ary.length; i++) {			
				ary[i] *= num;
		}
	}
}
