package day12;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample1 {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		System.out.println(set.add("자바"));
		System.out.println(set.add("카푸치노"));
		System.out.println(set.add("에스프레소"));
		System.out.println(set.add("자바")); //  HashSet.add는 boolean을 리턴 true는 중복없다는 뜻
		System.out.println("저장된 데이터의 수 = " + set.size());

		for (String s : set)			//순서x
			System.out.println(s);	

		Iterator<String> iterator = set.iterator();	//순서x
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println(set);
	}
}
