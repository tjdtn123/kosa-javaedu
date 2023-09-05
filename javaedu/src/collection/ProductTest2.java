package collection;

import java.util.Collections;
import java.util.LinkedList;

public class ProductTest2 {

	public static void main(String[] args) {
		
		Product2[] proAry = {new Product2("p100","TV","20000"),
							new Product2("p200","Computer","10000"),
							new Product2("p100","MP3","700"),
							new Product2("p300","Audio","1000")};

		LinkedList<Product2> product = new LinkedList<>();
		Collections.addAll(product,proAry);
		System.out.println("제품ID      제품명      가격");
		System.out.println("----------------------------");
		Collections.sort(product);
			System.out.println(product.toString().replace("[","").replace(", ","").replace("]", ""));		
	}
}
