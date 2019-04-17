package com.threadsafe.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton threadSafeSingleton;

	// created private constructor
	private ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {
		if (threadSafeSingleton == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (threadSafeSingleton == null) {
					threadSafeSingleton = new ThreadSafeSingleton();
				}
			}
		}
		return threadSafeSingleton;
	}

}
