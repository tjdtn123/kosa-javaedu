package day5;

public class MethodLab2 {

	public static void main(String[] args) {
		triangle('@',3);
		System.out.println();
		triangle('%',4);
		System.out.println();
		triangle('A',5);
		
	}
	
	static void triangle(char c, int row) {
		for(int i=1; i<=row; i++) { // i부터 row까지
			for(int j=row-i; j>=1; j--) {	//j는 row-1 j가 1보다 작아질때까지 j1씩 줄임
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
