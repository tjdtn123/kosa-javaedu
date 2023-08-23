package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		int [][] ary = new int[4][4];
		int num = 10;
		int cross=0;
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary.length; j++) {
				ary[i][j] = num;
				num +=2;
			}
		}		
		System.out.println("1행 1열의 데이터 : " + ary[0][0]);
		System.out.println("3행 4열의 데이터 : " + ary[2][3]);
		System.out.println("행의 갯수 : " + ary.length);
		System.out.println("열의 갯수 : " + ary[0].length);
		System.out.print("3행의 데이터들 : ");
		for(int i=0; i<ary[2].length; i++) {
			System.out.print(ary[2][i]+" ");
		}
		System.out.println();
		System.out.print("2행의 데이터들 : ");
		for(int i=0; i<ary[1].length; i++) {
			System.out.print(ary[i][1]+" ");
		}
		System.out.println();
		System.out.print("왼쪽 대각선 데이터들 : ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i][cross]+" ");
			cross++;
		}
		System.out.println();
		System.out.print("오른쪽 대각선 데이터들 : ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i][cross-1]+" "); // 03,12,21,30
			cross--;
		}
	}
}
