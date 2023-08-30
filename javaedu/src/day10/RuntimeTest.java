package day10;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) throws IOException {
		//Runtime r = new Runtime(); //생성자가 있긴한데 private이라 사용불가
		Runtime r = Runtime.getRuntime();
//		r.exec("c:/windows/notepad.exe");
		System.out.println(r);
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r1);
		System.out.println(r2);
		r.gc();//청소해줘
	}

}
