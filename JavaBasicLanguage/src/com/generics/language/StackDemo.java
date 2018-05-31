package com.generics.language;

import java.util.Deque;
import java.util.LinkedList;

public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		/**
		 * push进栈
		 * pop出栈
		 */
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		stack.push("Five");
		
		String tmp = stack.poll();
		
		System.out.println(tmp);
		System.out.print(stack);
	}
}
