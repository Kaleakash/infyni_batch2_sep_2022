package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	String name = t.getName();
	int n = t.getPriority();
	ThreadGroup tg = t.getThreadGroup();
	System.out.println(name);
	System.out.println(n);
	System.out.println(tg.getName());
	t.setName("My Thread");
	t.setPriority(2);	// min =1 , max = 10, norm =5
	System.out.println(t);	// MAX_PRIORITY=10,MIN_PRIORITY=1,NORM_PRIORITY=5
	t.setPriority(Thread.MAX_PRIORITY);
	//t.setPriority(11);
	System.out.println(t);
	}

}
