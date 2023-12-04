package com.won15367.ch13_2;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		// LIFO 자료형인 stack
		Stack<String> stack1 = new Stack<String>();
		
		stack1.push("홍길동");
		stack1.push("Korea");
		stack1.push("용산");
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
		
		

	}

}
