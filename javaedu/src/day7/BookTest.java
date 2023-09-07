package day7;



public class BookTest {

	public static void main(String[] args) {
		Book [] book = new Book[5];
		book[0] = new Book();
		book[1] = new Book("햄릿","윌리엄 셰익스피어",10000);
		book[2] = new Book("동물농장","조지 오웰",11000);
		book[3] = new Book("허클베리 핀의 모험","마크 트웨인",12000);
		book[4] = new Book("파리대왕","윌리엄 골딩",13000);
		for(int i=0; i<5; i++) {
			System.out.printf("%s  %s  %,d원\n", book[i].title, book[i].author,book[i].price);
		}
		
	}

}
