package day8;

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


public class FriendTest {
	public static void main(String[] args) {
		Friend [] frd = new Friend[5];
		frd[0] = new Friend("이성수","01091860648","tjdtndlwkd@naver.com");
		frd[1] = new Friend("홍길동","01034543451","ghdrlfehd@naver.com");
		frd[2] = new Friend("아무개","01023457123","dkanro@gmail.com");
		frd[3] = new Friend("김철수","01045945231","rlacjfrn@naver.com");
		frd[4] = new Friend("최영희","01038967839","rladudgml@naver.com");
		
		System.out.println("이름    	전화번호          메일주소");
		System.out.println("-------------------------------------");
		for(Friend elem : frd) {
			System.out.println(elem.getInfo());
		}

	}
}
