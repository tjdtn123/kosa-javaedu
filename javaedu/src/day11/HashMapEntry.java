package day11;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntry {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>(5);
		map.put("한국", 123651414);
		map.put("중국", 12356714);
		map.put("미국", 123835674);
		map.put("일본", 1231345614);
		map.put("프랑스", 1347858564);
		
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append("(").append(entry.getValue()).append("), ");
		}
		
		if(sb.length() > 0) {
			sb.setLength(sb.length()-2);
		}
		System.out.println(sb);

	}

}
