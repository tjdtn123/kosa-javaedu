package day5;

public class TwoArrayLab4 {

	public static void main(String[] args) {
		int [][] ary = new int[4][];
		int [] sumAry = new int[4];
		ary[0] = new int[5];
		ary[1] = new int[3];
		ary[2] = new int[4];
		ary[3] = new int[9];
		int num1 = 10;
		int num2 = 5;
		int num3 = 11;
			
		for(int i=1; i<=5; i++) {
			ary[0][i-1] = num1*i;
		}
		for(int i=1; i<=3; i++) {
			ary[1][i-1] = num2*i;			
		}		
		for(int i=1; i<=4; i++) {
			ary[2][i-1] = num3*i;			
		}		
		for(int i=9; i>=1; i--) {
			ary[3][i-1] = i;
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<ary[i].length; j++) {
				sumAry[i] += ary[i][j];
			}			
		}
		for(int i=0; i<4; i++) {
			System.out.printf("%d행의 합은 %d 입니다.\n",i+1, sumAry[i]);
		}				
	}
}
