package day11;

import day6.MethodTest9;

public class LottoGame {
	public static void main(String[] args)  {
		int[] nums = new int[6];
		LottoMachine lotto = new LottoMachine();
		lotto.createLottoNums();		
		try {
			lotto.checkLottoNums();
		}
		catch(DuplicateException e){
			System.out.println(e.getMessage());
			return;
		}				
		nums = lotto.getNums();
		MethodTest9.printArray(nums);
	}

}
