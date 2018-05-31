package com.generics.language;

import java.util.LinkedList;
import java.util.Queue;

import javax.print.attribute.standard.PrinterLocation;

/**
 * 这个类主要讲了队列操作
 * 
 * @author Think
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		/**
		 * boolen offer(E e)
		 * 入队操作，向队尾追加一个新元素
		 * 
		 */
		que.offer("One");
		que.offer("Two");
		que.offer("Three");
		que.offer("Four");
		
		System.out.println(que);
		
		/**
		 * E poll()
		 * 出队操作，从队首获取元素，获取后该元素就从队列中被删除了
		 */
		String tmp = que.poll();
		System.out.println(tmp);
		System.out.println(que);
		
		/**
		 * E peek()
		 * 引用队首元素，但不做出队操作
		 */
		tmp = que.peek();
		System.out.println(tmp);
		System.out.println(que);
	}
	
	
	
}
