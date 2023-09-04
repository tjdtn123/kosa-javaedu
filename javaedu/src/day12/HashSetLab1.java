package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashSetLab1 {

	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<>();		
		Random ran = new Random();	
		int num;
		
		for(int i=1; i<=10; i++) {			
			if(nums.add(ran.nextInt(21)+10) == false) {
				i--;				
			}			
		}		
		System.out.print("오늘의 로또 번호 : ");
		Iterator<Integer> iterator = nums.iterator();
		while (iterator.hasNext()) {			
			System.out.printf("%d%s",iterator.next(),(iterator.hasNext())?", ":"");
			
		}
	}

}
