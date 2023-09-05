package collection;

import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		
		Product[] proAry = {new Product("p100","TV","20000"),
							new Product("p200","Computer","10000"),
							new Product("p100","MP3","700"),
							new Product("p300","Audio","1000")};

		HashSet<Product> product = new HashSet<>();
		for(int i=0; i<proAry.length; i++) {
			if(product.add(proAry[i]))
				System.out.println("성공적으로 저장되었습니다.");
			else
				System.out.println("동일한 ID의 제품이 이미 저장되어있습니다.");				
		}
		System.out.println("제품ID      제품명      가격");
		System.out.println("----------------------------");
		Product.printProduct(product);
	}
}
