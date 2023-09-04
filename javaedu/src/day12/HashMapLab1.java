package day12;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLab1 {

	public static void main(String[] args) {		
		String country;
		int population;		
		HashMap<String,Integer> cp = new HashMap<>(5);
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.print("나라이름을 입력하세요 : ");
			country = sc.next();			
			System.out.print("인구 수를 입력하세요 : ");
			population = sc.nextInt();			
			//if(cp.put(country, population) != null) { // value가 바뀔수도 있다. country와 같은 Key가 있으면 value가 들어간다.
			if(cp.containsKey(country)) {
				System.out.println("나라명 "+country+"는 이미 저장되었습니다.");
				i--;
			} else {
				cp.put(country, population);
				System.out.println("*저장되었습니다.*");
			}		
		}
		sc.close();
		System.out.println("5개가 모두 입력되었습니다.*");		
		System.out.print("입력된 데이터 : ");
				
		for(String key : cp.keySet()) {
			sb.append(key).append("(").append(cp.get(key)).append("), ");
		}
		if (sb.length() > 0) {
		    sb.setLength(sb.length() - 2); 
		}
		System.out.println(sb.toString());		
	}
}
