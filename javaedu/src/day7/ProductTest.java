package day7;

class Product{
	 String name;
	 int balance;
	 int price;
	
	Product(){
		this("듀크인형",5,10000);
	}

	Product(String name, int balance, int price) {
		this.name=name;
		this.balance=balance;
		this.price=price;
	}
	
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	int getPrice() {
		return price;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product [] product = new Product[5];
		
		product[0] = new Product();
		product[1] = new Product("컴퓨터",3,500000);
		product[2] = new Product("모니터",7,200000);
		product[3] = new Product("마우스",6,30000);
		product[4] = new Product("키보드",9,110000);
		
		for(int i=0; i<5; i++) {
			System.out.printf("%s  %d %,d원\n", product[i].getName(), product[i].getBalance(),product[i].getPrice());
		}
		
	}

}
