package day5;

public class TwoArrayLab5 {

	public static void main(String[] args) {
		int[][] ary = new int[5][3];
		int num=0;
//		int jnum=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(ary[i][j]+"	");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=i; j<ary.length-i; j++) {				
				ary[j][i]= 1+num;
				//System.out.printf("ary[%d][%d] : %d\n",j,i,ary[j][i]); 로그
				num++;
			}
//			jnum++;
		}		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(ary[i][j]+"	");
			}
			System.out.println();
		}		
	}	
}
