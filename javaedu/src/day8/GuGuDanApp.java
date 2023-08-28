package day8;

class GuGuDanExpr extends Multiplication{
	GuGuDanExpr(){
		
	}
	GuGuDanExpr(int dan){
		super(dan);
	}
	GuGuDanExpr(int dan, int number){
		super(dan,number);
	}	
	public static void printAll() {
		for(int dan = 1; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++)
				System.out.print(dan + "*" + num + "=" + dan*num + "\t");		
			System.out.println();
		}
	}
}
public class GuGuDanApp {
	public static void main(String[] args) {
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		GuGuDanExpr gugu;
		if((dan>=1 && dan<=9) && (number>=1 && number<=9)){
			 gugu = new GuGuDanExpr(dan,number);
			 System.out.printf("%d * %d = ",dan,number);
			 gugu.printPart();			 
		} else if((dan>=1 && dan<=9) && number >= 10) {	
			gugu = new GuGuDanExpr(dan);
			System.out.print(dan+"단 :");	
			gugu.printPart();	
		} else {
			gugu = new GuGuDanExpr(dan,number);
			GuGuDanExpr.printAll();	
		}				
	}
}
