package com.threadsafe.singleton.test;

import org.junit.Test;

import com.threadsafe.singleton.ThreadSafeSingleton;

public class TestThreadSafeSingleton {

	Runnable runnable = () -> {
		System.out.println(Thread.currentThread().getName() + " : " + ThreadSafeSingleton.getInstance().hashCode());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};

	@Test
	public void testSingleton() {
		Thread thread = new Thread(runnable);
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		Thread thread4 = new Thread(runnable);
		Thread thread5 = new Thread(runnable);
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
