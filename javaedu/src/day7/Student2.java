package day7;

import java.io.Serializable;

public class Student2 implements Serializable{
	String name;
	int age;
	String subject;
	
	public Student2() {
		/*name = "도우너";
		age = 10;
		subject = "과학";*/
		this("도우너", 10, "과학"); //this() 는 첫번째 행에 사용해야한다. 상속때문에
		System.out.println("디폴트생성자로 객체생성 완료!");
	}
	
	public Student2(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	public void study() {
		System.out.println(name + "힉생은 " + subject + "과목을 학습합니다.");
	}
	public String getStudentInfo() {
		return name + "-" + age; //name이랑 age는 멤버변수를 참조한다
	}
}