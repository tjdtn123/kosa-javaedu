package day12;

import java.util.LinkedList;

class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person{
	private String phoneNum;
	private String email;
	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	public String getInfo() {
		return super.getInfo()+"\t"+phoneNum+"\t"+email;
	}
}


public class LinkedListLab1 {
	public static void main(String[] args) {
		
		LinkedList<Friend> friend = new LinkedList<Friend>();
		friend.add(new Friend("이성수","01091860648","tjdtndlwkd@naver.com"));
		friend.add(new Friend("홍길동","01034543451","ghdrlfehd@naver.com"));
		friend.add(new Friend("아무개","01023457123","dkanro@gmail.com"));
		friend.add(new Friend("김철수","01045945231","rlacjfrn@naver.com"));
		friend.add(new Friend("최영희","01038967839","rladudgml@naver.com"));

		System.out.println("이름    	전화번호          메일주소");
		System.out.println("-------------------------------------");
		for(Friend elem : friend) {
			System.out.println(elem.getInfo());
		}

	}
}
