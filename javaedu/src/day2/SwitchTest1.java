package day2;

public class SwitchTest1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		
		if (num % 2 == 0) 
			System.out.println(num + " : 짝수");
		else  
			System.out.println(num + " : 홀수");
		
		
		switch (num % 2) { //int(byte,short,char), String형만 가능
			case 0 : System.out.println(num + " : 짝수");
		         	 break;
			case 1 : System.out.println(num + " : 홀수");               
		}
	}

}
