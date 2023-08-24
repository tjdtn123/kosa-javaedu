package day6;

public class MethodLab5 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.printf("%d%s",getRandom(10),(i==5)?"\n":",");			
		}
		for(int i=1; i<=5; i++) {
			System.out.printf("%d%s",getRandom(10,20),(i==5)?"\n":",");
		}

	}
	public static int getRandom(int n) {
		int random = (int)(Math.random()*n)+1;
		return random;
	}
	
	public static int getRandom(int n1, int n2) {
		int random = (int)(Math.random()*(n2-n1+1))+n1;
		return random;		
	}

}
