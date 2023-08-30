package day10;

public class TVTest {
	 public static void main(String args[]) {
		 TV saleTv = new SaleTV(300000,"SALETV-1",40,1);
		 TV rentTv = new RentalTV(100000,"RENTALTV-10",42,1);
		 for(int i=1; i<=2; i++)
			 saleTv.channelUp();
		 for(int i=1; i<=3; i++)
			 rentTv.channelDown();
		 printAllTV(saleTv);
		 printAllTV(rentTv);
		 printRentalTV((Rentable)rentTv);
	 }
	 static void printAllTV(TV tv) {	
		 if(tv instanceof SaleTV) {
			 System.out.println(tv.toString());
			 ((SaleTV) tv).play();
			 ((SaleTV) tv).sale();
		 }else {
			 System.out.println(tv.toString());
			 ((RentalTV)tv).play();
		 }		 
	 }
	 static void printRentalTV(Rentable tv) {	 
		 tv.rent();
	 }
}