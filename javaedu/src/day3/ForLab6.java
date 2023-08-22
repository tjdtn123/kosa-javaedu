package day3;

public class ForLab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char A = '&';
		
		int num = (int)(Math.random() * 6) + 5;
		System.out.println(num);
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(A);
			}
			System.out.println();			
		}

	}

}
