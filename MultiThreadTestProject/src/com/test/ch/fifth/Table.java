package com.test.ch.fifth;

public class Table {
	private final String[] buffer;
	private int head;
	private int tail;
	private int count;
	
	public Table(int count) {
		this.buffer = new String[count];
		this.head = 0; 
		this.tail = 0; 
		this.count = 0;
	}
	
	public synchronized void put(String cake) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " puts " + cake);
		while(count >= buffer.length) {
			System.out.println("...vait for table space");
			wait();
		}
		
		buffer[tail] = cake;
		tail = (tail + 1) % buffer.length;
		count++;
		notifyAll();
	}
	
	public synchronized String take() throws InterruptedException {
		while (count <= 0) {
			System.out.println("...wait for cake");
			wait();
		}
		
		String cake = buffer[head];
		head = (head+1)% buffer.length;
		count--;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " takes " + cake);
		return cake;
	}
	
	public synchronized void clear() {
		while(count > 0) {
			String cake = buffer[head];
			System.out.println("clear .." + cake);
			head = (head + 1) % buffer.length;
			count--;
		}
		head = 0;
		tail = 0;
		count = 0;
		notifyAll();
	}
}
