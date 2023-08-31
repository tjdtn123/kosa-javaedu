package day11;

import java.util.Random;
public class LottoMachine {
	private int[] nums;
	
	LottoMachine(){
		nums = new int[6];
	}	
	public void createLottoNums() {
		
		Random random = new Random();
		for(int i=0; i<6; i++) {
			nums[i] = random.nextInt(19)+1;
		}	
	}
	public void checkLottoNums() throws DuplicateException{
		int cnt;		
			for(int i=0; i<6; i++) {
			cnt = 0;		
				for(int j=0; j<6; j++) {
					if(nums[i] == nums[j]) 
						cnt++;							
				}					
				if(cnt>1)
					throw new DuplicateException();				
			}		
	}
	public int[] getNums() {
		return nums;
	}
}
