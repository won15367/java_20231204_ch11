package com.won15367.ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		// List<리스트에 들어가는 객체를 만든 클래스>
		List<String> list1 = new ArrayList<String>();
		// 리스트는 인터페이스 이므로 자식 클래스를 통해서 선언
		
		list1.add("Korea");
		list1.add("Japan");
		list1.add("USA");
		
		int size = list1.size(); // 저장된 객체의 숫자를 반환
		System.out.println(size);
		
		System.out.println(list1.get(0));  // 인덱스를 통해서 원소를 가져온다.
		
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("");
		
		
		list1.remove(1);
		
		for (int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		
	}

}
