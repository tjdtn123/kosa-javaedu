package day4;

public class ArrayLab4 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+5;
		int aryNum = 0; 
		int [] intAry = new int[num];
		
		for(int i=0; i<intAry.length; i++) {
			aryNum = (int)(Math.random()*26)+97;
			intAry[i]=aryNum;
		}	
		char [] charAry = new char[num];		
		for(int i=0; i<charAry.length; i++) 
			charAry[i] = (char) intAry[i];
		for(int i=0; i<intAry.length; i++) {
			System.out.printf("%s",(i == intAry.length-1)?intAry[i]+"\n":intAry[i]+",");
		}
		for(int i=0; i<charAry.length; i++) {
			System.out.printf("%s",(i == charAry.length-1)?charAry[i]+"\n":charAry[i]+",");			
		}		
	}
}
