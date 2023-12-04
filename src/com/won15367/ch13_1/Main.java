package com.won15367.ch13_1;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Member member1 = new Member("홍길동", 27, "010-1234-1234", "용산");
		Member member2 = new Member("이순신", 35, "010-5678-5678", "경기");
		Member member3 = new Member("홍길동", 51, "010-9999-9999", "서울");
		
		ArrayList<Member> memberlist = new ArrayList<Member>();
		
		memberlist.add(member1);
		memberlist.add(member2);
		memberlist.add(member3);
		
		for (int i=0; i<memberlist.size();i++) {
			System.out.print(memberlist.get(i).name + " ");
			System.out.print(memberlist.get(i).age + " ");
			System.out.print(memberlist.get(i).phone + " ");
			System.out.println(memberlist.get(i).address);
		}
						
	}
	
}
