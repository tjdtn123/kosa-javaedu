package day4;

public class ArrayLab3 {

	public static void main(String[] args) {
		char [] java = new char[]{'J','a','v','a'};		
		for(int i=0; i<java.length; i++) {
			if(java[i]<97)
				java[i] += 32;
			else
				java[i] -= 32;				
		}
		for(char elem: java)
			System.out.println(elem);			
	}

}
