package day12;

import java.util.HashSet;

class Member2 {
	private int id;
	private String name;
	private String password;

	Member2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Member2) {
			Member2 m = (Member2) o;
			if (id == m.id && name.equals(m.name) && password.equals(m.password))
				return true;
		}
		return false;
	}
}
public class ObjectTest2 {
	public static void main(String args[]) {
		Member2 obj1 = new Member2(10, "자바", "duke");
		Member2 obj2 = new Member2(10, "자바", "duke");
		Member2 obj3 = new Member2(20, "자바", "duke");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(null));
		System.out.println(obj1.equals(new java.util.Date()));
		System.out.println(obj1.equals(obj3));
		HashSet<Member2> set = new HashSet<Member2>(); // ctrl shift O 자동 임포트
		System.out.println(set.add(obj1)); // boolean 형 리턴해줌
		System.out.println(set.add(obj2)); // 같은 내용의 객체면 안넣어줘야하는데 왜? HashCode와 equals를 동시에 오버라이딩 해야함
		System.out.println(set.add(obj3));
	}
}
