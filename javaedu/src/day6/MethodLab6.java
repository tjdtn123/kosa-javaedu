package day6;

public class MethodLab6 {

	public static void main(String[] args) {
		int [] ary1 = {10,20,30};
		int [] ary2 = {100,500,300,200,400};
		int [] ary3 = {1,10,3,4,5,7,6,5,9,2};
		
		System.out.printf("가장 큰값은 %d 입니다.\n", maxNumArray(ary1));
		System.out.printf("가장 큰값은 %d 입니다.\n", maxNumArray(ary2));
		System.out.printf("가장 큰값은 %d 입니다.\n", maxNumArray(ary3));		
	}
	
	static int maxNumArray(int[] num) {
		int maxValue = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i]>maxValue)
				maxValue = num[i];			
		}
		return maxValue;		
	}
}
