package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		char[] dayAry = {'일','월','화','수','목','금','토'};	//요일
		int [][] hourAry= {{5,2,1,0,2,3,6},
						   {4,3,2,1,1,0,5},
						   {3,1,2,1,3,1,3},
						   {4,3,1,0,4,2,7}
						   }; //시간
		int []daySumAry = new int[7];	//일간 게임시간의 합을 담을 배열
		int []weekSumAry = new int[4];	//주간 게임시간을 담을 배열
		
		for(int i=0; i<7; i++) {			//일간 게임시간의 합
			for( int j=0; j<4; j++) {
				daySumAry[i] += hourAry[j][i];
			}
		}		
		for(int i=0; i<4; i++) {			//주간 게임시간의 합;
			for(int j=0; j<7; j++) {
				weekSumAry[i] += hourAry[i][j]; 
			}				
		}		
		for(int i=0; i<7; i++) {
			System.out.printf("%c요일 : %d시간\n",dayAry[i],daySumAry[i]);
		}
		System.out.println();
		for(int i=0; i<4; i++) {
			System.out.printf("%d주차 : %d시간\n",i+1, weekSumAry[i]);
		}
	}

}
