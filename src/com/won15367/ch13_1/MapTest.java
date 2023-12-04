package com.won15367.ch13_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("나이", 27);
		map1.put("월급", 200);
		
		int age = map1.get("나이");
		System.out.println(age+ "\n");
		
		Set<String> KeySet = map1.keySet();
				
		Iterator<String> iter = KeySet.iterator();
		
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(map1.get(key));
			
		}
		
	}

}
