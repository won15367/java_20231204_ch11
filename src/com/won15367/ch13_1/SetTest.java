package com.won15367.ch13_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		set.add("이순신");
		set.add("김유신");
		
		
		// set객체에 이터레이터를 달아준다.
		Iterator<String> iter = set.iterator();
		
		
		while(iter.hasNext())	{
			// 이터레이터로 하나씩 반환받는다.
			System.out.println(iter.next());
		}
		
	}

}
