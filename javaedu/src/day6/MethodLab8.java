package day6;

public class MethodLab8 {

	public static void main(String[] args) {
		System.out.println("호출 1 :"+addEven(10,2,5,13,7));
		System.out.println("호출 2 :"+addEven(11, 22, 33, 44, 55, 66));
		System.out.println("호출 3 :"+addEven());
		System.out.println("호출 4 :"+addEven(100, 101, 103));
		
	}
	static int addEven(int... p1) {
		int sumEven=0;
		for(int i=0; i<p1.length; i++) {
			if(p1[i]%2==0)
				sumEven += p1[i];
		}
		if(sumEven == 0)
			return -1;
		return sumEven;
	}

}
