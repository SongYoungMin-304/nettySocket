package com.example.demo;

public class TEST extends Thread {

	String thread;

	public TEST(String thread) {
		this.thread = thread;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("extends 쓰레드 : " + thread);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TEST t1 = new TEST("상속 1번");
		TEST t2 = new TEST("상속 2번");

		t1.start();
		t2.start();
		System.out.println("finish");

	}

}
