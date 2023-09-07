package day7;

public class Book{
	String title;
	String author;
	int price ;
	
	public Book(){
		this("이것이 자바다","신용권,임경균",36000);
	}
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
		
	public int getPrice() {
		return price;
	}

	public String getBookInfo() {
		return String.format("제목 : %s\t저자 : %s\t가격 : %d",title,author,price);
	}
	
	
}