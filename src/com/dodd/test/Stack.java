/**
 * 
 */
package com.dodd.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Dodd
 *
 */
public class Stack {
	
	private List<Object> list;
	
	public Stack() {
		this.list = new ArrayList<>();
	}
	
	public List<Object> getList() {
		return this.list;
	}
	
	public void push(Object object) {
		this.getList().add(0, object);
	}
	
	public Object pop() {
		return this.getList().remove(0);
	}
	
	public String toString() {
		return this.getList().toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Stack localStack = new Stack();
			System.out.println("initial stack: " + localStack.toString());
			Thread.sleep(1000);
			for(int i = 1; i < 4; i++) {
				localStack.push(new Integer(i));
				System.out.println("updated stack: " + localStack.toString());
				Thread.sleep(1000);
			}
			for(int i = 1; i < 4; i++) {
				Object lifo = localStack.pop();
				System.out.println("updated stack: " + localStack.toString() + ", item popped: " + lifo);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("exception occurred: " + e.getMessage());
		}

	}

}
