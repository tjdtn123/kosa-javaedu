package collection;

public class Product2 implements Comparable<Product2>{
	
	private String productID;
	private String productName;
	private String productPrice;	
	
	public Product2(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public int compareTo(Product2 o) {
		if(Integer.parseInt(productPrice) > Integer.parseInt(o.productPrice)) return -1;
		else if(productPrice == o.productPrice) return 0;
		else return 1;
	}

	public String toString() {
		return String.format("%-8s  %-8s  %,d원\n", productID,productName,Integer.parseInt(productPrice));
	}
	
	
}
