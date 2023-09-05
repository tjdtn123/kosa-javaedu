package collection;

import java.util.HashSet;
import java.util.Objects;

public class Product {
	
	private String productID;
	private String productName;
	private String productPrice;	
	
	public Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productID == other.productID;
	}
	public static void printProduct(HashSet<Product> product) {		
		for(Product elem : product) {
			System.out.printf("%-8s  %-8s  %-8s\n",elem.getProductID(),elem.getProductName(),elem.getProductPrice());
		}
	}
	
	public String getProductID() {
		return productID;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductPrice() {
		return productPrice;
	}
	
	public String toString() {
		return String.format("%-8s  %-8s  %-8s\n", productID,productName,productPrice);
	}
	
	
}
