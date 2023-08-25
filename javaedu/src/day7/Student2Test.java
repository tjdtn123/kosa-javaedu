package day7;

class Student2{
	String name;
	int age;
	String subject;
	
	Student2(){
		/*name = "도우너";
		age = 10;
		subject = "과학";*/
		this("도우너", 10, "과학"); //this() 는 첫번째 행에 사용해야한다. 상속때문에
		System.out.println("디폴트생성자로 객체생성 완료!");
	}
	
	Student2(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	void study() {
		System.out.println(name + "힉생은 " + subject + "과목을 학습합니다.");
	}
	String getStudentInfo() {
		return name + "-" + age; //name이랑 age는 멤버변수를 참조한다
	}
}

public class Student2Test {
	public static void main(String[] args) {
		Student2 st1 = new Student2("둘리",10,"영어");
		System.out.println(st1);
		Student2 st2 = new Student2("또치",11,"수학");
		System.out.println(st2);
		Student2 st3 = new Student2();
		System.out.println(st3);
		st1.study();
		System.out.println(st1.getStudentInfo());
		st2.study();
		System.out.println(st2.getStudentInfo());
		st3.study();
		System.out.println(st3.getStudentInfo());
	}
}
