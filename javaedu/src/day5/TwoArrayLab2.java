package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][] cAry = {{'B','C','A','A'},{'C','C','B','B'},{'D','A','A','D'}};
		int[] iAry = new int[4];
		int cnt;
		int index=0;
		char code ='A';
		
		while(index<4) {
			cnt=0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<4; j++) {
					if(cAry[i][j] == code) {
					cnt++;
					}
				}				
			}
			iAry[index]=cnt;
			code++;			
			index++;
		}
		code = 'A';
		for(int i=0; i<4; i++) {
			System.out.printf("%c는 %d개 입니다.\n",code,iAry[i]);
			code++;
		}
	}

}
