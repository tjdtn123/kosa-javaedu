package day15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import day7.Book;
public class AnonyInnerLab {	
		Comparator<Book> pr(Comparator<Book> c) {
			return c;			
		}	
	

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>(5);
		books.add(new Book("자바의 정석","남궁성",27000));
		books.add(new Book("챗GPT","반병현",11700));
		books.add(new Book("스타트 스프링 부트","남가람",27000));
		books.add(new Book("Doit! 자바프로그래밍","박은중",22500));
		books.add(new Book("이것이 자바다","신용권,임경균",36000));
		for(Book book : books) {
			System.out.println(book.getBookInfo());
		}
		AnonyInnerLab anony = new AnonyInnerLab();
		Collections.sort(books,anony.pr(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {			
				if (o1.getPrice() < o2.getPrice())
					return -1;
				else if (o1.getPrice() > o2.getPrice())
					return 1;
				else 
					return 0;
				}	
		}));
															//		books.sort();
		System.out.println("[소팅 후]");
		for(Book book : books) {
			System.out.println(book.getBookInfo());
		}
	}

	
}
