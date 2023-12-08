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
public class Queue {
	
	private List<Object> list;
	
	public Queue() {
		this.list = new ArrayList<>();
	}
	
	public List<Object> getList() {
		return this.list;
	}
	
	public void enqueue(Object object) {
		this.getList().add(0, object);
	}
	
	public Object dequeue() {
		return this.getList().remove(this.getList().size() - 1);
	}
	
	public String toString() {
		return this.getList().toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Queue localQueue = new Queue();
			System.out.println("initial queue: " + localQueue.toString());
			Thread.sleep(1000);
			for(int i = 1; i < 4; i++) {
				localQueue.enqueue(new Integer(i));
				System.out.println("updated queue: " + localQueue.toString());
				Thread.sleep(1000);
			}
			for(int i = 1; i < 4; i++) {
				Object fifo = localQueue.dequeue();
				System.out.println("updated queue: " + localQueue.toString() + ", item popped: " + fifo);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("exception occurred: " + e.getMessage());
		}

	}

}
